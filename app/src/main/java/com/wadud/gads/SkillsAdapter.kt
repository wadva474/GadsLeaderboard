package com.wadud.gads


import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.wadud.gads.model.Skills

class SkillsAdapter() : ListAdapter<Skills, SkillAdapterViewHolder>(DiffUtil()) {

    class DiffUtil() : androidx.recyclerview.widget.DiffUtil.ItemCallback<Skills>() {
        override fun areItemsTheSame(oldItem: Skills, newItem: Skills): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Skills, newItem: Skills): Boolean {
            return oldItem == newItem
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillAdapterViewHolder {
        return SkillAdapterViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: SkillAdapterViewHolder, position: Int) {
        val skill = getItem(position)
        holder.bind(skill)
    }
}