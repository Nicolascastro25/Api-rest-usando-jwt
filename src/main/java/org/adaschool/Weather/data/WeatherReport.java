package org.adaschool.Weather.data;

public class WeatherReport {

    private double temperature;
    private double humidity;
    private double pressure;
    private String city;

    private String country;

    private String region;


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

    public double getPressure() {return pressure;}

    public void setPressure(double pressure) {this.pressure = pressure;}

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public String getCountry() {return country;}

    public void setCountry(String country) {this.country = country;}

    public String getRegion() {return region;}

    public void setRegion(String region) {this.region = region;}
}
