package WeatherProject;

public class Weather {

    private String city;

    private double temperature;

    private double humidity;

    public Weather(String city, double temperature, double humidity) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Weather() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}

