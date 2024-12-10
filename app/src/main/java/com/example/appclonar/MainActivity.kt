package com.example.appclonar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appclonar.ui.theme.AppClonarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppClonarTheme {
                MainScreen()
            }
        }
    }
}


@Composable
fun MainScreen() {
    var pantalla by remember { mutableStateOf("inicio") }

    Scaffold(
        bottomBar = {
            NavigationBar(
                tonalElevation = 2.dp,
                containerColor = Color.Red
            ) {
                NavigationBarItem(
                    icon = {
                        Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
                    },
                    label = {
                        Text(
                            "Inicio",
                            fontSize = 10.sp,
                            color = if (pantalla == "inicio") Color.White else Color.Gray
                        )
                    },
                    selected = pantalla == "inicio",
                    onClick = { pantalla = "inicio" }
                )
                NavigationBarItem(
                    icon = {
                        Icon(imageVector = Icons.Default.Search, contentDescription = "Home")

                    },
                    label = {
                        Text(
                            "Busqueda",
                            fontSize = 10.sp,
                            color = if (pantalla == "busqueda") Color.White else Color.Gray
                        )
                    },
                    selected = pantalla == "busqueda",
                    onClick = { pantalla = "busqueda" }
                )
                NavigationBarItem(
                    icon = {
                        Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Home")

                    },
                    label = {
                        Text(
                            "Perfil",
                            fontSize = 10.sp,
                            color = if (pantalla == "perfil") Color.White else Color.Gray
                        )
                    },
                    selected = pantalla == "perfil",
                    onClick = { pantalla = "perfil" }
                )
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            when (pantalla) {
                "inicio" -> inicio()
                "busqueda" -> busqueda()
                "perfil" -> perfil()
            }
        }
    }
}

@Composable
fun inicio() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(100.dp)
        ) {
            val image = painterResource(R.drawable.icono)
            Image(
                painter = image,
                contentDescription = "Descripción de la imagen",
                modifier = Modifier
                    .size(150.dp)
                    .padding(15.dp)
            )
        }

        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.video1),
                        contentDescription = "Descripción de la imagen",
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        "Encontré GUSANOS ANISAKIS en el PESCADO y No Creerás Lo Que Pasó!!",
                        modifier = Modifier.weight(1f),
                        fontSize = 16.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.video2),
                        contentDescription = "imagen video 2",
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        "CRUZAMOS una PISCINA con un PUENTE de 1000 METROS de CINTA AMERICANA!!",
                        modifier = Modifier.weight(1f),
                        fontSize = 16.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.video3),
                        contentDescription = "Descripción de la imagen",
                        modifier = Modifier.size(150.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        "LA MEJOR BROMA AL PESADO DE MI AMIGO!",
                        modifier = Modifier.weight(1f),
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}



@Composable
fun busqueda() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(100.dp)
        ) {
            val image = painterResource(R.drawable.icono)
            Image(
                painter = image,
                contentDescription = "",
                modifier = Modifier
                    .size(150.dp)
                    .padding(15.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(25.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Search"
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Resultados sobre Nate Gentile:", fontSize = 18.sp)
        }
        Box(modifier = Modifier.padding(20.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(), // Asegura que el Row ocupe todo el ancho
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.nate1),
                    contentDescription = "imagen video 1",
                    modifier = Modifier.size(150.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    "Llevo 10 años trabajando en esto...",
                    modifier = Modifier.weight(1f), // Asegura que el texto ocupe el espacio restante
                    fontSize = 16.sp // Opcional, para ajustar el tamaño del texto
                )
            }
        }
        Box(modifier = Modifier.padding(20.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.nate2),
                    contentDescription = "imagen video 2",
                    modifier = Modifier.size(150.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    "Cómo y por qué he cambiado mi FÍSICO, mi VIDA y mis HÁBITOS",
                    modifier = Modifier.weight(1f),
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Composable
fun perfil() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(100.dp)
        ) {
            val image = painterResource(R.drawable.icono)
            Image(
                painter = image,
                contentDescription = "Descripción de la imagen",
                modifier = Modifier
                    .size(150.dp)
                    .padding(15.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(10.dp),
        ){
            Text("Mi canal:", fontSize = 18.sp)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(25.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val image = painterResource(R.drawable.fortnite)
            Image(
                painter = image,
                contentDescription = "logo canal",
                modifier = Modifier
                    .size(150.dp)
                    .padding(15.dp)
                    .clip(CircleShape)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(15.dp),
        ){
            Text("Nombre del Canal: Efren001", fontSize = 18.sp)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(15.dp),
        ){
            Text("Numero de subscritores: 5.123.910.", fontSize = 18.sp)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(15.dp),
        ){
            Text("Ganancias último mes: +3260€.", fontSize = 18.sp)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(15.dp),
        ){
            Text("Miembro desde 2005.", fontSize = 18.sp)
        }
    }
}

