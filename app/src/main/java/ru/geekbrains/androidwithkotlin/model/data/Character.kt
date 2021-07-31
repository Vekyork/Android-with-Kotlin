package ru.geekbrains.androidwithkotlin.model.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Character(
    val film: Film = getDefaultFilm(),
    val rating: Int = 7,
    val beginRating: Int = 5,
) : Parcelable

fun getDefaultFilm() = Film("Том и Джерри", 7, 5)