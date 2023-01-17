package model;

public class Boxing extends Training {

  public Boxing(int bitting, int time, double weight) {
    super(bitting, time, weight);
  }

  @Override
  public void getStatus() {
    System.out.println(
        "Тренировка по кикбоксингу! Длительность: " + this.getTime() + " минут. Килокалорий: "
                + this.getEnergy()

    );
  }
}