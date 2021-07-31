package ru.geekbrains.androidwithkotlin.model.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Film(
    val film: String,
    val rating: Int = 7,
    val beginRating: Int = 5,
) : Parcelable