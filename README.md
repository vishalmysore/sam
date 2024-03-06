## Simple Language Model 

```mvn clean install```

Just this 2 lines will predict the action and execute it 

```
 ActionProcessor processor = new ActionProcessor();
 String result = (String)processor.processSingleAction("cookgptserver","us-central1","gemini-1.0-pro","My friends name is Vishal ,I dont know what to cook for him today. Also I want to take him out to park today");
```

Create custom action by implementing ```AIAction ``` interface  
Or add actions in Shell or HTTP config files  
