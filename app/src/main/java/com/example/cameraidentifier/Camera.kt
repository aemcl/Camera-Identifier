package com.example.cameraidentifier

import android.util.Log
import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
//import androidx.compose.runtime.R
import com.example.cameraidentifier.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CameraIdentifier(){

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(
            painter = painterResource(id = R.drawable.cam),
            contentDescription = "Image Here",
            modifier = Modifier.size(200.dp)
        )

        Button(onClick = { }) {
            Text(text = "Load Image")
        }

        Spacer(modifier = Modifier.width(16.dp))

        Button(onClick = { }) {
            Text(text = "Take Image")
        }

        Spacer(modifier = Modifier.width(16.dp))
        
        Text(
            text = "Result",
            modifier = Modifier.align(Alignment.Start),
            //style = ""
        )
    }

}