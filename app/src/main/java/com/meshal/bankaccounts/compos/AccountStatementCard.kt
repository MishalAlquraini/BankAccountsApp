package com.meshal.bankaccounts.compos

import androidx.collection.emptyLongSet
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.meshal.bankaccounts.data.AccountStatement
import com.meshal.bankaccounts.data.TransactionType


@Composable
fun AccountStatementCard(statement: AccountStatement){
    val transactionColor = if (statement.type == TransactionType.Deposit){Color.Blue} else {Color.Red}

    Card(modifier = Modifier.fillMaxSize()
        .padding(10.dp)
        .shadow(5.dp, shape = RoundedCornerShape(12.dp))
    )
    {
        Column(modifier = Modifier.fillMaxSize().padding(6.dp))
        {
           Text (
               text = statement.accountName,
               style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Type: ${statement.type}",
                color = transactionColor,
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text (
                text = "From: ${statement.senderAccountNumber}",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "To: ${statement.receiverAccountNumber}",
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Amount: ${statement.amount}",
                style = MaterialTheme.typography.headlineSmall
            )

        }

    }
}