package com.fati.technoformat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main4.*
import java.io.FileInputStream

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        webView.webViewClient= WebViewClient()


        webView.loadUrl("http://elearninginfo.univ-bouira.dz/")
        webView.settings.javaScriptEnabled=true
        webView.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if (webView.canGoBack())
            webView.goBack()
        else
        super.onBackPressed()
    }


}