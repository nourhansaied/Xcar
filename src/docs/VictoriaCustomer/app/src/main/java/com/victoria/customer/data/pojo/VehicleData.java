package com.victoria.customer.data.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VehicleData {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("vehicle")
    @Expose
    public String vehicle;
    @SerializedName("vehicle_type")
    @Expose
    public String vehicleType;
    @SerializedName("base_fare")
    @Expose
    public Double baseFare;
    @SerializedName("rate_per_kilometer")
    @Expose
    public Double ratePerKilometer;
    @SerializedName("rate_per_min")
    @Expose
    public Double ratePerMin;
    @SerializedName("waiting_rate_per_min")
    @Expose
    public Double waitingRatePerMin;
    @SerializedName("nightcharge_status")
    @Expose
    public String nightchargeStatus;
    @SerializedName("night_start_time")
    @Expose
    public String nightStartTime;
    @SerializedName("night_end_time")
    @Expose
    public String nightEndTime;
    @SerializedName("nightcharge_type")
    @Expose
    public String nightchargeType;
    @SerializedName("night_charge")
    @Expose
    public Double nightCharge;
    @SerializedName("selected_image")
    @Expose
    public String selectedImage;
    @SerializedName("unselected_image")
    @Expose
    public String unselectedImage;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("is_deleted")
    @Expose
    public String isDeleted;
    @SerializedName("insertdate")
    @Expose
    public String insertdate;
    @SerializedName("vehicle_id")
    @Expose
    public Integer vehicleId;
    @SerializedName("vehicle_selectedimage")
    @Expose
    public String vehicleSelectedimage;
    @SerializedName("vehicle_thumb_selectedimage")
    @Expose
    public String vehicleThumbSelectedimage;
    @SerializedName("vehicle_unselectedimage")
    @Expose
    public String vehicleUnselectedimage;
    @SerializedName("vehicle_thumb_unselectedimage")
    @Expose
    public String vehicleThumbUnselectedimage;

}