package com.example.arsitektumvvm.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.arsitektumvvm.model.DataMahasiswa
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DetailMahasiswaView(
    modifier: Modifier = Modifier,
    uiStateMahasiswa: DataMahasiswa,
    onClickButton: () -> Boolean
)
{
    val listDataMhs = listOf(
        Pair("Nama", uiStateMahasiswa.nama),
        Pair("NIM", uiStateMahasiswa.nim),
        Pair("Gender", uiStateMahasiswa.gender),
        Pair("Email", uiStateMahasiswa.email),
        Pair("Alamat", uiStateMahasiswa.alamat),
        Pair("No HP", uiStateMahasiswa.nohp),
    )

    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Tampilan Data",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)

        Spacer(Modifier.padding(16.dp))

        listDataMhs.forEach{ items ->
            CardSection(
                judulParam = items.first,
                isiParam = items.second
            )
        }

        Spacer(Modifier.padding(16.dp))

        Button(onClick = {onClickButton()}) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun CardSection(judulParam: String, isiParam: String) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = judulParam, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(
                text = "$isiParam",
                modifier = Modifier.weight(2f)
            )
        }
    }
}