package com.example.pertemuan8mvvm.view.unicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan8mvvm.model.DataJK.JenisK
import com.example.pertemuan8mvvm.view.FormSiswa
import com.example.pertemuan8mvvm.view.TampilSiswa
import com.example.pertemuan8mvvm.viewmodel.SiswaViewModel

enum class Navigasi {
    Formulir,
    Detail,
}


