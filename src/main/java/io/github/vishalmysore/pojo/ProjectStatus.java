package io.github.vishalmysore.pojo;

import com.t4a.annotations.MapKeyType;
import com.t4a.annotations.MapValueType;
import lombok.*;

import java.util.Map;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProjectStatus {
    private String projectName;
    @MapKeyType(String.class)
    @MapValueType(Integer.class)
    private Map<String, Integer> statusCounts;
}
