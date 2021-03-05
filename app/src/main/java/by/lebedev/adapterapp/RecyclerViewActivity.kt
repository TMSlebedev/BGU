package by.lebedev.adapterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.lebedev.adapterapp.adapter.PersonAdapter
import by.lebedev.adapterapp.entity.PersonList

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val adapter = PersonAdapter(PersonList.provideList())

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}