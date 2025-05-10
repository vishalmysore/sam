# 🎬 Google A2A Protocol - Java Examples

If you're looking to build Java applications using the Google A2A (Agent-to-Agent) protocol, this repository provides numerous reference examples to help you get started.
To get started you can look at [A2AJavaAgent](/src/main/java/io/github/vishalmysore/example/a2a/A2AJavaAgent.java) class, which shows how to define and trigger Google a2a tasks using natural language prompts.  

**A2AJava is the Java implementation** of the Google A2A protocol you can check the project [here](https://github.com/vishalmysore/a2ajava) .

This framework supports:

Complex Java types: Automatically convert between structured prompts and custom POJOs, including nested objects and lists.

Spring Boot integration: Seamlessly plug into your existing Spring application context.

Minimal setup: Use simple annotations like @Agent, and @Action to expose your service classes and methods as A2A-compatible agents.

```
A2AJavaAgent 
```

if you run it with this prompt 

```
String prompt
                = "hey I am in Toronto do you think i can go out without jacket";

        // Get the client from Spring context
        LocalA2ATaskClient client = context.getBean(LocalA2ATaskClient.class);

        // Send task and log response
        Task t = client.sendTask(prompt);

        log.info(client.getTask(t.getId(),2).toString());
```

you will see in the result that ``` WeatherAction``` is triggerd

similarly

```
  prompt ="Sachin Tendulkar is very good cricket player, " +
                "he joined the sports on 24032022, he has played 300 matches " +
                "and his max score is 400. Can you send him a congratulations email 
```

will trigger 

```
@Agent(groupName = "player", groupDescription = "Player and sports related action")
public class NotifyPlayerAction  {
```

 
To know more about how to build agentic java applications please continue reading the below articles .  

# Features and Articles on Agentic Java applications 
- **AI Agent Processor**: Execute actions based on prompt (OpenAI, Gemini, Anthropic) [here](https://www.linkedin.com/pulse/large-action-model-gemini-java-vishal-mysore-qki8c?trackingId=MuqKH2YZNwe74wisqhMSuw%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Image Processor**: Trigger actions based on images [here](https://www.linkedin.com/pulse/image-recognition-function-calling-gemini-java-vishal-mysore-sz5zc?trackingId=lpJITsmYD0XPgdaG676jmA%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Autonomous AI Agent**: Execute tasks based on scripts [here](https://www.linkedin.com/pulse/enterprise-ai-hub-llm-agent-built-openai-java-vishal-mysore-0p7oc?trackingId=qE91gQ%2Bngtn4vI45pxJEgg%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Image to Text**: Convert images to text[here](https://www.linkedin.com/pulse/selenium-ai-automation-image-processing-gemini-vishal-mysore-fihwc?trackingId=8N9y2fCuYRDzmju9dREwVw%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Image to Pojo**: Convert images to Pojo [here](https://www.linkedin.com/pulse/selenium-ai-automation-image-processing-gemini-vishal-mysore-fihwc?trackingId=8N9y2fCuYRDzmju9dREwVw%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Image to Json**: Convert images to Json [here](https://www.linkedin.com/pulse/selenium-ai-automation-image-processing-gemini-vishal-mysore-fihwc?trackingId=8N9y2fCuYRDzmju9dREwVw%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Image to XML**: Convert images to XML[here](https://www.linkedin.com/pulse/selenium-ai-automation-image-processing-gemini-vishal-mysore-fihwc?trackingId=8N9y2fCuYRDzmju9dREwVw%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Selenium AI Agent**: Execute actions based on Selenium script [here](https://www.linkedin.com/pulse/selenium-ai-automation-image-processing-gemini-vishal-mysore-fihwc/?trackingId=r0XIS0PtQZWrCqbgZwLbww%3D%3D)
- **Spring AI Agent Integration**: Integrate with Spring Boot [here](https://www.linkedin.com/pulse/spring-action-integrating-ai-applications-vishal-mysore-ogjkc?trackingId=qsUWss8mwUVYSijqTD1SRA%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Script Processor**: Execute tasks based on scripts [here](https://www.linkedin.com/pulse/action-all-you-need-moving-beyond-conversation-ai-vishal-mysore-sukfc?trackingId=XieWREfuTm3Lsb4uZkpAdw%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Http Actions**: Execute actions based on HTTP requests [here](https://www.linkedin.com/pulse/http-endpoints-large-action-model-complete-ai-vishal-mysore-vhhmc?trackingId=Lht%2FqIlOATU5k3j8pznjKA%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Prompt Processor**: Execute tasks based on prompts [here](https://www.linkedin.com/pulse/advanced-prompt-processing-java-parallel-data-more-vishal-mysore-7gtoc?trackingId=VNYgjVXcGDpkWkLNz0JPow%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Prompt Transformer**: Convert prompts into various formats ( Java , Json , XML) [here](https://www.linkedin.com/pulse/sam-simple-action-model-java-vishal-mysore-nmwec?trackingId=wFNZtf8A30JnMvWUjJhfiA%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Custom GSON**: Convert special values in prompts [here](https://www.linkedin.com/pulse/large-action-model-gemini-java-vishal-mysore-qki8c?trackingId=MuqKH2YZNwe74wisqhMSuw%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Subprompt Processing**: Break prompts into multiple subprompts [here](https://www.linkedin.com/pulse/building-autonomous-ai-agent-java-action-scripts-vishal-mysore-p3mbf?trackingId=Y6X67pUWoycIGQHaYexn9w%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Human In Loop Validation** [here](https://www.linkedin.com/pulse/ai-development-java-gemini-vishal-mysore-7puqc?trackingId=VUqUIPcf%2BLLOR5z1kOYWwA%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Explainablity** [here](https://www.linkedin.com/pulse/enhancing-ai-decision-making-multi-ai-voting-mechanism-vishal-mysore-qlpxc?trackingId=NQ4m7eoWn97yJ50C7iBcMw%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Kubernets Integration** [here]( [here](https://www.linkedin.com/pulse/kubernetes-management-ai-using-tools4ai-vishal-mysore-d4jxc?trackingId=sBUyZg%2BykR9dTx%2FTwineiQ%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3Basc8boqLRvqWpXTf9SUEpA%3D%3D)
- **Multi Command Processor** [here](https://www.linkedin.com/pulse/enterprise-ai-hub-llm-agent-built-openai-java-vishal-mysore-0p7oc?trackingId=074SlSqIoJkEJFEkOC98QA%3D%3D&lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_recent_activity_content_view%3B68UQVWs4SiW1kIcA14PsKg%3D%3D)
- **Hallucination Detector** [here](https://www.linkedin.com/pulse/detect-ai-hallucinations-rag-routing-branching-chaining-vishal-mysore-jrzic)
- **Bias Detector** [here](https://www.linkedin.com/pulse/ai-bias-what-does-mean-vishal-mysore-0atsc)
- **Database Actions**
- **Tibco Actions**
- **Custom Actions**
- **Custom HTTP Actions**
- **Custom Shell Actions**
- **Custom Swagger Actions**
- **Custom OpenAI Actions**
- **Custom Selenium Actions**
- 

## Setup
Clone this project and then  

```mvn clean install```

## Action Processor
AI Agent Action Processors are responsible for taking actions based on prompt. Actions can be written in Java Methods, Or could be 
HTTP rest end points , could be Shell scripts or could be loaded directly from the Swagger HTTP configurations.
Inside ```Main.java``` these 2 lines will predict the action and execute it using Gemini , you dont have to worry
about specifying the action, the action will be picked up based on Natural Language Processing semantic mapping
and will be executed. 

```
String cookPromptSingleText = "My friends name is Vishal ," +
                "I dont know what to cook for him today.";
GeminiV2ActionProcessor processor = new GeminiV2ActionProcessor();
String result = (String)processor.processSingleAction(cookPromptSingleText);
log.info(result);
```

This code will use OpenAI to predict the action and execute it 

```
OpenAiActionProcessor opeAIprocessor = new OpenAiActionProcessor();
Sring result = (String)opeAIprocessor.processSingleAction('My friends name is Vishal ,he lives in tornto.I want save this info locally');
System.out.println(result);

```

Create custom action by using @Predict annotation and @Action annotation. Parameters of the method can be 
anything and any number of parameters are allowed You need to make sure parameters have meaningful name. 

```
@Agent
public class SimpleAction {

    @Action(description = "Provide persons name and then find out what does that person like")
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
@Agent
public class SearchAction  {

    @Action(description = "Search the web for information")
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