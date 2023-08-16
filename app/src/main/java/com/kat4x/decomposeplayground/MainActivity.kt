package com.kat4x.decomposeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.arkivanov.decompose.defaultComponentContext
import com.kat4x.decomposeplayground.navigation.DefaultRootComponent
import com.kat4x.decomposeplayground.ui.RootContent
import com.kat4x.decomposeplayground.ui.theme.DecomposeplaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = DefaultRootComponent(componentContext = defaultComponentContext())
        setContent {
            DecomposeplaygroundTheme {
                Surface {
                    RootContent(component = root)
                }
            }
        }
    }
}
