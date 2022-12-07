package com.TwentySeven.Melo.view

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay
import kotlin.random.Random
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.TwentySeven.Melo.R
import com.TwentySeven.Melo.databinding.FragmentRestartBinding


class RestartFragment : Fragment() {

    private var restartBinding: FragmentRestartBinding? = null
    private val binding get() = restartBinding ?: throw RuntimeException("FragmentRestartBinding = null")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        restartBinding = FragmentRestartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val currentPoint = Random.nextInt(from = 100, until = 5000)
            Snackbar.make(binding.root, "You received $currentPoint points", Snackbar.LENGTH_LONG).show()

            lifecycleScope.launchWhenCreated {
                delay(1900)
                findNavController().navigate(R.id.action_restartFragment_to_gaaaamiFragment)
            }
        } catch (e: Exception) {
            sErr()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        restartBinding = null
        super.onDestroy()
    }

    private fun sErr() {
        Snackbar.make(binding.root, "Some error...", Snackbar.LENGTH_LONG).show()
        requireActivity().onBackPressed()
    }

}