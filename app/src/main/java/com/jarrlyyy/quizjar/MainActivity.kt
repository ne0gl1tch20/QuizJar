package com.jarrlyyy.quizjar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialExpressiveTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { QuizJarApp() }
    }
}

@Composable
private fun QuizJarApp() {
    MaterialExpressiveTheme {
        Text("QuizJar")
    }
}
