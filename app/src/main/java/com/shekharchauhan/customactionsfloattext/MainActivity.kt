package com.shekharchauhan.customactionsfloattext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() ,  TextToSpeech.OnInitListener {
    var engine : TextToSpeech? = null

    var text : String ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        close_btn.setOnClickListener {
            super.onBackPressed()
        }
        intent.extras?.let {
            text = it.get(Intent.EXTRA_PROCESS_TEXT) as String
            info_txt.text = text
            engine = TextToSpeech(applicationContext, this)
        }
    }
    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            engine!!.language = Locale.getDefault()
            engine!!.speak(
                text,
                TextToSpeech.QUEUE_ADD, null, null
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        engine!!.stop()
    }
   }
