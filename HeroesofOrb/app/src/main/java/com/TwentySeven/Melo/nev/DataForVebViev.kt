package com.TwentySeven.Melo.nev

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataForVebViev(
    val appsFlyerDattaGotten: String,
    val advertisingIdClient:String,
    val appLinkData:String,
    val linkViev:String,
) : Parcelable