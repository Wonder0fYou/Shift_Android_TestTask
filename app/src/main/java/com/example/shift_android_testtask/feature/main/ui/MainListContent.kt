package com.example.shift_android_testtask.feature.main.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.shift_android_testtask.component.ui.compose.UserCard
import com.example.shift_android_testtask.shared.entity.UserInfo

@Composable
fun MainListContent(
    modifier: Modifier = Modifier,
    userList: List<UserInfo>,
    currentUserClick: (String) -> Unit,
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(
            items = userList,
            key = { user -> user.login.uuid }
        ) { userInfo ->
            UserCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                imageUrl = userInfo.picture.large,
                fcs = "${userInfo.name.title} ${userInfo.name.first} ${userInfo.name.last}",
                address = "${userInfo.location.city}, ${userInfo.location.street.name} ${userInfo.location.street.number}",
                phone = userInfo.phone,
                onUserClick = { currentUserClick(userInfo.email) }
            )
        }
    }
}