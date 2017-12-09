package jtechdev.com.booktime

import android.icu.util.Calendar
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import jtechdev.com.booktime.bookview.BookRecyclerViewAdapter

import kotlinx.android.synthetic.main.activity_time_log.*
import android.support.v7.widget.RecyclerView
import jtechdev.com.booktime.data.Book


class TimeLog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_log)
        setSupportActionBar(toolbar)

        addBookFab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        // Create a demo list
        val demoList = listOf(
                Book(1,
                        "The Great Gatsby",
                        "Scott Fitzgerald",
                        Calendar.getInstance().time,
                        "1781396833",
                        "http://images.gr-assets.com/books/1490528560l/4671.jpg",
                        150,
                        430)
        )

        val bookList: RecyclerView = findViewById(R.id.bookList)

        val linearLayoutManager = LinearLayoutManager(this)
        bookList.layoutManager = linearLayoutManager

        val bookRecyclerViewAdapter = BookRecyclerViewAdapter(this, demoList)
        bookList.adapter = bookRecyclerViewAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_time_log, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
