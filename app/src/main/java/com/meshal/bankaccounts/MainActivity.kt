package com.meshal.bankaccounts

import android.accounts.Account
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.meshal.bankaccounts.compos.AccountStatementCard
import com.meshal.bankaccounts.compos.AccountStatementPage
import com.meshal.bankaccounts.data.AccountStatement
import com.meshal.bankaccounts.data.TransactionType
import com.meshal.bankaccounts.ui.theme.BankAccountsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BankAccountsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (modifier = Modifier.padding(innerPadding)){

                        val statements = listOf(
                            AccountStatement(
                                "Meshal Savings",
                                TransactionType.Deposit,
                                200.0,
                                "123323",
                                "122243"
                            ),
                            AccountStatement(
                                "Saqer checking",
                                TransactionType.Withdraw,
                                120.0,
                                "122243",
                                "12234"
                            ),
                            AccountStatement(
                                "Sara checking",
                                TransactionType.Deposit,
                                1200.0,
                                "000000",
                                "122340"
                            ),
                            AccountStatement(
                                "Ali checking",
                                TransactionType.Withdraw,
                                250.0,
                                "122243",
                                "122340"
                            ),
                            AccountStatement(
                                "Ali checking",
                                TransactionType.Withdraw,
                                250.0,
                                "122243",
                                "122340"
                            ),
                            AccountStatement(
                                "Ali checking",
                                TransactionType.Withdraw,
                                250.0,
                                "122243",
                                "122340"
                            ),
                            AccountStatement(
                                "Ali checking",
                                TransactionType.Withdraw,
                                250.0,
                                "122243",
                                "122340"
                            ),
                            )


                        AccountStatementPage(statements)

                    }
                }
            }
        }
    }
}



