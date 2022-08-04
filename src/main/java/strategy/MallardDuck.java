package strategy;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithSwings();
  }

  @Override
  public void display() {
    System.out.println("I'm really a Mallard duck");
  }
}
