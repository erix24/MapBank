package com.example.mapbank.codemen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mapbank.R
import android.webkit.WebView
import android.view.View


class WebviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val webView = this.findViewById<View>(R.id.webview) as WebView
        webView.loadUrl("https://www.bbva.com.co/")

    }
}
