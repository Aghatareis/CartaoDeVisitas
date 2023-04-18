package com.example.cartodevisitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartodevisitas.ui.theme.CartãoDeVisitasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisitasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card("Maria Aghata", "Desenvolvedora Web" )
                    Board("(11) 95216-8096", "_aghata_reis", "aghata.reis95@gmail.com")
                }
            }
        }
    }
}



@Composable
fun Card(name: String, cargo: String ) {
    Column (
        modifier = Modifier.padding(100.dp),
        verticalArrangement = Arrangement.Center,
        Alignment.CenterHorizontally
            ) {
        val image = painterResource(id = R.drawable.logotipo)

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.aspectRatio(40f / 40f),

        )

        Text(
            text = "Maria Aghata"
        )
        Text(
            text = "Desenvolvedora Web"
        )
    }

}

@Composable
fun Board(tel: String, inst: String, email: String){
    Column {
        Text(
            text = "(11) 95216-8096"
        )
        Text(
            text = "_aghata_reis"
        )
        Text(
            text = "aghata.reis95@gmail.com"
        )

    }
}

@Composable
fun Contact (nome: Painter, text: String){

}










@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CartãoDeVisitasTheme {
        Card("Maria Aghata", "Desenvolvedora Web ")
        Board("(11) 9521-68096", "_aghata_reis", "aghata.reis95@gmail.com")
    }
}