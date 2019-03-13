package jp.egg.fried.groupiesample.recyclerviewsample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import jp.egg.fried.groupiesample.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //RecyclerViewの初期化
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView

    }


}
