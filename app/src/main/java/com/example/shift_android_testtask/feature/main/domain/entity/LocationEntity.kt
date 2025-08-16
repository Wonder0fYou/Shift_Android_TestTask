package com.example.shift_android_testtask.feature.main.domain.entity

data class LocationEntity(
    val street: StreetEntity,
    val city: String,
    val state: String,
    val country: String,
    val postcode: String,
    val coordinates: CoordinatesEntity,
    val timezone: TimezoneEntity
)
