package com.example.shift_android_testtask.feature.main.data.mapper

import com.example.shift_android_testtask.core.network.model.CoordinatesDto
import com.example.shift_android_testtask.core.network.model.DobDto
import com.example.shift_android_testtask.core.network.model.IdDto
import com.example.shift_android_testtask.core.network.model.LocationDto
import com.example.shift_android_testtask.core.network.model.LoginDto
import com.example.shift_android_testtask.core.network.model.NameDto
import com.example.shift_android_testtask.core.network.model.PictureDto
import com.example.shift_android_testtask.core.network.model.RegisteredDto
import com.example.shift_android_testtask.core.network.model.StreetDto
import com.example.shift_android_testtask.core.network.model.TimezoneDto
import com.example.shift_android_testtask.core.network.model.UserDto
import com.example.shift_android_testtask.feature.main.domain.entity.CoordinatesEntity
import com.example.shift_android_testtask.feature.main.domain.entity.DobEntity
import com.example.shift_android_testtask.feature.main.domain.entity.IdEntity
import com.example.shift_android_testtask.feature.main.domain.entity.LocationEntity
import com.example.shift_android_testtask.feature.main.domain.entity.LoginEntity
import com.example.shift_android_testtask.feature.main.domain.entity.NameEntity
import com.example.shift_android_testtask.feature.main.domain.entity.PictureEntity
import com.example.shift_android_testtask.feature.main.domain.entity.RegisteredEntity
import com.example.shift_android_testtask.feature.main.domain.entity.StreetEntity
import com.example.shift_android_testtask.feature.main.domain.entity.TimezoneEntity
import com.example.shift_android_testtask.feature.main.domain.entity.UserInfo
import javax.inject.Inject

class UserInfoMapper @Inject constructor() {

    fun map(userInfo: List<UserDto>): List<UserInfo> {
        val userList = userInfo.map { userDto ->
            mapUserInfo(userDto)
        }
        return userList
    }

    private fun mapUserInfo(userDto: UserDto) = UserInfo(
        gender = userDto.gender,
        name = mapNameEntity(userDto.name),
        location = mapLocationEntity(userDto.location),
        email = userDto.email,
        login = mapLoginEntity(userDto.login),
        dob = mapDobEntity(userDto.dob),
        registered = mapRegisteredEntity(userDto.registered),
        phone = userDto.phone,
        cell = userDto.cell,
        id = mapIdEntity(userDto.id),
        picture = mapPictureEntity(userDto.picture),
        nat = userDto.nat,
    )

    private fun mapPictureEntity(pictureDto: PictureDto) = PictureEntity(
        large = pictureDto.large,
        medium = pictureDto.medium,
        thumbnail = pictureDto.thumbnail
    )

    private fun mapIdEntity(idDto: IdDto) = IdEntity(
        name = idDto.name,
        value = idDto.value,
    )

    private fun mapRegisteredEntity(registeredDto: RegisteredDto) = RegisteredEntity(
        date = registeredDto.date,
        age = registeredDto.age
    )

    private fun mapDobEntity(dobDto: DobDto) = DobEntity(
        date = dobDto.date,
        age = dobDto.age,
    )

    private fun mapLoginEntity(loginDto: LoginDto) = LoginEntity(
        username = loginDto.username,
        uuid = loginDto.uuid,
        password = loginDto.password,
        salt = loginDto.salt,
        sha256 = loginDto.sha256,
        sha1 = loginDto.sha1,
        md5 = loginDto.md5,
    )

    private fun mapLocationEntity(locationDto: LocationDto) = LocationEntity(
        street = mapStreetEntity(locationDto.street),
        city = locationDto.city,
        state = locationDto.state,
        coordinates = mapCoordinatesEntity(locationDto.coordinates),
        country = locationDto.country,
        timezone = mapTimezoneEntity(locationDto.timezone),
        postcode = locationDto.postcode,
    )

    private fun mapTimezoneEntity(timezoneDto: TimezoneDto) = TimezoneEntity(
        offset = timezoneDto.offset,
        description = timezoneDto.description,
    )

    private fun mapCoordinatesEntity(coordinatesDto: CoordinatesDto) = CoordinatesEntity(
        latitude = coordinatesDto.latitude,
        longitude = coordinatesDto.longitude
    )

    private fun mapStreetEntity(streetDto: StreetDto) = StreetEntity(
        name = streetDto.name,
        number = streetDto.number
    )

    private fun mapNameEntity(nameDto: NameDto) = NameEntity(
        title = nameDto.title,
        last = nameDto.last,
        first = nameDto.first
    )
}