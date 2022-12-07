package com.TwentySeven.Melo.view

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.TwentySeven.Melo.R
import com.TwentySeven.Melo.databinding.ActivityPolicyBinding
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.TwentySeven.Melo.nev.Constance
import com.TwentySeven.Melo.nev.DataForVebViev
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException


class PolicyActivity : AppCompatActivity() {

    private val dataRecived by lazy {
        intent.getParcelableExtra(Constance.KEY_DATA_FOR_VEB_VIEV) as DataForVebViev?
    }

    private val onse = 1

    private fun bobik() {
        val lolik = jgidhgjdk.settings
        lolik.javaScriptEnabled = true

        lolik.useWideViewPort = true

        lolik.loadWithOverviewMode = true
        lolik.allowFileAccess = true
        lolik.domStorageEnabled = true
        lolik.userAgentString = lolik.userAgentString.replace("; wv", "")

        lolik.javaScriptCanOpenWindowsAutomatically = true
        lolik.setSupportMultipleWindows(false)

        lolik.displayZoomControls = false
        lolik.builtInZoomControls = true
        lolik.setSupportZoom(true)

        lolik.pluginState = WebSettings.PluginState.ON
        lolik.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        lolik.setAppCacheEnabled(true)

        lolik.allowContentAccess = true
    }

    var arrayValueCallback: ValueCallback<Array<Uri>>? = null
    lateinit var jgidhgjdk: WebView

    var urlstr = ""
    fun ulo (lur: String?) {
        if (!lur!!.contains("t.me")) {
            if (urlstr == "") {
                urlstr = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE).getString("SAVED_URL", lur).toString()
                val sp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("SAVED_URL", lur)
                editor.apply()
            }
        }
    }

    lateinit var policyBinding: ActivityPolicyBinding
    var kgjfhdkxf: String? = null

    private fun bbnbnko(): String {
        val sp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val packfrfrrfr = "com.TwentySeven.Melo"

        val appsFlyData = dataRecived?.appsFlyerDattaGotten ?: "null"
        val advId = dataRecived?.advertisingIdClient ?: "null"
        val appLinkData = dataRecived?.appLinkData ?: "null"
        val linkkk = dataRecived?.linkViev ?: "null"


        val vcdcdcdcd = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val bbgbg = "deviceID="
        val frfrfrfr = "sub_id_1="
        val adidddddd = "ad_id="
        val sub4frfrr = "sub_id_4="
        val bgbggbbg = "sub_id_5="
        val sub6frfr = "sub_id_6="

        val nononok = "naming"
        val bnbnbn = "deeporg"
        val eerret = Build.VERSION.RELEASE

        var hylphlyplhly = ""
        if (appsFlyData != "null") {
            hylphlyplhly = "$linkkk$frfrfrfr$appsFlyData&$bbgbg$vcdcdcdcd&$adidddddd$advId&$sub4frfrr$packfrfrrfr&$bgbggbbg$eerret&$sub6frfr$nononok"
            pussshi(vcdcdcdcd.toString())
        } else {
            hylphlyplhly = "$linkkk$frfrfrfr$appLinkData&$bbgbg$vcdcdcdcd&$adidddddd$advId&$sub4frfrr$packfrfrrfr&$bgbggbbg$eerret&$sub6frfr$bnbnbn"
            pussshi(vcdcdcdcd.toString())
        }
        return sp.getString("SAVED_URL", hylphlyplhly).toString()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        policyBinding = ActivityPolicyBinding.inflate(layoutInflater)
        setContentView(policyBinding.root)

        jgidhgjdk = policyBinding.vvveeev

        Snackbar.make(policyBinding.root, "Loading...", Snackbar.LENGTH_LONG).show()

        val gttgththy = CookieManager.getInstance()
        gttgththy.setAcceptCookie(true)
        gttgththy.setAcceptThirdPartyCookies(jgidhgjdk, true)
        bobik()

        val ghghgh: Activity = this
        jgidhgjdk.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (bgbggbffff(url)) {
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {
                        Toast.makeText(applicationContext, "Application is not installed", Toast.LENGTH_LONG).show()
                        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")))
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }

            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                ulo(url)
            }

            override fun onReceivedError(view: WebView, errorCode: Int, description: String, failingUrl: String) {
                Toast.makeText(ghghgh, description, Toast.LENGTH_SHORT).show()
            }
        }

        jgidhgjdk.webChromeClient = object : WebChromeClient() {
            @SuppressLint("QueryPermissionsNeeded")
            override fun onShowFileChooser(webView: WebView, filePathCallback: ValueCallback<Array<Uri>>, fileChooserParams: FileChooserParams): Boolean {
                arrayValueCallback?.onReceiveValue(null)
                arrayValueCallback = filePathCallback
                var totya: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (totya!!.resolveActivity(packageManager) != null) {

                    var bhnhnhnhhn: File? = null
                    try {
                        bhnhnhnhhn = file()
                        totya.putExtra("PhotoPath", kgjfhdkxf)
                    } catch (ex: IOException) {
                    }

                    if (bhnhnhnhhn != null) {
                        kgjfhdkxf = "file:" + bhnhnhnhhn.absolutePath
                        totya.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(bhnhnhnhhn))
                    } else {
                        totya = null
                    }
                }

                val boka = Intent(Intent.ACTION_GET_CONTENT)
                boka.addCategory(Intent.CATEGORY_OPENABLE)
                boka.type = "image/*"

                val gtgtgtt: Array<Intent?> = totya?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val opopopop = Intent(Intent.ACTION_CHOOSER)

                opopopop.putExtra(Intent.EXTRA_INTENT, boka)
                opopopop.putExtra(Intent.EXTRA_TITLE, getString(R.string.take_imagefgtgt))
                opopopop.putExtra(Intent.EXTRA_INITIAL_INTENTS, gtgtgtt)

                startActivityForResult(opopopop, onse)
                return true
            }

            @Throws(IOException::class)
            private fun file(): File {
                var file = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "DirectoryNameHere")
                if (!file.exists()) {
                    file.mkdirs()
                }
                file = File(file.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return file
            }
        }
        jgidhgjdk.loadUrl(bbnbnko())
    }


    private fun pussshi(string: String) {
        OneSignal.setExternalUserId(string, object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
            override fun onSuccess(results: JSONObject) {
                try {
                    if (results.has("push") && results.getJSONObject("push").has("success")) {
                        val frrfrfrrf = results.getJSONObject("push").getBoolean("success")
                        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.VERBOSE, "Set external user id for push status: $frrfrfrrf")
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
                try {
                    if (results.has("email") && results.getJSONObject("email").has("success")) {
                        val vccxddddddddd = results.getJSONObject("email").getBoolean("success")
                        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.VERBOSE, "Set external user id for email status: $vccxddddddddd")
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
                try {
                    if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                        val frfrfr = results.getJSONObject("sms").getBoolean("success")
                        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.VERBOSE, "Set external user id for sms status: $frfrfr")
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }

            override fun onFailure(error: OneSignal.ExternalIdError) {
                OneSignal.onesignalLog(OneSignal.LOG_LEVEL.VERBOSE, "Set external user id done with error: $error")
            }
        })
    }


    private fun bgbggbffff(uri: String): Boolean {
        val goolka = packageManager
        try {
            goolka.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != onse || arrayValueCallback == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var fnrnfnrf: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null || data.data == null) {
                fnrnfnrf = arrayOf(Uri.parse(kgjfhdkxf))
            } else {
                val vfvddsser = data.dataString
                if (vfvddsser != null) {
                    fnrnfnrf = arrayOf(Uri.parse(vfvddsser))
                }
            }
        }
        arrayValueCallback?.onReceiveValue(fnrnfnrf)
        arrayValueCallback = null
    }

    private var jkikiiik = false
    override fun onBackPressed() {
        if (jgidhgjdk.canGoBack()) {
            if (jkikiiik) {
                jgidhgjdk.stopLoading()
                jgidhgjdk.loadUrl(urlstr)
            }

            this.jkikiiik = true
            jgidhgjdk.goBack()

            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                jkikiiik = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

}