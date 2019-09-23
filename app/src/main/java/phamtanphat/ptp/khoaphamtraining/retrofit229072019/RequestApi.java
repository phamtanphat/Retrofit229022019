package phamtanphat.ptp.khoaphamtraining.retrofit229072019;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestApi {
    // 2 : Tao ra cac request
    @GET("cong/1/1")
    Call<String> apiCong();
}
