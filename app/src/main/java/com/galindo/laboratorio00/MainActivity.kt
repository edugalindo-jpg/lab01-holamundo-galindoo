package com.galindo.laboratorio00

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.galindo.laboratorio00.ui.theme.Laboratorio00Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio00Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {

        Text(
            text = "Hello $name!",
            fontSize = 24.sp
        )
        Text(
            text = "Profesor: Leon Suiyon,Juan Jose ",
            fontSize = 22.sp
        )
        Text(
            text = "Correo: edu.galindo@tecsuo.edu.pe",
            color = Color.Blue,
            fontSize = 18.sp
        )
        Text(
            text = "Curso: Programacion en Moviles"
        )
        Text(
            text = "Carrera: Diseño y desarrolo de software"
        )
        Button(onClick = { println("Boton presionado")}) { Text(text = "presioname")}
    }
        Text(
            text = "año: 2026"
        )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio00Theme {
        Greeting("Edu Galindo")
    }

}

