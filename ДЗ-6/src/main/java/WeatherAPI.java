import okhttp3.*;

import java.io.IOException;

public class WeatherAPI {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("dataservice.accuweather.com")
                .addPathSegments("forecasts/v1/daily/5day/295212")
                .addQueryParameter("apikey", "R0Inucw0zARA0hL3JEh7Vbbt36AbBC6Z")
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.isSuccessful());

        String responseBody = response.body().string();
        System.out.println(responseBody);
    }
}
