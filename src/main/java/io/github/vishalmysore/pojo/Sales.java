package io.github.vishalmysore.pojo;

import com.t4a.annotations.MapKeyType;
import com.t4a.annotations.MapValueType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Sales {

    @MapKeyType(Integer.class)
    @MapValueType(Double.class)
    Map<Integer,Double> yearlySales;
}
