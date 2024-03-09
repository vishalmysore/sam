<div align="center">
  <a href="https://www.linkedin.com/posts/vishalrow_ai-appdevelopment-actions-activity-7171302152101900288-64qg?utm_source=share&utm_medium=member_desktop">
    <img src="tools4ai.png"  width="300" height="300">
  </a>
</div>
<p align="center">
    <img  src="https://api.visitorbadge.io/api/visitors?path=https%3A%2F%2Fgithub.com%2Fvishalmysore%2Ftools4ai&countColor=black&style=flat%22">
    <a target="_blank" href="https://github.com/vishalmyore/tools4ai"><img src="https://img.shields.io/github/stars/vishalmysore/tools4ai?color=black" /></a>    
</p>

## Simple Language Model 

This is reference implementation of Tool4AI project  https://github.com/vishalmysore/Tools4AI
Basically showcasing how straight forward it is to build action oriented applications in 100% Java 

```mvn clean install```

Just this 2 lines will predict the action and execute it 

```
 ActionProcessor processor = new ActionProcessor();
 String result = (String)processor.processSingleAction("My friends name is Vishal ,I dont know what to cook for him today. Also I want to take him out to park today");
```

Create custom action by implementing ```AIAction ``` interface  
Or add actions in Shell or HTTP config files  

You can add Human In Loop validation , Explainablity , Multi Command Processor, Hallucination Detector , Bias Detector , Database and Tibco actions as well
please look at https://github.com/vishalmysore/Tools4AI for more information

## Java Doc
https://javadoc.io/doc/io.github.vishalmysore/tools4ai/latest/com/t4a/api/AIAction.html

## MVN Dependency 

https://repo1.maven.org/maven2/io/github/vishalmysore/tools4ai/
