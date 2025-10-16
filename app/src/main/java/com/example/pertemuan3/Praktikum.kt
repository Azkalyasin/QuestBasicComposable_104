package com.example.pertemuan3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TataletakColomn (modifier: Modifier) {
    Column(modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 20.dp)){
        Text("component1")
        Text("component2")
        Text("component3")
        Text("component4")
    }
}

