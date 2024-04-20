package org.example.webtesting;

import com.t4a.annotations.MapKeyType;
import com.t4a.annotations.MapValueType;
import com.t4a.annotations.Prompt;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class DriverActions {
    @Prompt(describe = "This is the action on selenium driver get,findElement,findElements")
    String typeOfActionToTakeOnWebDriver;

}
