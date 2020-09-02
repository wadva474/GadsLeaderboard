package com.wadud.gads.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.wadud.gads.ui.viewModels.LearningLeadersViewModel
import com.wadud.gads.databinding.LearningLeadersFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LearningLeadersFragment : Fragment() {

    val viewModel: LearningLeadersViewModel by viewModels()
    private lateinit var binding: LearningLeadersFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LearningLeadersFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


}