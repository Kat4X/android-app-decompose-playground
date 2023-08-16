package com.kat4x.decomposeplayground.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value

interface DetailsComponent {
    val model: Value<Model>

    fun onBackClicked()

    data class Model(
        val item: String,
    )
}

class DefaultDetailsComponent(
    componentContext: ComponentContext,
    private val item: String,
    private val onFinished: () -> Unit,
) : DetailsComponent {
    override val model: Value<DetailsComponent.Model> =
        MutableValue(DetailsComponent.Model(item = item))

    override fun onBackClicked() {
        onFinished()
    }

}
