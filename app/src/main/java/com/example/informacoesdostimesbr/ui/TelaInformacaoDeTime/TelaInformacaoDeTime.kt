package com.example.informacoesdostimesbr.ui.TelaInformacaoDeTime

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.informacoesdostimesbr.R
import com.example.informacoesdostimesbr.model.Times

@Composable
fun TelaInformacaoDeTime(
    espacoDasBarras: PaddingValues,
    controleNavegacao: NavController
){
    Column(
        modifier = Modifier
            .padding(espacoDasBarras)
    ) {
        Text(
            text = "Funcionou!!!"
        )
        Button(
            onClick = {
                controleNavegacao.navigate("TelaLogin")
            }
        ) {
            Text(text = "Voltar")
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun ListaTimes(listaTimes:List<Times>){
    LazyColumn() {

        items(listaTimes){
            times ->
            CardTimes()
        }

    }
}

@Preview
@Composable
fun CardTimes(
    Times: Times
){

    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Column {
            Row{
                Image(
                    painter = painterResource
                        (id = R.drawable.corinthians),
                    contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                )
                Column (){
                    Text("Informação do corinthians:")
                    Text(text = "")
                }
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription =null
                )
            }
            Column {
                Text(text = "")

            }
        }
    }
}