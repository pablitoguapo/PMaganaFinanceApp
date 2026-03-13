package com.example.financeapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

data class Transaction(
    val store: String,
    val category: String,
    val amount: Double,
    val time: String,
    val icon: ImageVector
)


val transactions = listOf(
    Transaction("Supermarket","Groceries",45.99,"10:30 AM", Icons.Default.ShoppingCart),
    Transaction("Gas Station","Fuel",-30.5,"12:15 PM",Icons.Default.ShoppingCart),
    Transaction("Coffee Shop","Food & Drinks",5.75,"8:00 AM",Icons.Default.ShoppingCart),
    Transaction("Electronics Store","Electronics",120.0,"3:45 PM",Icons.Default.ShoppingCart),
    Transaction("Bookstore","Books",25.99,"2:00 PM", Icons.Default.ShoppingCart),
    Transaction("Restaurant","Dining",60.0,"7:30 PM",Icons.Default.ShoppingCart)
)