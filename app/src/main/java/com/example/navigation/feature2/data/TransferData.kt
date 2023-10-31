package com.example.navigation.feature2.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TransferData(
    val title: String = "Заголовок объекта"
) : Parcelable
