package io.github.vishalmysore.pojo;

import com.t4a.annotations.MapKeyType;
import com.t4a.annotations.MapValueType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class FoodConsumption {
    @MapValueType(Double.class)
    @MapKeyType(String.class)
    private Map<String, Double> foodTypeToPercentage;
}
