package com.wadud.gads.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wadud.gads.MainActivity
import com.wadud.gads.SkillsAdapter
import com.wadud.gads.databinding.SkillLeaderFragmentBinding
import com.wadud.gads.network.LoadingStatus
import com.wadud.gads.ui.viewModels.SkillLeaderViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SkillLeaderFragment : Fragment() {

     val mainActivity: MainActivity
        get() {
            return activity as? MainActivity ?: throw IllegalStateException("Not attached!")
        }
    private val viewModel: SkillLeaderViewModel by viewModels()
    private lateinit var binding: SkillLeaderFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SkillLeaderFragmentBinding.inflate(inflater, container, false)
        val adapter = SkillsAdapter()
        viewModel.skillLeaders.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        viewModel.loadingStatus.observe(viewLifecycleOwner){
            when(it){
                is LoadingStatus.Loading -> mainActivity.showLoading(it.message)
                is LoadingStatus.Success -> mainActivity.dismissLoading()
                is LoadingStatus.Error -> mainActivity.dismissLoading()
            }
        }
        binding.skillList.adapter = adapter
        return binding.root
    }


}