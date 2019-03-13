package jp.egg.fried.groupiesample.recyclerviewsample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.egg.fried.groupiesample.R
import jp.egg.fried.groupiesample.recyclerviewsample.adapter.RecyclerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // MainActivity

        val items = (0 until 20).map {
            val type = it % 2
            RecyclerAdapter.Data(type)
        }.toMutableList()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(this, items)
    }


}
