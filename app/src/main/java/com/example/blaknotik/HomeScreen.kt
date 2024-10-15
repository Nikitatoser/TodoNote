package com.example.blaknotik

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun HomeScreen(navController: NavController) {
    MainScreen(navController)

}

@Composable
fun MainScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) { // Вся вміст на екрані буде всередині цього Box
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 30.dp), // Відступи для всього вмісту
            verticalArrangement = Arrangement.Top // Вміст буде йти зверху вниз
        ) {
            Box(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .shadow(
                        elevation = 8.dp, // Висота тіні
                        shape = RoundedCornerShape(40.dp) // Форма тіні (так само як у Box)
                    )
                    .clip(RoundedCornerShape(40.dp)) // Закруглення кутів
                    .background(Color.White)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically, // Вирівнювання по вертикалі
                    horizontalArrangement = Arrangement.Center // Вирівнювання по центру горизонтально
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.oruser),
                        contentDescription = "user",
                        modifier = Modifier.size(45.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp)) // Пробіл між зображенням та текстом
                    Text(
                        text = "Username",
                        color = Color.Gray,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Light,
                        textAlign = TextAlign.Center // Текст по центру
                    )
                }
            }

            // Генерація ліній і текстів
            for (i in 1..3) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                ) {
                    Divider(
                        color = Color(0xFFF88837),
                        thickness = 2.dp,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.weight(0.7f)) {
                                Text(
                                    text = "Name",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp
                                )
                                Text(
                                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n",
                                    fontWeight = FontWeight.Light,
                                    color = Color.Gray,
                                    fontSize = 18.sp
                                )
                            }
                            Column(modifier = Modifier.weight(0.3f)) {
                                Button(
                                    onClick = { /* TODO */ },
                                    modifier = Modifier
                                        .padding(5.dp)
                                        .shadow(8.dp, shape = ButtonDefaults.shape)
                                        .background(Color.White)
                                        .fillMaxWidth(),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color.White
                                    )
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.pan),
                                        contentDescription = "user",
                                        modifier = Modifier.size(35.dp)
                                    )
                                }
                                Button(
                                    onClick = { /* TODO */ },
                                    modifier = Modifier
                                        .padding(5.dp)
                                        .shadow(8.dp, shape = ButtonDefaults.shape)
                                        .background(Color.White)
                                        .fillMaxWidth(),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color.White
                                    )

                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.trash),
                                        contentDescription = "user",
                                        modifier = Modifier.size(35.dp)
                                    )
                                }
                            }
                        }
                    }

                    Divider(
                        color = Color(0xFFF88837),
                        thickness = 2.dp,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
        var showDialog by remember { mutableStateOf(false) }
        Button(
            onClick = { showDialog = true },
            modifier = Modifier
                .padding(vertical = 60.dp, horizontal = 16.dp) // Відступи для кнопки
                .align(Alignment.BottomEnd) // Вирівнювання кнопки в правому нижньому кутку
                .height(50.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF88837) // Колір фону кнопки
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = "user",
                modifier = Modifier
                    .size(50.dp) // Зміна розміру іконки для відповідного відображення
            )
        }
        if (showDialog) {
            CustomDialog(onDismiss = { showDialog = false })
        }


    }
}


@Composable
fun CustomDialog(onDismiss: () -> Unit) {
    var title by remember { mutableStateOf(TextFieldValue()) }
    var description by remember { mutableStateOf(TextFieldValue()) }

    Dialog(onDismissRequest = { onDismiss() }) {
        Box(
            modifier = Modifier
                .width(300.dp) // Задаємо ширину
                .height(400.dp) // Задаємо висоту
                .background(Color.White, shape = RoundedCornerShape(16.dp)) // Закруглення кутів для фону
                .clip(RoundedCornerShape(16.dp)) // Закруглення кутів для контейнера
                .padding(16.dp) // Відступи всередині вікна
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Add new note",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    fontSize = 24.sp
                )

                // Поле для вводу назви
                OutlinedTextField(
                    value = title,
                    onValueChange = { title = it },
                    label = { Text("Title") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    shape = RoundedCornerShape(12.dp), // Округлення кутів
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = Color(0xFFF88837), // Колір обводки при фокусі
                        unfocusedIndicatorColor = Color(0xFFF88837), // Колір обводки без фокусу
                        focusedContainerColor = Color.White, // Колір фону при фокусі
                        unfocusedContainerColor = Color.White // Колір фону без фокусу
                    ),
                    singleLine = true
                )

                // Поле для вводу опису з можливістю переносу тексту
                OutlinedTextField(
                    value = description,
                    onValueChange = { description = it },
                    label = { Text("Description") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp)
                        .heightIn(min = 120.dp), // Мінімальна висота для поля опису
                    shape = RoundedCornerShape(12.dp), // Округлення кутів
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = Color(0xFFF88837), // Колір обводки при фокусі
                        unfocusedIndicatorColor = Color(0xFFF88837), // Колір обводки без фокусу
                        focusedContainerColor = Color.White, // Колір фону при фокусі
                        unfocusedContainerColor = Color.White // Колір фону без фокусу
                    ),
                    maxLines = 5, // Максимум 5 рядків
                    textStyle = LocalTextStyle.current.copy(fontSize = 16.sp) // Трошки змінюємо стиль шрифту
                )

                // Кнопки
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    // Кнопка закриття
                    Button(
                        onClick = { onDismiss() },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF88837)),
                        modifier = Modifier.weight(1f) // Кнопки рівної ширини
                    ) {
                        Text("Close")
                    }

                    // Кнопка збереження
                    Button(
                        onClick = {
                            // Зберегти дані (логіка збереження)
                            onDismiss()
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF88837)),
                        modifier = Modifier.weight(1f) // Кнопки рівної ширини
                    ) {
                        Text("Save")
                    }
                }
            }
        }
    }
}

