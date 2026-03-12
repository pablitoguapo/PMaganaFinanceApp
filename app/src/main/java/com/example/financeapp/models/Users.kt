package com.example.financeapp.models

data class User(
    val name: String,
    val balance: Double
)

val users = User("Pablo", 1200.0)