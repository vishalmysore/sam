package org.example.pojo;

import com.fasterxml.jackson.databind.DatabindException;
import com.t4a.annotations.Prompt;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Member {
    private String id;
    private String name;
    @Prompt(dateFormat = "ddMMyyyy")
    private Date membershipStart;
    private int booksLoaned;
    // Constructors, getters, and setters
}
