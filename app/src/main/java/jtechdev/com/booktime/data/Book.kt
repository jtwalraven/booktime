package jtechdev.com.booktime.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(tableName = "book")
data class Book(
        @PrimaryKey(autoGenerate = true)
        val id: Long,
        val name: String,
        val author: String,
        val date: Date,
        val isbn: String,
        val imageUrl: String,
        val currentPage: Int,
        val totalPages: Int
)