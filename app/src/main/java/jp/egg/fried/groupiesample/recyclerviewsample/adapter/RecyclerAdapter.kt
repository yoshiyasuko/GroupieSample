package jp.egg.fried.groupiesample.recyclerviewsample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.egg.fried.groupiesample.recyclerviewsample.holder.AndroidHelloViewHolder
import jp.egg.fried.groupiesample.recyclerviewsample.holder.HelloWorldViewHolder


/**
 * RecyclerAdapter
 *
 * Created by Yoshiyasu on 2019/03/14
 */

class RecyclerAdapter(private val context: Context,
                      private val items: MutableList<out Any>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    interface OnClickListener {
        fun onClick()
    }

    var listener: OnClickListener? = null

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        val item = items[position] as Data
        return item.type
    }

    // RecyclerAdapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(context)

        return when (viewType) {
            TYPE_HELLO      -> HelloWorldViewHolder.generate(parent, inflater)
            TYPE_ANDROID    -> AndroidHelloViewHolder.generate(parent, inflater)
            else            -> super.createViewHolder(parent, viewType)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder,
                                  position: Int) {
        when (holder) {
            is HelloWorldViewHolder     -> holder.onBind(listener)
            is AndroidHelloViewHolder   -> holder.onBind()
        }
    }

    companion object {
        const val TYPE_HELLO = 0
        const val TYPE_ANDROID = 1
    }

    data class Data(val type: Int)
}