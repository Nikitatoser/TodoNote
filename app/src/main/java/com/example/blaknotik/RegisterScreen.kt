package com.example.blaknotik

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun RegisterScreen(navController: NavController) {
    SignUp(navController)
}

@Composable
fun SignUp(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Create an account",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Start, // Текст вирівнюється по лівому краю
            maxLines = 2, // Максимум два рядки
            overflow = TextOverflow.Ellipsis, // Обробка переповнення тексту
            modifier = Modifier
                .fillMaxWidth() // Заповнює всю ширину
                .padding(bottom = 32.dp)
        )
        OutlinedTextField(
            value = TextFieldValue("Email"),
            onValueChange = { /* TODO */ },

            leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            shape = RoundedCornerShape(50.dp), // Округлення кутів
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color(0xFFF88837), // Колір обводки при фокусі
                unfocusedIndicatorColor = Color(0xFFF88837), // Колір обводки без фокусу
                focusedContainerColor = Color.White, // Колір фону при фокусі
                unfocusedContainerColor = Color.White // Колір фону без фокусу
            ),
            singleLine = true
        )
        OutlinedTextField(
            value = TextFieldValue("Password"),
            onValueChange = { /*TODO*/ },

            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
            trailingIcon = { Icon(Icons.Default.Visibility, contentDescription = null) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            shape = RoundedCornerShape(50.dp), // Округлення кутів
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color(0xFFF88837), // Колір обводки при фокусі
                unfocusedIndicatorColor = Color(0xFFF88837), // Колір обводки без фокусу
                focusedContainerColor = Color.White, // Колір фону при фокусі
                unfocusedContainerColor = Color.White // Колір фону без фокусу
            ),
            singleLine = true
        )
        OutlinedTextField(
            value = TextFieldValue("Password"),
            onValueChange = { /*TODO*/ },

            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
            trailingIcon = { Icon(Icons.Default.Visibility, contentDescription = null) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            shape = RoundedCornerShape(50.dp), // Округлення кутів
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color(0xFFF88837), // Колір обводки при фокусі
                unfocusedIndicatorColor = Color(0xFFF88837), // Колір обводки без фокусу
                focusedContainerColor = Color.White, // Колір фону при фокусі
                unfocusedContainerColor = Color.White // Колір фону без фокусу
            ),
            singleLine = true
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF88837)
            ),
            shape = RoundedCornerShape(12.dp)

        ) {

            Text(text = "Create Account"
                , color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold)
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "I Already Have an Account",
                fontSize = 18.sp,
                fontWeight = FontWeight.Light,
                color = Color.Gray,
                modifier = Modifier.padding(end = 8.dp))
            Text(
                text = "Sign in",
                modifier = Modifier
                    .clickable {
                        navController.navigate("login")
                    },
                color = Color(0xFFF88837), // Колір тексту
                fontSize = 18.sp, // Розмір тексту
                fontWeight = FontWeight.Bold // Жирний шрифт (опційно)
            )
        }
    }
}