package jtechdev.com.booktime.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(Book::class), version = 1)
abstract class BookDatabase: RoomDatabase() {
    abstract fun bookDao(): BookDao
}
