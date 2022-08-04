package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
  private ArrayList<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;
  private boolean changed;

  public WeatherData() {
    observers = new ArrayList<>();
    changed = false;
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(o);
    }
  }

  @Override
  public void notifyObservers() {
    if (changed) {
      for (Observer observer : observers) {
        observer.update(temperature, humidity, pressure);
      }
      changed = false;
    }
  }

  private void setChanged() {
    changed = true;
  }

  public void measurementsChanged() {
    setChanged();
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}
