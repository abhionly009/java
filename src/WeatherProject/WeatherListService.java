package WeatherProject;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherListService {



    public static double findMaxTemperature(List<Weather> data){

        Optional<Weather> max = data.stream().max(Comparator.comparing(Weather::getTemperature));

        System.out.println(max.get().getTemperature());

        return max.get().getTemperature();
    }

    public static double findMinTemperature(List<Weather> data){
        Optional<Weather> min = data.stream().min(Comparator.comparing(Weather::getTemperature));

        return min.get().getTemperature();
    }

    public static String findMaxTemperatureCity(List<Weather> data){
        Optional<Weather> max = data.stream().max(Comparator.comparing(Weather::getTemperature));

      return   max.get().getCity();
    }

    public static String findMinTemperatureCity(List<Weather> data){
        Optional<Weather> min = data.stream().min(Comparator.comparing(Weather::getTemperature));

        return   min.get().getCity();
    }

    public static void main(String[] args) {


        List<Weather> weatherList = new ArrayList<>();

        weatherList.add(new Weather("London",24.5,2));
        weatherList.add(new Weather("New York",45.0,11));
        weatherList.add(new Weather("Delhi",-3,0.9));
        weatherList.add(new Weather("Chicago",50,12));
        weatherList.add(new Weather("Tokyo",18,0.5));
        weatherList.add(new Weather("Singapore",9,0.3));

      double maxTemp =   findMaxTemperature(weatherList);

      double minTemp = findMinTemperature(weatherList);

      String maxTemperatureCity = findMaxTemperatureCity(weatherList);
      String minTemperatureCity = findMinTemperatureCity(weatherList);


        System.out.println("maximum Temperature" + maxTemp);
        System.out.println("Minimum Temperature" + minTemp);
        System.out.println("City with maximum temperature " + maxTemperatureCity);
        System.out.println("City with minimum temperature " + minTemperatureCity);


    }





}
