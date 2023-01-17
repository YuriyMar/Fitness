package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Training {

  public Training(int bitting, int time, double weight) {
    this.setBitting(bitting);
    this.setTime(time);
    this.setWeight(weight);
    this.energy = new BigDecimal(0.014 * this.weight * this.time * (0.12 * this.bitting - 7))
        .setScale(2, RoundingMode.HALF_UP)
        .doubleValue();
  }


  private int bitting;
  private int time;
  private double weight;
  private double energy;

  protected void setBitting(int bitting) {
    if (bitting<=0) { throw new RuntimeException("Средний пульс за тренировку должен быть больше 0!!! "); }
    this.bitting = bitting;
  }

  protected int getTime() {
    return time;
  }

  protected void setTime(int time) {
    if (time<=0) { throw new RuntimeException("Длительность тренировок должна быть больше 0!!! "); }
    this.time = time;
  }

  protected void setWeight(double weight) {
    if (weight<=0) { throw new RuntimeException("Вес спортсмена должен быть больше 0!!! "); }
    this.weight = weight;
  }

  protected double getEnergy() {
    return energy;
  }

  public abstract void getStatus();

}
