package com.wadud.gads.network

import com.wadud.gads.model.Hours
import com.wadud.gads.model.Skills
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface ApiService {

    @GET("api/hours")
    fun getHoursAsync(): Deferred<List<Hours>>

    @GET("api/skilliq")
    fun getSkillsAsync(): Deferred<List<Skills>>
}