package com.TwentySeven.Melo.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.TwentySeven.Melo.SortClass
import com.TwentySeven.Melo.databinding.ActivityNevMainBinding
import com.TwentySeven.Melo.nev.Constance
import com.TwentySeven.Melo.nev.DataForVebViev
import com.TwentySeven.Melo.viewmodel.SortVievModell
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.launch


@AndroidEntryPoint
@ActivityScoped
class NevMainActivity : AppCompatActivity() {

    private val mainViewModel by viewModels<SortVievModell>()

    private var _binding: ActivityNevMainBinding? = null
    private val binding get() = _binding ?: throw RuntimeException("ActivityNevMainBinding = null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityNevMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            mainViewModel.iniSettingVievModel()
            mainViewModel.fetchDeferredAppLinkData(this@NevMainActivity)
            mainViewModel.initAppsFlyerLib(this@NevMainActivity)
            mainViewModel.getGeoData()
        }

        mainViewModel.currentMode.observe(this) {
            when (it) {
                SortClass.LOADING -> {
                    Log.d("lolo", "Loading")
                }

                SortClass.MODERATION -> {
                    val intent = Intent(this, GameActivity::class.java)
                    startActivity(intent)
                    finish()
                }

                SortClass.TEST_VEB -> {
                    val dataForSend = mainViewModel.sendDataForVebVeiv()
                    goToVebVievActivity(dataForSend)
                }

                SortClass.REAL_START -> {
                    mainViewModel.sendDataForVebVeiv().also {
                        goToVebVievActivity(it)
                    }
                }

                SortClass.REAL_START_NO_APPS -> {
                    mainViewModel.sendDataForVebVeiv().also {
                        goToVebVievActivity(it)
                    }
                }
            }

        }
    }

    private fun goToVebVievActivity(dataForSend: DataForVebViev) {
        val intent = Intent(this@NevMainActivity, PolicyActivity::class.java).also {
            it.putExtra(Constance.KEY_DATA_FOR_VEB_VIEV, dataForSend)
        }
        startActivity(intent)
        finish()
    }
}