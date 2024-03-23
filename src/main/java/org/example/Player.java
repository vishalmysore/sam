package org.example;

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
