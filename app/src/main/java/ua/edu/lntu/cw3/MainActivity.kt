package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.cw3.ui.theme.IPZ_CR_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CR_3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun CustomList() {
    LazyColumn {
        item { CustomListItem(title = "Заголовок1", subtitle = "Підзаголовок1", text = "Текст1") }
        item { CustomListItem(title = "Заголовок2", subtitle = "Підзаголовок2", text = "Текст2") }
        item { CustomListItem(title = "Заголовок3", subtitle = "Підзаголовок3", text = "Текст3") }
    }
}

@Composable
fun CustomListItem(title: String, subtitle: String, text: String) {
    Column {
        Text(text = title,
            style = MaterialTheme.typography.headlineLarge)
        Text(text = subtitle,
            style = MaterialTheme.typography.labelMedium)
        Text(text = text,
            style = MaterialTheme.typography.bodySmall)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ_CR_3Theme {
        CustomList()
    }
}
