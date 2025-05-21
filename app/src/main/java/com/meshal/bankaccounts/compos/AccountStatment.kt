package com.meshal.bankaccounts.compos

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.meshal.bankaccounts.data.AccountStatement

@Composable
fun AccountStatementPage(statements: List<AccountStatement>,modifier: Modifier=Modifier)
{
LazyColumn {
    items(statements){
        AccountStatementCard(it)
        Spacer(modifier = modifier.height(5.dp))
    }
}
}