package androidwarriors.retrofitexample;

import java.util.List;

import androidwarriors.retrofitexample.POJO.City;
import androidwarriors.retrofitexample.POJO.Model;
import androidwarriors.retrofitexample.POJO.MyList;
import androidwarriors.retrofitexample.POJO.Weather;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;

/**
 * Created by kundan on 8/8/2015.
 */
public interface RestInterface {

    @GET("/weather?q=London,uk")
    void getWheatherReport(Callback<Model> cb);


    @Headers("ApiToken : VwlzrRppNFfZ1v0TfoRY8afTSJOb4HgE")
    @GET("/api/v1/cities")
    void getAllCities(Callback<MyList> cb);


}
