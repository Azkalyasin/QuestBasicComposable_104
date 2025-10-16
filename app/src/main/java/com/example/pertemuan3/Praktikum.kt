package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.contentValuesOf

@Composable
fun TataletakColomn (modifier: Modifier) {
    Column(modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 20.dp)){
        Text("component1",
            color = Color.Blue
        )
        Text("component2",
            color = Color.Blue
        )
        Text("component3",
            color = Color.Blue
        )
        Text("component4",
            color = Color.Blue
        )
    }
}

@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("Komponen1", color = Color.Blue)
        Text("Komponen2", color = Color.Red)
        Text("Komponen3", color = Color.Green)
        Text("Komponen4", color = Color.Magenta)
    }
}

@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xFFBBDEFB)),
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
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp)
            .background(Color(0xFFFFF9C4))
    ) {
        // Baris 1
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1", color = Color.Blue)
            Text(text = "Komponen2Baris1", color = Color.Red)
            Text(text = "Komponen3Baris1", color = Color.Green)
        }

        // Baris 2
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2", color = Color.Magenta)
            Text(text = "Komponen2Baris2", color = Color.DarkGray)
            Text(text = "Komponen3Baris2", color = Color.Cyan)
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
            Text(text = "Komponen1Kolom1", fontSize = 16.sp, fontWeight = FontWeight.Bold)
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

@Composable
fun TataletakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.getbyid)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 100.dp)
                .background(color = Color.Yellow)
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            Column() {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row1_Komponen1")
                    Text(text = "Col1_Row1_Komponen2")
                    Text(text = "Col1_Row1_Komponen3")
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row2_Komponen1")
                    Text(text = "Col1_Row2_Komponen2")
                    Text(text = "Col1_Row2_Komponen3")
                }
            }
        }
        Spacer(modifier = Modifier.height( height = 10.dp))
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height( height = 300.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ){
            Image(painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit)
            Text(text = "My Music",
                fontSize = 50.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(
                    alignment = Alignment.Center))
        }
    }
}
