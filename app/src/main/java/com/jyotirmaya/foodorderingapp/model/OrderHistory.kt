package com.jyotirmaya.foodorderingapp.model

data class OrderHistory (
    val OrderID: Int,
    val RestaurantName : String,
    val order_placed_at : String,
    val OrderedItems : ArrayList<OrderHistoryItems>
)
