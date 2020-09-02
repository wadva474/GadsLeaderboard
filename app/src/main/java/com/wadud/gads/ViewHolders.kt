package com.wadud.gads

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wadud.gads.databinding.RecyclerViewItem1Binding
import com.wadud.gads.model.Skills

class SkillAdapterViewHolder(private val binding: RecyclerViewItem1Binding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(skill: Skills) {
        binding.skills = skill
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): SkillAdapterViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = RecyclerViewItem1Binding.inflate(layoutInflater, parent, false)
            return SkillAdapterViewHolder(binding)
        }
    }

}