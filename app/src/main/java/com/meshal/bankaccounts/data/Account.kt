package com.meshal.bankaccounts.data


enum class TransactionType {
    Deposit, Withdraw
}


data class AccountStatement(
    val accountName: String,
    val type: TransactionType,
    val amount: Double,
    val senderAccountNumber: String,
    val receiverAccountNumber: String
)
