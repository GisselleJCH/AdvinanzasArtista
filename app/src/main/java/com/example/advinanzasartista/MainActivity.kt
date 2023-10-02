package com.example.advinanzasartista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //mostrar el splash antes de que se le asigne a esta pantalla su recurso de diseño
        installSplashScreen()


        setContentView(R.layout.activity_main)
    }
}