package RestAPI;

import java.util.List;

import Model.Information;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {

    String BASE_URL = "https://jsonplaceholder.typicode.com/";


    @GET("todos")
    Call<List<Information>> getInformation();


}
