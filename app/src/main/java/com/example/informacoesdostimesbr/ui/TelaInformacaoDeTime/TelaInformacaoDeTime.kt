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
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.informacoesdostimesbr.R
import com.example.informacoesdostimesbr.model.Times
import kotlin.text.Typography.times

@OptIn(ExperimentalMaterial3Api::class)
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



@Composable
fun ListaTimes(ListaTimes:List<Times>){
    LazyColumn() {

        items(ListaTimes){
            times ->
            CardTimes(times)
        }

    }
}

@Composable
fun CardTimes(
    Times : Times
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
                        (id = Times.imagem),
                    contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                )
                Column (){
                    Text(text = Times.nomeTime,
                        fontSize = 50.sp,
                        color = Color.Black,
                        )
                    Text(text = Times.informacao,
                        fontSize = 30.sp,
                        color = Color.Black)
                }
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription =null
                )
            }
            Column {
                Text(text = "${Times.anoDeCriacao}")
                Text(text = "${Times.titulos}")

            }
        }
    }
}

@Preview
@Composable
fun Previews(){
    
}