package model;

public class Crossfit extends Training {

  public Crossfit(int bitting, int time, double weight, double maxToolWeight) {
    super(bitting, time, weight);
    this.maxToolWeight = maxToolWeight;
  }

  private double maxToolWeight;

  @Override
  public void getStatus() {
    System.out.println(
        "Кроссфит тренировка! Длительность " + this.getTime() + " минут. Средний вес штанги: " +  maxToolWeight +
        " кг. " + " Килокалорий: " + this.getEnergy()
    );
  }
}
