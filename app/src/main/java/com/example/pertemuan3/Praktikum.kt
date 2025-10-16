package com.example.pertemuan3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.content.contentValuesOf

@Composable
fun TataletakColomn (modifier: Modifier) {
    Column(modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 20.dp)){
        Text("component1")
        Text("component2")
        Text("component3")
        Text("component4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
        Text("Komponen4")
    }
}@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Box 1")
            Text(text = "Column 1")
            Text(text = "Row 1")
            Text(text = "Box 2")
            Text(text = "Column 2")
        }
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column {
        // Baris 1
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }

        // Baris 2
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // Kolom 1
        Column {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }

        // Kolom 2
        Column {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}


