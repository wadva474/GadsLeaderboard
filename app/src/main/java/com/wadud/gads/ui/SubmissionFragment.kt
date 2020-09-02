package com.wadud.gads.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wadud.gads.databinding.SubmissionFragmentBinding
import com.wadud.gads.ui.viewModels.SubmissionViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SubmissionFragment : Fragment() {


    val viewModel: SubmissionViewModel by viewModels()
    private lateinit var binding: SubmissionFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SubmissionFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


}