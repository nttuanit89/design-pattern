package factory;

public class ChicagoPizzaStore extends PizzaStore {
  @Override
  public Pizza createPizza(PizzaType type) {
    if (type == PizzaType.CHEESE) {
      return new ChicagoStyleCheesePizza();
    } else if (type == PizzaType.VEGGIE) {
      return new ChicagoStyleVeggiePizza();
    }
    else return null;
  }
}
