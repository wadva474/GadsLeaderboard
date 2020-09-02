package com.wadud.gads.network.repository

import com.wadud.gads.model.Skills
import com.wadud.gads.network.ApiService
import com.wadud.gads.network.SubmissionService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ApiRepository @Inject constructor(
    private val service: ApiService,
    private val submissionService: SubmissionService
) {

    suspend fun getHours() {
        withContext(Dispatchers.IO) {
            service.getHoursAsync().await()
        }
    }

    suspend fun getSkills(): List<Skills> {
        return service.getSkillsAsync().await()
    }

    suspend fun makeSubmission(
        emailAddress: String,
        name: String,
        lastName: String,
        linkToProject: String
    ) {
        withContext(Dispatchers.IO) {
            submissionService.makeSubmission(emailAddress, name, lastName, linkToProject)
        }
    }
}