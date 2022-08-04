package observer;

public class ForecastDisplay implements Observer, DisplayElement {
  private float temperature;
  private Subject weatherData;

  public ForecastDisplay(Subject weatherData) {
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
    System.out.println("Forecast: Watch out for cooler, rainy weather");
  }
}
