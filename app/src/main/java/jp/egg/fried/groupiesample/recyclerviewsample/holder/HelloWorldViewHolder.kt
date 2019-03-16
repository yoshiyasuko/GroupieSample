package jp.egg.fried.groupiesample.recyclerviewsample.holder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.egg.fried.groupiesample.R
import jp.egg.fried.groupiesample.recyclerviewsample.adapter.RecyclerAdapter


/**
 * HelloWorldViewHolder
 *
 * Created by Yoshiyasu on 2019/03/14
 */

class HelloWorldViewHolder private constructor(view: View)
    : RecyclerView.ViewHolder(view) {

    companion object {
        fun generate(parent: ViewGroup,
                     inflater: LayoutInflater): HelloWorldViewHolder {
            val view = inflater.inflate(R.layout.hello_world_view, parent, false)
            return HelloWorldViewHolder(view)
        }
    }

    fun onBind(listener: RecyclerAdapter.OnClickListener?) {
        itemView.setOnClickListener {
            listener?.onClick()
        }
    }
}