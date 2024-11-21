package com.example.arsitektumvvm

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.arsitektumvvm.model.DataKelamin
import com.example.arsitektumvvm.ui.view.FormMahasiswaView
import com.example.arsitektumvvm.ui.viewmodel.MahasiswaViewModel

enum class Halaman{
    Formulir,
    Detail,
}

@Composable
fun PengelolaanHalaman(
    navController: NavHostController = rememberNavController(),
    viewModel: MahasiswaViewModel = viewModel()
){
    val StateUI by viewModel.uiState.collectAsState()

    NavHost(navController = navController, startDestination = Halaman.Formulir.name) {
        composable(route = Halaman.Formulir.name){
            val konteks = LocalContext.current
            FormMahasiswaView(
                listJK = DataKelamin.listJK.map { id ->
                    konteks.resources.getString(
                        id
                    )
                },
                onSubmitClicked = {}
            )
        }
    }
}