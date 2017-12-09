package jtechdev.com.booktime.data

import java.time.ZonedDateTime

data class BookLog(
        val id: Long,
        val bookId: Long,
        val startPage: Int,
        val endPage: Int,
        val startTime: ZonedDateTime,
        val endTime: ZonedDateTime,
        val sentiment: Int
)
