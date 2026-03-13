package com.example.financeapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.financeapp.models.Transaction
import com.example.financeapp.models.transactions


@Composable
fun Transactions(transactions: List<Transaction>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Transactions",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "See All",
                color = Color.Gray,
                fontSize = 14.sp
            )
        }

        LazyColumn {
            items(transactions) { transaction ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = transaction.icon,
                            contentDescription = "transaccion",
                            modifier = Modifier
                                .size(36.dp)
                                .padding(end = 12.dp)

                        )

                        Column {
                            Text(
                                text = transaction.store,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = transaction.category,
                                color = Color.Gray,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Column(
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = "$${transaction.amount}",
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = transaction.time,
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTransactions() {
    Transactions(transactions)
}
