package io.github.vishalmysore.pojo;

import com.t4a.annotations.Prompt;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class MyTranslatePojo {
    @Prompt(describe = "translate to Hindi")
    String answerInHindi;
    @Prompt(describe = "translate to Punjabi")
    String answerInPunJabi;

    @Prompt(describe = "translate to Tamil")
    String answerInTamil;
}
