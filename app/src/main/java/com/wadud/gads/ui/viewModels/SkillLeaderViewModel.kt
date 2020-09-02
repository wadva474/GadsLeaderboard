package com.wadud.gads.ui.viewModels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wadud.gads.model.Skills
import com.wadud.gads.network.repository.ApiRepository
import kotlinx.coroutines.launch

class SkillLeaderViewModel @ViewModelInject constructor(private val repository: ApiRepository) :
    ViewModel() {

    private val result = MutableLiveData<List<Skills>>()
    val _result: LiveData<List<Skills>>
        get() = result

    init {
        getSkillLeaders()
    }

    private fun getSkillLeaders() {
        viewModelScope.launch {
            result.value = repository.getSkills()
        }
    }

}