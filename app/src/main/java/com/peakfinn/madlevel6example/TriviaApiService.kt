package com.peakfinn.madlevel6example

import com.peakfinn.madlevel6example.data.Trivia
import retrofit2.http.GET

/**
 * Created by Finn Bon on 13/12/2020.
 */
interface TriviaApiService {

    // The GET method needed to retrieve a random number trivia.
    @GET("/random/trivia?json")
    suspend fun getRandomNumberTrivia(): Trivia
}
