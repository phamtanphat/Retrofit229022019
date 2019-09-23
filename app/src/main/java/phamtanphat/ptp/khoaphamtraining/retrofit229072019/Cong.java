package phamtanphat.ptp.khoaphamtraining.retrofit229072019;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cong {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("message")
    @Expose
    private Integer message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getMessage() {
        return message;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }

}