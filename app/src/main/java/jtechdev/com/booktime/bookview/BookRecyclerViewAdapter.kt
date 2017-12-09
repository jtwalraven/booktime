package jtechdev.com.booktime.bookview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import jtechdev.com.booktime.data.Book
import android.view.LayoutInflater
import com.squareup.picasso.Picasso
import jtechdev.com.booktime.R


class BookRecyclerViewAdapter(private val context: Context,
                              private val books: List<Book> = emptyList()): RecyclerView.Adapter<BookViewHolder>() {

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_card, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        Picasso.with(context)
                .load(books[position].imageUrl)
                .resize(200, 200)
                .centerCrop()
                .into(holder.bookImage)
        holder.bookTitle.text = books[position].name
        holder.bookAuthor.text = books[position].author
        holder.bookISBN.text = context.resources.getString(
                R.string.isbn_text,
                books[position].isbn
        )
        holder.bookProgress.text = context.resources.getString(
                R.string.page_progress,
                books[position].currentPage,
                books[position].totalPages
        )
    }

}