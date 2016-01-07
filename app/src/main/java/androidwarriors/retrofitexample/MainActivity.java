package androidwarriors.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;

import androidwarriors.retrofitexample.POJO.City;
import androidwarriors.retrofitexample.POJO.Model;
import androidwarriors.retrofitexample.POJO.MyList;
import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    TextView city, status, humidity, pressure;
    String url = "http://api.openweathermap.org/data/2.5";

    String citiesURL = "http://46.137.233.111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city = (TextView) findViewById(R.id.txt_city);
        status = (TextView) findViewById(R.id.txt_status);
        humidity = (TextView) findViewById(R.id.txt_humidity);
        pressure = (TextView) findViewById(R.id.txt_press);
        RequestInterceptor requestInterceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestInterceptor.RequestFacade request) {
                request.addHeader("ApiToken", "VwlzrRppNFfZ1v0TfoRY8afTSJOb4HgE");
            }
        };

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(citiesURL)
                .setRequestInterceptor(requestInterceptor)
                .build();
        //Creating Rest Services
        RestInterface myrestInterface = restAdapter.create(RestInterface.class);
        myrestInterface.getAllCities(new Callback<MyList>() {
            @Override
            public void success(MyList myList, Response response) {
                City mCity = myList.getCities().get(0);
                city.setText(mCity.getName());
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }


}
