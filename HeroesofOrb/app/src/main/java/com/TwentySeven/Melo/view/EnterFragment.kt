package com.TwentySeven.Melo.view

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import com.TwentySeven.Melo.R
import com.TwentySeven.Melo.databinding.FragmentEnterBinding


class EnterFragment : Fragment() {

    private fun someErr() {
        Snackbar.make(gFEbinding.root, "Some error...", Snackbar.LENGTH_LONG).show()
        requireActivity().onBackPressed()
    }

    private var enterBinding: FragmentEnterBinding? = null
    private val gFEbinding get() = enterBinding ?: throw RuntimeException("FragmentEnnnntterBinding = null")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        enterBinding = FragmentEnterBinding.inflate(inflater, container, false)
        return gFEbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            gFEbinding.btnPlayGameeee.setOnClickListener {
                findNavController().navigate(R.id.action_ennnntterFragment_to_gaaaamiFragment)
            }
        } catch (e: Exception) {
            someErr()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        enterBinding = null
        super.onDestroy()
    }

}