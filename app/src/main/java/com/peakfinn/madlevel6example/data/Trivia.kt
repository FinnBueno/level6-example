package com.peakfinn.madlevel6example.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Finn Bon on 13/12/2020.
 */
data class Trivia(
    @SerializedName("text") var text: String,
    @SerializedName("number") var number: Int,
    @SerializedName("found") var found: Boolean,
    @SerializedName("type") var type: String
)