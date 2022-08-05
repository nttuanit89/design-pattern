package factory;

public class NYPizzaStore extends PizzaStore {
  @Override
  public Pizza createPizza(PizzaType type) {
    if (type == PizzaType.CHEESE) {
      return new NYStyleCheesePizza();
    } else if (type == PizzaType.VEGGIE) {
      return new NYStyleVeggiePizza();
    }
    else return null;
  }
}
