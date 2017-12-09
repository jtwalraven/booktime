package jtechdev.com.booktime.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.time.ZonedDateTime

@Entity(tableName = "book_log")
data class BookLog(
        @PrimaryKey(autoGenerate = true)
        val id: Long,
        val bookId: Long,
        val startPage: Int,
        val endPage: Int,
        val startTime: ZonedDateTime,
        val endTime: ZonedDateTime,
        val sentiment: Int
)
