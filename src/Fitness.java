import model.Boxing;
import model.Crossfit;
import model.Jogging;
import model.Training;

import java.math.BigDecimal;

public class Fitness {

  public static void main(String[] args) {

    Training[] trainings = {
        new Jogging(125, 60, 90, 10),
        new Jogging(120, 50, 90, 10),
        new Crossfit(130, 100, 87, 100),
        new Boxing(140, 100, 87)
    };



    for (Training training : trainings) {
      training.getStatus();
    }


  }
}
