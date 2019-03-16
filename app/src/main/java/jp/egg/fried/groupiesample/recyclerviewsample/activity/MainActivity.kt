package jp.egg.fried.groupiesample.recyclerviewsample.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.egg.fried.groupiesample.R
import jp.egg.fried.groupiesample.groupiesample.activity.GroupieActivity
import jp.egg.fried.groupiesample.recyclerviewsample.adapter.RecyclerAdapter

class MainActivity
    : AppCompatActivity()
        , RecyclerAdapter.OnClickListener {


    //region: override AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = (0 until 20).map {
            val type = it % 2
            RecyclerAdapter.Data(type)
        }.toMutableList()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = RecyclerAdapter(this, items).apply {
            listener = this@MainActivity
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }


    override fun onResume() {
        super.onResume()
        setTitle(R.string.activity_main_title)
    }
    //endregion


    //region: override RecyclerAdapter.OnClickListener
    override fun onClick() {
        startActivity(Intent(this, GroupieActivity::class.java))
    }
    //endregion


}
