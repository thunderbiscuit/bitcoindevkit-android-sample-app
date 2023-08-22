/**
 * Copyright 2021-2022 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE file.
 */

package com.goldenraven.devkitwallet.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.goldenraven.devkitwallet.ui.theme.DevkitWalletColors
import com.goldenraven.devkitwallet.ui.theme.firaMonoMedium

@Composable
internal fun AwayFromHomeAppBar(navController: NavController, title: String) {
    SmallTopAppBar(
        title = { IntroAppTitle(title) },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = DevkitWalletColors.primaryDark),
        navigationIcon = {
            IconButton(onClick = { navController.navigate(Screen.WalletScreen.route) }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Go Back",
                    tint = DevkitWalletColors.white
                )
            }
        },
        actions = { }
    )
}

@Composable
internal fun IntroAppBar() {
    SmallTopAppBar(
        title = { IntroAppTitle("Devkit Wallet") },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = DevkitWalletColors.primaryDark),
        actions = { }
    )
}

@Composable
internal fun IntroAppTitle(title: String) {
    Text(
        text = title,
        color = DevkitWalletColors.white,
        fontFamily = firaMonoMedium,
        fontSize = 20.sp
    )
}
