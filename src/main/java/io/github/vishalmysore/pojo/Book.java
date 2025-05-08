package io.github.vishalmysore.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Book {
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;
    // Constructors, getters, and setters
}
