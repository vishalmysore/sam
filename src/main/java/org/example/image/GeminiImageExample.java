package org.example.image;


import com.t4a.annotations.MapValueType;
import com.t4a.processor.AIProcessingException;
import com.t4a.processor.GeminiImageActionProcessor;
import lombok.extern.java.Log;
import org.example.pojo.*;

import java.util.Map;

@Log
public class GeminiImageExample {

    public static void main(String[] args) throws AIProcessingException {
        GeminiImageActionProcessor processor = new GeminiImageActionProcessor();
        ProjectDashboard projectDashboard = (ProjectDashboard) processor.imageToPojo(GeminiImageExample.class.getClassLoader().getResource("images/RAG.PNG"), ProjectDashboard.class);
        log.info(projectDashboard.toString());
        /*
        FoodConsumption foodConsume = (FoodConsumption) processor.imageToPojo(GeminiImageExample.class.getClassLoader().getResource("images/PieChart.PNG"), FoodConsumption.class);
        log.info(foodConsume.toString());
        log.info(processor.imageToPojo(GeminiImageExample.class.getClassLoader().getResource("images/FruitsSold.PNG"), WeeklyFruitSales.class).toString());

        log.info(processor.imageToPojo(GeminiImageExample.class.getClassLoader().getResource("images/library.PNG"), LibraryScreen.class).toString());
        String jsonStr = processor.imageToJson(GeminiImageExample.class.getClassLoader().getResource("images/auto.PNG"),"Full Inspection");
        log.info(jsonStr);
        jsonStr = processor.imageToJson(GeminiImageExample.class.getClassLoader().getResource("images/auto.PNG"),"Full Inspection","Tire Rotation","Oil Change");
        log.info(jsonStr);
        jsonStr = processor.imageToJson(GeminiImageExample.class.getClassLoader().getResource("images/auto.PNG"), AutoRepairScreen.class);
        log.info(jsonStr);
        jsonStr = processor.imageToJson(GeminiImageExample.class.getClassLoader().getResource("images/fitness.PNG"), MyGymSchedule.class);
        log.info(jsonStr);
        Object pojo = processor.imageToPojo(GeminiImageExample.class.getClassLoader().getResource("images/fitness.PNG"), MyGymSchedule.class);
        log.info(pojo.toString());
        pojo = processor.imageToPojo(GeminiImageExample.class.getClassLoader().getResource("images/auto.PNG"), AutoRepairScreen.class);
        log.info(pojo.toString());

        log.info(processor.imageToPojo(GeminiImageExample.class.getClassLoader().getResource("images/sales.PNG"), Sales.class).toString());


         */

    }

}
