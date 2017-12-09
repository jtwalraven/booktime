package jtechdev.com.booktime.bookview

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import jtechdev.com.booktime.R

class BookViewHolder(bookView: View): RecyclerView.ViewHolder(bookView) {
    val cardView: CardView = bookView.findViewById(R.id.bookCardView)
    val bookImage: ImageView = bookView.findViewById(R.id.bookImage)
    val bookTitle: TextView = bookView.findViewById(R.id.bookTitle)
    val bookAuthor: TextView = bookView.findViewById(R.id.bookAuthor)
    val bookISBN: TextView = bookView.findViewById(R.id.bookISBN)
    val bookProgress: TextView = bookView.findViewById(R.id.bookProgress)
}