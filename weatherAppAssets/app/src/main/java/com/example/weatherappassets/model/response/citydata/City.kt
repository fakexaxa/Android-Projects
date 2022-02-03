package com.example.weatherappassets.model.response.citydata

import com.google.gson.annotations.SerializedName

data class City(
    @SerializedName("admin1 code")
    val admin1Code: String,
    @SerializedName("admin2 code")
    val admin2Code: Int,
    @SerializedName("admin3 code")
    val admin3Code: Any,
    @SerializedName("admin4 code")
    val admin4code: String,
    val alternatenames: String,
    val asciiname: String,
    val cc2: String,
    @SerializedName("country code")
    val countryCode: String,
    val dem: Int,
    val elevation: Int,
    @SerializedName("feature class")
    val featureClass: String,
    @SerializedName("feature code")
    val featureCode: String,
    val geonameid: Int,
    val imageURLs: ImageURLs,
    val latitude: Double,
    val longitude: Double,
    @SerializedName("modification date")
    val modificationDate: String,
    val name: String,
    val population: Int,
    val timezone: String
)