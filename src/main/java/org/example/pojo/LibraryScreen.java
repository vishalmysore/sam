package org.example.pojo;

import com.t4a.annotations.ListType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class LibraryScreen {
    @ListType(Book.class)
    private List<Book> latestBooks;
    @ListType(Member.class)
    private List<Member> members;
}
