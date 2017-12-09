package jtechdev.com.booktime.data

import java.util.*

data class Book(
        val id: Long,
        val name: String,
        val author: String,
        val date: Date,
        val isbn: String,
        val imageUrl: String,
        val currentPage: Int,
        val totalPages: Int
)