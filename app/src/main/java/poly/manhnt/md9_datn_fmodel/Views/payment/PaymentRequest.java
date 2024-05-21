package poly.manhnt.md9_datn_fmodel.Views.payment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PaymentRequest {
    @SerializedName("idCart")
    public List<String> idCarts;
    @SerializedName("amount")
    public int amount;
    @SerializedName("language")
    public String language = "vi";
    @SerializedName("idDiscount")
    public String discountId;
}
