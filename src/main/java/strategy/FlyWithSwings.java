package strategy;

public class FlyWithSwings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I'm flying!");
  }
}
