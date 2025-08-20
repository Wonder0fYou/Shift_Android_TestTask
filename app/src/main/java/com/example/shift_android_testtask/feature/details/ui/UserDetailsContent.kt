package com.example.shift_android_testtask.feature.details.ui

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.shift_android_testtask.component.ui.compose.UiText
import com.example.shift_android_testtask.component.ui.compose.WrapperImage
import com.example.shift_android_testtask.shared.entity.UserInfo
import com.example.shift_android_testtask.shared.util.startActivity

@Composable
fun UserDetailsContent(
    modifier: Modifier = Modifier,
    user: UserInfo,
) {
    val context = LocalContext.current

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            WrapperImage(
                model = user.picture.large,
                contentDescription = "User Avatar",
                modifier = Modifier
                    .size(128.dp)
                    .clip(CircleShape),
            )
        }
        item {
            ClickableInfoRow(
                label = "gender",
                value = user.gender,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "title",
                value = user.name.title,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "first",
                value = user.name.first,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "last",
                value = user.name.last,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "street number",
                value = user.location.street.number.toString(),
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "street name",
                value = user.location.street.name,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "location city",
                value = user.location.city,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "location state",
                value = user.location.state,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "location country",
                value = user.location.country,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "location postcode",
                value = user.location.postcode,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "coordinates latitude",
                value = user.location.coordinates.latitude,
                onClick = {
                    val gmmIntentUri =
                        Uri.parse("geo:${user.location.coordinates.latitude},${user.location.coordinates.longitude}")
                    val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                    startActivity(context, mapIntent, "Не найдено приложение для карт")
                }
            )
        }
        item {
            ClickableInfoRow(
                label = "coordinates longitude",
                value = user.location.coordinates.longitude,
                onClick = {
                    val gmmIntentUri =
                        Uri.parse("geo:${user.location.coordinates.latitude},${user.location.coordinates.longitude}")
                    val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                    startActivity(context, mapIntent, "Не найдено приложение для карт")
                }
            )
        }
        item {
            ClickableInfoRow(
                label = "timezone offset",
                value = user.location.timezone.offset,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "timezone description",
                value = user.location.timezone.description,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "email",
                value = user.email,
                onClick = {
                    val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:${user.email}"))
                    startActivity(context, intent, "Не найдено приложение для отправки Email")
                }
            )
        }
        item {
            ClickableInfoRow(
                label = "login uuid",
                value = user.login.uuid,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "login username",
                value = user.login.username,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "login salt",
                value = user.login.password,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "login salt",
                value = user.login.salt,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "login md5",
                value = user.login.md5,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "login sha1",
                value = user.login.sha1,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "login sha256",
                value = user.login.sha256,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "dob date",
                value = user.dob.date,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "dob age",
                value = user.dob.age.toString(),
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "registered date",
                value = user.registered.date,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "registered age",
                value = user.registered.age.toString(),
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "phone",
                value = user.phone,
                onClick = {
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${user.phone}"))
                    startActivity(context, intent, "Не найдено приложение для звонков")
                }
            )
        }
        item {
            ClickableInfoRow(
                label = "cell",
                value = user.cell,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "id name",
                value = user.id.name,
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "id value",
                value = user.id.value ?: "",
                onClick = {}
            )
        }
        item {
            ClickableInfoRow(
                label = "nat",
                value = user.nat,
                onClick = {}
            )
        }
    }
}

@Composable
private fun ClickableInfoRow(label: String, value: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        UiText(
            text = label,
        )
        Spacer(modifier = Modifier.weight(1f))
        UiText(
            text = value,
        )
    }
}