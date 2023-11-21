package com.example.informacoesdostimesbr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.informacoesdostimesbr.ui.theme.InformacoesDosTimesBrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InformacoesDosTimesBrTheme {
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun appMenuDeTime() {
    var login by remember { mutableStateOf("") }
    var nome by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var cadastrar by remember { mutableStateOf(false) }
    var confirmarSenha by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        if (cadastrar) {
            campoDeTexto(
                value = nome,
                onValueChange = { nome = it },
                idText = R.string.nome
            )
        }


        campoDeTexto(
            value = login,
            onValueChange = { login = it },
            idText = R.string.login
        )

        campoDeTexto(
            value = senha,
            onValueChange = { senha = it },
            idText = R.string.senha
        )

        if (cadastrar) {
            campoDeTexto(
                value = confirmarSenha,
                onValueChange = { confirmarSenha = it },
                idText = R.string.confirmarSenha
            )
        }

        if (!cadastrar) {
            Text(text = "Cadastrar conta",
                modifier = Modifier
                    .clickable { cadastrar = !cadastrar }
            )
        }


        Button(onClick = { /*TODO*/ }) {
            Text(
                text =
                if (cadastrar)
                    "cadastrar"
                else
                    "entrar"
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun campoDeTexto(
    value: String,
    onValueChange: (String) -> Unit,
    idText: Int,
) {
    TextField(value = value,
        onValueChange = onValueChange,
        label = {
            Text(text = stringResource(idText))
        })

    Spacer(modifier = Modifier.size(10.dp))
}