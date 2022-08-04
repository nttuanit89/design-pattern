package observer;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float temperature;
  private Subject weatherData;

  public StatisticsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    display();
  }

  @Override
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + temperature + "/" + temperature + "/" + temperature);
  }
}
