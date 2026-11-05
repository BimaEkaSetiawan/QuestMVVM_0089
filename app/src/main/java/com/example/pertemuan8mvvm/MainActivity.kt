package com.example.pertemuan8mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.pertemuan8mvvm.ui.theme.Pertemuan8MVVMTheme
import com.example.pertemuan8mvvm.view.unicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan8MVVMTheme {
                SiswaApp()
            }
        }
    }
}
