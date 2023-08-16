package com.kat4x.decomposeplayground.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.stackAnimation
import com.kat4x.decomposeplayground.navigation.ARootComponent

@Composable
fun RootContent(
    component: ARootComponent,
    modifier: Modifier = Modifier
) {
    Children(
        stack = component.stack,
        modifier = modifier,
        animation = stackAnimation(slide()),
    ) {
        when (val child = it.instance) {
            is ARootComponent.Child.ListChild -> ListContent(
                component = child.component,
                modifier = Modifier.fillMaxSize()
            )

            is ARootComponent.Child.DetailsChild -> DetailsContent(
                component = child.component,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}