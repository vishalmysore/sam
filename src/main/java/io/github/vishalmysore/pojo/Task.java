package io.github.vishalmysore.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Task {
    private String assignedTo;
    private String priority;
    private String status;
    private int completion;
}
