package com.wadud.gads


import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.wadud.gads.model.Hours
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

class HourAdapter : ListAdapter<Hours, HoursViewHolder>(DiffUtil()) {
    class DiffUtil() : androidx.recyclerview.widget.DiffUtil.ItemCallback<Hours>() {
        override fun areItemsTheSame(oldItem: Hours, newItem: Hours): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Hours, newItem: Hours): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoursViewHolder {
        return HoursViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: HoursViewHolder, position: Int) {
        val hour = getItem(position)
        holder.bind(hour)
    }
}