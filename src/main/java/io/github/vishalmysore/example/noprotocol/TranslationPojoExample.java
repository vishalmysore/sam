package io.github.vishalmysore.example.noprotocol;


import com.t4a.processor.AIProcessingException;
import com.t4a.transform.OpenAIPromptTransformer;
import io.github.vishalmysore.pojo.MyTranslatePojo;

public class TranslationPojoExample {
    public static void main(String[] args) throws AIProcessingException {
        OpenAIPromptTransformer tra = new OpenAIPromptTransformer();
        String promptTxt = "paneer is so good";
        MyTranslatePojo myp = (MyTranslatePojo)tra.transformIntoPojo(promptTxt,MyTranslatePojo.class.getName());
        System.out.println(myp);
    }
}
