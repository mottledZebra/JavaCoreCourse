import entity.Weather;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherModel {
    void getWeather(String city, Period period) throws IOException;

    boolean saveWeatherToDB(Weather weather) throws SQLException;
    Weather getWeatherFromDB(String city);
}
