<div align="center">
  <a href="https://www.linkedin.com/posts/vishalrow_ai-appdevelopment-actions-activity-7171302152101900288-64qg?utm_source=share&utm_medium=member_desktop">
    <img src="tools4ai.png"  width="300" height="300">
  </a>
</div>
<p align="center">
    <img  src="https://api.visitorbadge.io/api/visitors?path=https%3A%2F%2Fgithub.com%2Fvishalmysore%2Ftools4ai&countColor=black&style=flat%22">
    <a target="_blank" href="https://github.com/vishalmyore/tools4ai"><img src="https://img.shields.io/github/stars/vishalmysore/tools4ai?color=black" /></a>    
</p>

# 🎬 Simple Action Model - SAM

SAM is a reference implementation of Tool4AI project  https://github.com/vishalmysore/Tools4AI
Basically showcasing how straight forward it is to build action oriented applications in 100% Java. In addition to action model
SAM can be used as an autonomous agent by utilizing action scripts which are a specialized form of these intelligent systems, designed specifically for enterprise AI 
applications. While retaining the core capabilities of autonomy and adaptability, scripts can operates within
a controlled framework, executing tasks and making decisions that align with predefined business rules and 
objectives 

## Setup
Clone this project and then  

```mvn clean install```

## Action Processor
Action Processors are responsible for taking actions based on prompt. Actions can be written in Java Methods, Or could be 
HTTP rest end points , could be Shell scripts or could be loaded directly from the Swagger HTTP configurations.
Inside ```Main.java``` these 2 lines will predict the action and execute it using Gemini , you dont have to worry
about specifying the action, the action will be picked up based on Natural Language Processing semantic mapping
and will be executed. 

```
String cookPromptSingleText = "My friends name is Vishal ," +
                "I dont know what to cook for him today.";
GeminiActionProcessor processor = new GeminiActionProcessor();
String result = (String)processor.processSingleAction(cookPromptSingleText);
log.info(result);
```

This code will use OpenAI to predict the action and execute it 

```
OpenAiActionProcessor opeAIprocessor = new OpenAiActionProcessor();
Sring result = (String)opeAIprocessor.processSingleAction('My friends name is Vishal ,he lives in tornto.I want save this info locally');
System.out.println(result);

```

Create custom action by implementing ```JavaMethodAction ``` interface, the actionName specified in the predict annotation
is the method you need to implement. Parameters of the method can be anything and any number of parameters are allowed
You need to make sure parameters have meaningful name. 

```
@Predict(actionName = "whatFoodDoesThisPersonLike", description = "what is the food preference of this person ")
public class SimpleAction implements JavaMethodAction {

    public String whatFoodDoesThisPersonLike(String name) {
        if("vishal".equalsIgnoreCase(name))
            return "Paneer Butter Masala";
        else if ("vinod".equalsIgnoreCase(name)) {
            return "aloo kofta";
        }else
            return "something yummy";
    }

}
```
or
```
@Log
@Predict(actionName = "googleSearch", description = "search the web for information")
public class SearchAction implements JavaMethodAction {


    public String googleSearch(String searchString, boolean isNews)  {
        log.info(searchString+" : "+isNews);
        HttpResponse<String> response = Unirest.post("https://google.serper.dev/search")
                .header("X-API-KEY", PredictionLoader.getInstance().getSerperKey())
                .header("Content-Type", "application/json")
                .body("{\"q\":\""+searchString+"\"}")
                .asString();
        String resStr = response.getBody().toString();
        return resStr;
    }




}
```

Or add actions in Shell or HTTP config files  

## Image Processing and Actions
Trigger actions based directly on images! Yes, you read that right – with the power of Java, we can now integrate function calling with image inputs.

Imagine a system so advanced that it can:

🚑 Call an ambulance immediately after detecting an image of a car accident.
🍳 Suggest recipes the moment it sees images of vegetables.
👮 Alert the police when it captures an image of a traffic signal violation.
🚒 Contacts the fire department immediately if it "sees" fire.


```
public class ImageActionExample {
public static void main(String[] args) throws AIProcessingException {
GeminiImageActionProcessor processor = new GeminiImageActionProcessor();
String imageDisription = processor.imageToText(args[0]);
GeminiV2ActionProcessor actionProcessor = new GeminiV2ActionProcessor();
Object obj = actionProcessor.processSingleAction(imageDisription);
String str  = actionProcessor.summarize(imageDisription+obj.toString());
System.out.println(str);
}
}
```


## Autonomous Agent (Action Script)

If you have a complete script written in English , ScriptProcessor will process the script and provide consolidated results

```
 ScriptProcessor script = new ScriptProcessor();
 ScriptResult result =  script.process("complexTest.action");
 String resultsString = script.summarize(result)
 log.info(resultsString)

```

Sample script is here 

``` 
can you reserve the flight for Vishal from Toronto to Bangalore for 3 Days on 7th december
If flight booking is successful, can you reserve the car for Vishal from Bangalore to Toronto for 10 Days on 17th december
if car booking is successful and flight cost are less than $1000 then book the sight seeing attraction called 5 star palace
if car booking is successful and flight cost are more than $1000 then book the sight seeing attraction called peanut palace
```

You can add Human In Loop validation , Explainablity , Multi Command Processor, Hallucination Detector , Bias Detector , Database and Tibco actions as well
please look at https://github.com/vishalmysore/Tools4AI for more information

## Prompt Transformer

Prompt Transformer, a core feature in the Tools4AI project, simplifies data transformation tasks. It effortlessly converts prompts into various formats like Java POJOs, JSON strings, CSV files, and XML. By enabling direct conversion of prompts into domain-specific objects, Prompt Transformer streamlines data processing tasks. It offers flexibility and ease of use for transforming data structures to meet diverse needs in modern applications.

### Convert Prompt to Simple Pojo

Lets take the first scenario where you want to conver the prompt directly into Java Bean or Pojo

```  
PromptTransformer builder = new PromptTransformer();
String promptTxt ="Sachin Tendulkar is very good cricket player, " +
                           "he joined the sports on 24032022, he has played 300 matches " +
                           "and his max score is 400";
//Convert the prompt to Pojo
Player player = (Player)builder.transformIntoPojo(promptTxt, Player.class.getName(),"Player","create player pojo");
log.info(player.toString());
```

The above will convert the prompt into this simple Pojo 
```
import lombok.*;
import lombok.extern.java.Log;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Player {
     int matches;
     int maxScore;
     String firstName;
     String lastName;
     Date dateJoined;


}
 
```
### Convert Prompt to Complex Pojo

The transformer can also convert into complex Pojo ( where there are multiple objects inside the Pojo)

```
PromptTransformer builder = new PromptTransformer();
promptTxt = "can you book Maharaja restaurant in " +
            "Toronto for 4 people on 12th may , I am Vishal ";
//Convert the prompt to Complex Pojo
RestaurantPojo pojo = (RestaurantPojo)builder.transformIntoPojo(promptTxt, RestaurantPojo.class.getName(),"RestaurantPojo","Build the pojo for restaurant");
log.info(pojo.toString()); 
```

This will create the Pojo Object of RestaurantPojo and also populate the internal objects ( not just primitive)
```
public class RestaurantPojo {
    String name;
    int numberOfPeople;
    //Pojo inside Pojo    
    RestaurantDetails restaurantDetails;
    boolean cancel;
    String reserveDate; 
```
### Convert Prompt with Custom GSON

If you expect some custom objects like Date etc in the prompt you can have custom Gson Builder

```
//Using Custom GSON to convert special values
GsonBuilder gsonBuilder = new GsonBuilder();
gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer("dd MMMM yyyy"));
Gson gson = gsonBuilder.create();
PromptTransformer customBuilder = new PromptTransformer(gson);
String prompt = "Sachin Tendulkar is very good cricket player, he joined the sports on 12 May 2008," +
                "he has played 300 matches and his max score is 400";
player = (Player)customBuilder.transformIntoPojo(prompt, Player.class.getName(),"Player","create player pojo");
log.info(player.toString()); 
```
This will use Custom Date Serializer 

```
public class DateDeserializer implements JsonDeserializer<Date> {
    private final DateFormat dateFormat;

    public DateDeserializer(String format) {
        this.dateFormat = new SimpleDateFormat(format, Locale.ENGLISH);
    }

    @Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            return dateFormat.parse(json.getAsString().replaceAll("(st|nd|rd|th),", ","));
        } catch (ParseException e) {
            throw new JsonParseException(e);
        }
    }
} 
```

### Convert Prompt to Json String
If you want to convert the Prompt into the Json String 
``` 
 prompt = "Sachin Tendulkar is very good cricket player, he joined the sports on 12 May 2008," +
                "he has played 300 matches and his max score is 400";
 //Extract Json from the prompt
 String jsonString = "{\"lastName\":\"String\",\"firstName\":\"String\"}";
 jsonString = builder.transformIntoJson(jsonString,prompt,"player","get player details");
 log.info(jsonString);
```

The result will be 

```
"{\"lastName\":\"Tendulkar\",\"firstName\":\"Sachin\"}"; 
```
You can extract custom parameters from the prompt or can convert the entire prompt into JSON

### Convert Prompt to XML
Once you have the JSON you can convert the JSON into XML

```
JSONObject jsonObject = new JSONObject(jsonNode.toString());
String xmlString = XML.toString(jsonObject); 
```

### Break Prompt into Multiple Subprompts and take action

You can have a really long prompt with multiple actions , those prompts will be broken down in multiple subprompts
``` 
@Log
public class ActionExample {
    public static void main(String[] args) throws AIProcessingException {
        ActionProcessor processor = new ActionProcessor();
        String multiPrmpt = "hey I am in Toronto do you think i can go out without jacket," +
                " also save the weather information , City location and your suggestion in file, " +
                "also include places to see";
        String processed = processor.processMultipleActionDynamically
                (multiPrmpt, 
                        new LoggingHumanDecision(),
                        new LogginggExplainDecision());
        log.info(processed);
    }
}
```
Tools4AI will create a JSon from the prompt

```
{
  "prmpt": [
    {
      "id": "1",
      "subprompt": "What is the weather in Toronto?",
      "depend_on": null
    },
    {
      "id": "2",
      "subprompt": "Do I need a jacket in this weather?",
      "depend_on": "1"
    },
    {
      "id": "3",
      "subprompt": "Save the weather information, city location, and suggestion in a file.",
      "depend_on": "2"
    },
    {
      "id": "4",
      "subprompt": "Suggest some places to see in Toronto.",
      "depend_on": "3"
    }
  ]
}

```
After that each Subprompt will be processd independently or in dependency order, if the prompts are dependent on each other
then the result from previous prompt will be fed into the next one.



## Java Doc
https://javadoc.io/doc/io.github.vishalmysore/tools4ai/latest/com/t4a/api/AIAction.html

## MVN Dependency

https://repo1.maven.org/maven2/io/github/vishalmysore/tools4ai/