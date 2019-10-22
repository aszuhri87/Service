package com.example.service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //menampilkan facebook
        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("http://facebook.com/zuchlodic.melopunk"))
            startActivity(i)
        })

        //menampilkan Instagram
        btn_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("http://instagram.com/oeddinzuhri"))
            startActivity(i)
        })

        //deklarasi variabel mediaplayer
        var MediaPlayer: MediaPlayer?=MediaPlayer.create(this,R.raw.nothingsforreal)

        //button play
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }

        btn_pause.setOnClickListener {
            MediaPlayer?.pause()
        }

        btn_stop.setOnClickListener {
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
