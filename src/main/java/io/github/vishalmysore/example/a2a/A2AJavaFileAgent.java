package io.github.vishalmysore.example.a2a;

import com.t4a.processor.AIProcessingException;
import io.github.vishalmysore.a2a.client.LocalA2ATaskClient;

import io.github.vishalmysore.a2a.domain.FileContent;
import io.github.vishalmysore.a2a.domain.FilePart;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class A2AJavaFileAgent {
    public static void main(String[] args) throws AIProcessingException {
        // Create and configure Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("io.github.vishalmysore.a2a", "io.github.vishalmysore.a2a.server", "io.github.vishalmysore.exec.a2a");
        context.refresh();
        // Get the client from Spring context
        LocalA2ATaskClient client = context.getBean(LocalA2ATaskClient.class);
        FilePart filePart = new FilePart();
        FileContent fileContent = new FileContent();
        String urlString ="https://raw.githubusercontent.com/spMohanty/PlantVillage-Dataset/master/raw/color/Corn_(maize)___healthy/00031d74-076e-4aef-b040-e068cd3576eb___R.S_HL%208315%20copy%202.jpg";
        fileContent.setUri(urlString);
        filePart.setFile(fileContent);
        client.sendFileTask(filePart);

    }
}
