package com.darelllego.portfolioapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import com.darelllego.portfolioapp.databinding.FragmentExperienceDetailBinding

class ExperienceDetailFragment : Fragment(){
    private var _binding: FragmentExperienceDetailBinding? = null
    private val binding get() = _binding!!
    private val experienceArgs by navArgs<ExperienceDetailFragmentArgs>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExperienceDetailBinding.inflate(inflater, container, true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            txtTitle.text = experienceArgs.experience.title
            txtSubtitle.text = experienceArgs.experience.detail
            imgDetailProfile.load(experienceArgs.experience.image){
                crossfade(2000)
            }
        }
    }

}