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
        Pair("NIM", uiStateMahasiswa.nim),
        Pair("Email", uiStateMahasiswa.email),
        Pair("Alamat", uiStateMahasiswa.alamat),
        Pair("Gender", uiStateMahasiswa.gender),
        Pair("NoHP", uiStateMahasiswa.nohp),
    )

    Column(){
        listDataMhs.forEach{ items ->

        }
    }
}