package projects.julio.amazon.Network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("movies/popular")
    Call<ResponseBody> filmesPopulares(@Query("api_key") String chaveAPI);
}
