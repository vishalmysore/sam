package org.example.pojo;

import com.fasterxml.jackson.databind.DatabindException;
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
    private Date membershipStart;
    private int booksLoaned;
    // Constructors, getters, and setters
}
