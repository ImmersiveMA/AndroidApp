package me.zoezo.twistermixer

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val windowInsetsController =
            ViewCompat.getWindowInsetsController(window.decorView) ?: return

        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())


        supportActionBar?.hide()

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("http://10.120.81.28:5500/")

        val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.displayZoomControls = true
        webSettings.disabledActionModeMenuItems = true
        webSettings.mediaPlaybackRequiresUserGesture = false
    }
}