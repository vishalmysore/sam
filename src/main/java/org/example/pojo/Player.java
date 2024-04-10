package org.example.pojo;

import com.t4a.annotations.Prompt;
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
     @Prompt(dateFormat = "ddMMyyyy")
     Date dateJoined;


}
