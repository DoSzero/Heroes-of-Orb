package com.TwentySeven.Melo.view

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.TwentySeven.Melo.R
import com.TwentySeven.Melo.databinding.FragmentGamiBinding

import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class GaaaamiFragment : Fragment() {

    private var gamiBinding: FragmentGamiBinding? = null
    private val fragmentGamiBinding get() = gamiBinding ?: throw RuntimeException("FragmentGaaaamiBinding = null")

    private fun tryAgin() {
        Snackbar.make(fragmentGamiBinding.root, "There is some error, try again", Snackbar.LENGTH_LONG).show()
        requireActivity().onBackPressed()
    }

    val nhjhjjj by lazy {
        listOf(
            ContextCompat.getDrawable(requireActivity(), R.drawable.item1),
            ContextCompat.getDrawable(requireActivity(), R.drawable.item4),
            ContextCompat.getDrawable(requireActivity(), R.drawable.item3),
        )
    }

    private val variant1fr = listOf(0, 2, 3)
    private val variant2ggt = listOf(2, 3, 5)
    private val variant3gtgt = listOf(1, 4, 5)
    private val variant4gt = listOf(0, 4, 5)
    private val variant5gtgt = listOf(0, 3, 5)


    private fun createAnimatorSetFront(): AnimatorSet {
        return AnimatorInflater.loadAnimator(requireContext().applicationContext, R.animator.front_animator) as AnimatorSet
    }

    private fun createAnimatorSetBack(): AnimatorSet {
        return AnimatorInflater.loadAnimator(requireContext().applicationContext, R.animator.back_animator) as AnimatorSet
    }

    private val animatorFrontSet1 by lazy {
        createAnimatorSetFront()
    }
    private val animatorFrontSet2 by lazy {
        createAnimatorSetFront()
    }
    private val animatorFrontSet3 by lazy {
        createAnimatorSetFront()
    }
    private val animatorFrontSet4 by lazy {
        createAnimatorSetFront()
    }
    private val animatorFrontSet5 by lazy {
        createAnimatorSetFront()
    }
    private val animatorFrontSent6 by lazy {
        createAnimatorSetFront()
    }


    private val setBack1 by lazy {
        createAnimatorSetBack()
    }

    private val setBack2 by lazy {
        createAnimatorSetBack()
    }

    private val setBack3 by lazy {
        createAnimatorSetBack()
    }
    private val setBack4 by lazy {
        createAnimatorSetBack()
    }
    private val setBack5 by lazy {
        createAnimatorSetBack()
    }
    private val setBack6 by lazy {
        createAnimatorSetBack()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            fragmentGamiBinding.imgElem1.isEnabled = true
            fragmentGamiBinding.imgElem2.isEnabled = true
            fragmentGamiBinding.imgElem3.isEnabled = true
            fragmentGamiBinding.imgElem4.isEnabled = true
            fragmentGamiBinding.imgElem5.isEnabled = true
            fragmentGamiBinding.imgElem6.isEnabled = true

            fragmentGamiBinding.imgElem1Back.isEnabled = true
            fragmentGamiBinding.imgElem2Back.isEnabled = true
            fragmentGamiBinding.imgElem3Back.isEnabled = true
            fragmentGamiBinding.imgElem4Back.isEnabled = true
            fragmentGamiBinding.imgElem5Back.isEnabled = true
            fragmentGamiBinding.imgElem6Back.isEnabled = true

            fragmentGamiBinding.root.background.alpha = 195
            val bhnhnhnnh = variants.random()

            for (element in 0..5) {
                if (bhnhnhnnh.contains(element)) {
                    dodik[element].contentDescription = "ok"
                    val imaaaage = ContextCompat.getDrawable(requireActivity(), R.drawable.item5)
                    dodik[element].setImageDrawable(imaaaage)
                } else {
                    dodik[element].contentDescription = "false"
                    dodik[element].setImageDrawable(nhjhjjj.random())
                }
            }

            if (moska) {
                lifecycleScope.launch {
                    manka()
                    bgbgbgffff()
                    vffffggg()
                    sdefdfvfvf()
                    hyujkooppp()
                    vbgmjkloo()

                    delay(2000)

                    elemFront1()
                    elemFront2()
                    elemFront3()
                    elemFront4()
                    elemFront5()
                    lanka()
                }
            }

            val bbgbgbgbg = requireContext().applicationContext.resources.displayMetrics.density
            fragmentGamiBinding.imgElem1.cameraDistance = 8000 * bbgbgbgbg
            fragmentGamiBinding.imgElem1Back.cameraDistance = 8000 * bbgbgbgbg

            fragmentGamiBinding.btnImgExitttt.setOnClickListener {
                requireActivity().finish()
            }

            fragmentGamiBinding.imgElem1.setOnClickListener {
                manka()
                lifecycleScope.launch {
                    if (fragmentGamiBinding.imgElem1Back.contentDescription == "ok") {
                        fragmentGamiBinding.imgElem1.isEnabled = false
                        delay(900)
                        fragmentGamiBinding.imgElem1.visibility = View.INVISIBLE
                        elemFront1()
                        fragmentGamiBinding.imgElem1Back.contentDescription = "done"
                        if (count()) vfccccvb()
                    } else {
                        delay(2000)
                        elemFront1()
                    }
                }
            }

            fragmentGamiBinding.imgElem2.setOnClickListener {
                bgbgbgffff()
                lifecycleScope.launch {
                    if (fragmentGamiBinding.imgElem2Back.contentDescription == "ok") {
                        fragmentGamiBinding.imgElem2.isEnabled = false
                        delay(900)
                        fragmentGamiBinding.imgElem2.visibility = View.INVISIBLE
                        elemFront2()
                        fragmentGamiBinding.imgElem2Back.contentDescription = "done"
                        if (count()) vfccccvb()
                    } else {
                        delay(2000)
                        elemFront2()
                    }
                }
            }

            fragmentGamiBinding.imgElem3.setOnClickListener {
                vffffggg()
                lifecycleScope.launch {
                    if (fragmentGamiBinding.imgElem3Back.contentDescription == "ok") {
                        fragmentGamiBinding.imgElem3.isEnabled = false
                        delay(900)
                        fragmentGamiBinding.imgElem3.visibility = View.INVISIBLE
                        elemFront3()
                        fragmentGamiBinding.imgElem3Back.contentDescription = "done"
                        if (count()) vfccccvb()
                    } else {
                        delay(2000)
                        elemFront3()
                    }
                }
            }

            fragmentGamiBinding.imgElem4.setOnClickListener {
                sdefdfvfvf()
                lifecycleScope.launch {
                    if (fragmentGamiBinding.imgElem4Back.contentDescription == "ok") {
                        fragmentGamiBinding.imgElem4.isEnabled = false
                        delay(900)
                        fragmentGamiBinding.imgElem4.visibility = View.INVISIBLE
                        elemFront4()
                        fragmentGamiBinding.imgElem4Back.contentDescription = "done"
                        if (count()) vfccccvb()
                    } else {
                        delay(2000)
                        elemFront4()
                    }
                }
            }

            fragmentGamiBinding.imgElem5.setOnClickListener {
                hyujkooppp()
                lifecycleScope.launch {
                    if (fragmentGamiBinding.imgElem5Back.contentDescription == "ok") {
                        fragmentGamiBinding.imgElem5.isEnabled = false
                        delay(900)
                        fragmentGamiBinding.imgElem5.visibility = View.INVISIBLE
                        elemFront5()
                        fragmentGamiBinding.imgElem5Back.contentDescription = "done"
                        if (count()) vfccccvb()
                    } else {
                        delay(2000)
                        elemFront5()
                    }
                }
            }

            fragmentGamiBinding.imgElem6.setOnClickListener {
                vbgmjkloo()
                lifecycleScope.launch {
                    if (fragmentGamiBinding.imgElem6Back.contentDescription == "ok") {
                        fragmentGamiBinding.imgElem6.isEnabled = false
                        delay(900)
                        fragmentGamiBinding.imgElem6.visibility = View.INVISIBLE
                        lanka()
                        fragmentGamiBinding.imgElem6Back.contentDescription = "done"
                        if (count()) vfccccvb()
                    } else {
                        delay(2000)
                        lanka()
                    }
                }
            }

        } catch (e: Exception) {
            tryAgin()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun iniOnClickListener(view: View, funIsFront: Unit, funForBack: Unit) {
        val vfvfvfvfvf = view as ImageView
        funIsFront
        lifecycleScope.launch {
            if (vfvfvfvfvf.contentDescription == "ok") {
                view.isEnabled = false
                delay(1000)
                view.visibility = View.INVISIBLE
                funForBack
            } else {
                funForBack
            }
        }
        if (count()) {
            vfccccvb()
        }
    }

    private fun vfccccvb() {
        fragmentGamiBinding.imgElem1.isEnabled = false
        fragmentGamiBinding.imgElem2.isEnabled = false
        fragmentGamiBinding.imgElem3.isEnabled = false
        fragmentGamiBinding.imgElem4.isEnabled = false
        fragmentGamiBinding.imgElem5.isEnabled = false
        fragmentGamiBinding.imgElem6.isEnabled = false

        fragmentGamiBinding.imgElem1Back.isEnabled = false
        fragmentGamiBinding.imgElem2Back.isEnabled = false
        fragmentGamiBinding.imgElem3Back.isEnabled = false
        fragmentGamiBinding.imgElem4Back.isEnabled = false
        fragmentGamiBinding.imgElem5Back.isEnabled = false
        fragmentGamiBinding.imgElem6Back.isEnabled = false

        lifecycleScope.launchWhenCreated {
            Snackbar.make(fragmentGamiBinding.root, "Done. Good for you", Snackbar.LENGTH_LONG).show()
            delay(2000)
            findNavController().navigate(R.id.action_gaaaamiFragment_to_restartFragment)
        }
    }

    private fun gythhyhy(elemFront: ImageView) = elemFront.visibility == View.INVISIBLE

    private fun count(): Boolean {
        var counttteeer = 0
        for (i in dodik) {
            if (i.contentDescription == "done") {
                counttteeer++
            }
        }
        return counttteeer == 3
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    private fun elemFront1() {
        frontSide(animatorFrontSet1, setBack1, fragmentGamiBinding.imgElem1, fragmentGamiBinding.imgElem1Back)
    }
    private fun elemFront2() {
        frontSide(animatorFrontSet2, setBack2, fragmentGamiBinding.imgElem2, fragmentGamiBinding.imgElem2Back)
    }
    private fun elemFront4() {
        frontSide(animatorFrontSet4, setBack4, fragmentGamiBinding.imgElem4, fragmentGamiBinding.imgElem4Back)
    }
    private fun elemFront5() {
        frontSide(animatorFrontSet5, setBack5, fragmentGamiBinding.imgElem5, fragmentGamiBinding.imgElem5Back)
    }
    private fun elemFront3() {
        frontSide(animatorFrontSet3, setBack3, fragmentGamiBinding.imgElem3, fragmentGamiBinding.imgElem3Back)
    }


    // Backside of card
    private fun lanka() {
        frontSide(animatorFrontSent6, setBack6, fragmentGamiBinding.imgElem6, fragmentGamiBinding.imgElem6Back)
    }
    private fun manka() {
        backSide(animatorFrontSet1, setBack1, fragmentGamiBinding.imgElem1, fragmentGamiBinding.imgElem1Back)
    }
    private fun bgbgbgffff() {
        backSide(animatorFrontSet2, setBack2, fragmentGamiBinding.imgElem2, fragmentGamiBinding.imgElem2Back)
    }
    private fun vffffggg() {
        backSide(animatorFrontSet3, setBack3, fragmentGamiBinding.imgElem3, fragmentGamiBinding.imgElem3Back)
    }
    private fun sdefdfvfvf() {
        backSide(animatorFrontSet4, setBack4, fragmentGamiBinding.imgElem4, fragmentGamiBinding.imgElem4Back)
    }
    private fun hyujkooppp() {
        backSide(animatorFrontSet5, setBack5, fragmentGamiBinding.imgElem5, fragmentGamiBinding.imgElem5Back)
    }
    private fun vbgmjkloo() {
        backSide(animatorFrontSent6, setBack6, fragmentGamiBinding.imgElem6, fragmentGamiBinding.imgElem6Back)
    }


    private fun frontSide(frontAnim: AnimatorSet, backAnim: AnimatorSet, elemFront: ImageView, elemBack: ImageView) {
        frontAnim.setTarget(elemBack)
        backAnim.setTarget(elemFront)
        frontAnim.start()
        backAnim.start()
    }

    private fun backSide(frontAnim: AnimatorSet, backAnim: AnimatorSet, elemFront: ImageView, elemBack: ImageView) {
        frontAnim.setTarget(elemFront)
        backAnim.setTarget(elemBack)
        frontAnim.start()
        backAnim.start()
    }

    override fun onDestroy() {
        gamiBinding = null
        super.onDestroy()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        gamiBinding = FragmentGamiBinding.inflate(inflater, container, false)
        return fragmentGamiBinding.root
    }

    private val variants = listOf(variant1fr, variant2ggt, variant3gtgt, variant4gt, variant5gtgt).shuffled()

    var hyhyhy = true
    var moska = true

    private val dodik by lazy {
        listOf(
            fragmentGamiBinding.imgElem1Back,
            fragmentGamiBinding.imgElem2Back,
            fragmentGamiBinding.imgElem3Back,
            fragmentGamiBinding.imgElem4Back,
            fragmentGamiBinding.imgElem5Back,
            fragmentGamiBinding.imgElem6Back
        )
    }
}