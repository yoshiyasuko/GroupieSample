package jp.egg.fried.groupiesample.groupiesample.activity

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.OnItemClickListener
import com.xwray.groupie.ViewHolder
import jp.egg.fried.groupiesample.R
import jp.egg.fried.groupiesample.groupiesample.item.AndroidHelloItem
import jp.egg.fried.groupiesample.groupiesample.item.HelloWorldItem


/**
 * GroupieActivity
 *
 * Created by Yoshiyasu on 2019/03/14
 */

class GroupieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // GroupieActivity

        val items = (0 until 20).map {
            when (it % 2) {
                0 -> HelloWorldItem()
                1 -> AndroidHelloItem()
                else -> HelloWorldItem()
            }
        }.toMutableList()

        val groupAdapter = GroupAdapter<ViewHolder>()
        recyclerView.adapter = groupAdapter
        groupAdapter.update(items)
    }


    override fun onResume() {
        super.onResume()
        setTitle(R.string.activity_groupie_title)
    }

}