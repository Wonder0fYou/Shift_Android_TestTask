package com.example.shift_android_testtask.shared.entity

import androidx.room.Embedded

data class LocationEntity(
    @Embedded(prefix = "street_")
    val street: StreetEntity,
    val city: String,
    val state: String,
    val country: String,
    val postcode: String,
    @Embedded(prefix = "coordinates_")
    val coordinates: CoordinatesEntity,
    @Embedded(prefix = "timezone_")
    val timezone: TimezoneEntity
)
