package model;

public class Jogging extends Training {
  private double distance;

  public Jogging(int bitting, int time, double weight, double distance) {
    super(bitting, time, weight);
    this.distance = distance;
  }

  @Override
  public void getStatus() {
    System.out.println(
        "Беговая тренировка! Длительность: " + this.getTime() + " минут. Дистанция: " +
                this.distance +" км. Килокалорий: " + this.getEnergy()
    );
  }
}
