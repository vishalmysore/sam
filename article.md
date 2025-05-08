# Google A2A Protocol : Integrating AI into existing Java Applications 

> Transform your existing Java applications into AI-powered solutions without the need for a separate server infrastructure.

## Table of Contents
- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Agentic Actions](#agentic-actions)
  - [Weather Service](#weather-service)
  - [Google Search](#google-search)
  - [Notification System](#notification-system)
  - [File Operations](#file-operations)
- [Implementation Guide](#implementation-guide)
- [Examples](#examples)
- [Best Practices](#best-practices)

## Introduction

This guide demonstrates how to leverage the Google A2A (Agent-to-Agent) protocol to infuse AI capabilities into your existing Java applications. The A2A protocol enables seamless integration of AI functionalities without requiring a separate server infrastructure, making it an ideal solution for enhancing your business applications with AI features.

## Prerequisites

Before you begin, ensure you have:
- Java 8 or higher
- Maven or Gradle for dependency management
- Basic understanding of Spring Framework
- A2A library dependencies in your project

## Agentic Actions

The power of this solution lies in its ability to create combine  A2A protocol  with "agentic actions" - self-contained units of business logic that can be invoked through natural language processing. Let's explore some key actions that demonstrate this capability.

### Weather Service

The `WeatherAction` class demonstrates how to integrate weather data services into your application:

```java
@Log
@Agent(groupName = "Weather related actions")
public class WeatherAction  {
    @Action(description = "get weather for city")
    public double getTemperature(String cityName) {
        double temperature = 0;
        String urlStr = "https://geocoding-api.open-meteo.com/v1/search?name="+cityName+"&count=1&language=en&format=json";
        String weatherURlStr = "https://api.open-meteo.com/v1/forecast?latitude=";
```

This action integrates with the Open-Meteo geocoding API to fetch real-time weather information for any given city. The `@Agent` and `@Action` annotations make this method accessible through natural language queries via Google A2A protocol.

### Google Search Integration
```java
@Agent(groupName = "GoogleSearch", groupDescription = "Google Search")
public class GoogleSearchAction  {

    @Action(description = "search the web for information")
    public String googleSearch(String searchString, boolean isNews)  {
        //Just return random string if you do not have serper key
        //to get serper key look here https://serper.dev/
        if(PredictionLoader.getInstance().getSerperKey() == null) {
            return "jamun , jalebi";
        }
```
This action demonstrates integration with web search capabilities. While this example uses a simplified approach, you can enhance it by integrating with the Serper API for production use.

### Notification System

The notification system demonstrates how to send automated communications based on natural language triggers. For example, sending congratulatory emails to players based on their achievements.

### File Operations

The `FileWriteAction` class handles file system operations, showcasing how traditional I/O operations can be triggered through natural language commands.

## Making Your Application AI-Ready

The A2A protocol can be applied to any business-centric application. For example, consider a banking application:

```
public AccountDetails getAccountDetails(AccountInformation info) {

}
``` 

By simply adding the `@Agent` and `@Action` annotations, you can transform regular business logic into AI-accessible endpoints. The A2A protocol handles the natural language processing and routing automatically.

## Implementation Examples

Let's explore some practical examples of how natural language prompts trigger different actions through the A2A protocol:

### 1. Weather Service Integration

```java
// Initialize the A2A client
LocalA2ATaskClient client = context.getBean(LocalA2ATaskClient.class);

// Natural language query for weather information
String weatherQuery = "Hey, I am in Toronto. Do you think I need a jacket today?";
Task weatherTask = client.sendTask(weatherQuery);

// The A2A protocol automatically:
// 1. Identifies this as a weather-related query
// 2. Extracts the city name (Toronto)
// 3. Calls WeatherAction.getTemperature()
// 4. Formats a natural language response
log.info(client.getTask(weatherTask.getId(), 2).toString());
```

### 2. Automated Notifications

```java
// Natural language trigger for sending congratulations
String notificationPrompt = 
    "Sachin Tendulkar is a cricket player who joined on 24/03/2022. " +
    "He has played 300 matches with a highest score of 400. " +
    "Please send him a congratulatory email.";

Task notificationTask = client.sendTask(notificationPrompt);

// The system automatically:
// 1. Extracts player information
// 2. Generates appropriate congratulatory message
// 3. Sends the email through NotifyPlayerAction
log.info(client.getTask(notificationTask.getId(), 2).toString());
```

### 3. Restaurant Booking Integration

```java
// Natural language restaurant booking request
String bookingPrompt = "Book a table at Maharaja restaurant in " +
                      "Toronto for Sachin Tendulkar and 4 people on May 12th";
Task bookingTask = client.sendTask(bookingPrompt);

// The system processes:
// 1. Restaurant details
// 2. Number of guests
// 3. Date and time
// 4. Customer information
```

## Best Practices

1. **Action Design**
   - Keep actions focused and single-purpose
   - Use clear, descriptive names for actions
   - Include comprehensive documentation in `@Action` descriptions

2. **Error Handling**
   - Implement proper exception handling
   - Provide meaningful error messages
   - Include fallback mechanisms

3. **Testing**
   - Write unit tests for individual actions
   - Include integration tests for A2A flows
   - Test with various natural language inputs

## Conclusion

The Google A2A protocol provides a powerful way to add AI capabilities to existing Java applications. By following this guide, you can:

- Transform regular methods into AI-accessible endpoints
- Process natural language commands effectively
- Integrate multiple services seamlessly
- Maintain clean and maintainable code

The examples demonstrated here are just the beginning. The protocol's flexibility allows for integration with any business logic, making it a valuable tool for modernizing existing applications with AI capabilities.

## Next Steps

- Explore more complex action combinations
- Implement custom action handlers
- Integrate with additional APIs and services
- Contribute to the A2A community

For more information and updates, visit the [official documentation](https://github.com/google/a2a) and join the community discussions.



