package io.github.vishalmysore.pojo;

import com.t4a.annotations.ListType;
import com.t4a.annotations.MapKeyType;
import com.t4a.annotations.MapValueType;
import lombok.*;

import java.util.List;
import java.util.Map;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProjectDashboard {
    @MapKeyType(String.class)
    @MapValueType(Double.class)
    private Map<String, Double> featuresImplemented; // Map of quarter to percentage
    @MapKeyType(String.class)
    @MapValueType(Double.class)
    private Map<String, Double> expenses; // Map of quarter to percentage
    @ListType(ProjectStatus.class)
    private List<ProjectStatus> projectStatuses; // List of project status entries
    @ListType(Task.class)
    private List<Task> tasks; // List of tasks
    @ListType(String.class)
    private List<String> criticalItems; // List of critical items
    @ListType(String.class)
    private List<String> blockers;
}
