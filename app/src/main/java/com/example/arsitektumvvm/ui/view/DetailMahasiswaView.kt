package com.example.arsitektumvvm.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.arsitektumvvm.model.DataMahasiswa
import androidx.compose.ui.Modifier

@Composable
fun DetailMahasiswaView(
    modifier: Modifier = Modifier,
    uiStateMahasiswa: DataMahasiswa,
)
{
    val listDataMhs = listOf(
        Pair("Nama", uiStateMahasiswa.nama),
        Pair("Alamat", uiStateMahasiswa.alamat),
        Pair("Gender", uiStateMahasiswa.gender),
    )

    Column(){
        listDataMhs.forEach{ items ->

        }
    }
}