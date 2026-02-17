package com.example.ideasimilarityapp

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

data class IdeaRequest(val text: String)

data class IdeaResponse(
    val status: String,
    val similarity_score: Double,
    val most_similar_idea: String?
)

interface ApiService {

    @POST("check")
    fun checkIdea(@Body request: IdeaRequest): Call<IdeaResponse>
}
