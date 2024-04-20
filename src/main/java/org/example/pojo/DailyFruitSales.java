package org.example.pojo;

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
public class DailyFruitSales {
    private String dayOfWeek;
    @MapKeyType(String.class)
    @MapValueType(Integer.class)
    private Map<String, Integer> fruitSales; // Map of fruit type to quantity sold

    // Constructor
    public DailyFruitSales(String dayOfWeek, Map<String, Integer> fruitSales) {
        this.dayOfWeek = dayOfWeek;
        this.fruitSales = fruitSales;
    }


}
