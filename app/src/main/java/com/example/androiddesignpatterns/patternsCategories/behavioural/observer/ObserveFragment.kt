package com.example.androiddesignpatterns.patternsCategories.behavioural.observer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.androiddesignpatterns.R
import com.example.androiddesignpatterns.databinding.FragmentObserveBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class ObserveFragment : Fragment(R.layout.fragment_observe) {

    private val viewModel: ObserveViewModel by viewModels()

    private var _binding: FragmentObserveBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentObserveBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeViewState()
    }

    private fun observeViewState() {
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.viewState.collect { state ->
                when (state) {
                    ObserveViewState.SetNewName -> binding.title.text = "Observe Fragment!"
                    ObserveViewState.RemoveName -> binding.title.text = "No name"
                }
            }
        }
    }
}