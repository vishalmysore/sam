package org.example.pojo;

import com.t4a.annotations.ListType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class WeeklyFruitSales {
    @ListType(DailyFruitSales.class)
    private List<DailyFruitSales> dailySales;

    // Constructor
    public WeeklyFruitSales(List<DailyFruitSales> dailySales) {
        this.dailySales = dailySales;
    }

    // Getter and Setter
    public List<DailyFruitSales> getDailySales() {
        return dailySales;
    }

    public void setDailySales(List<DailyFruitSales> dailySales) {
        this.dailySales = dailySales;
    }
}
