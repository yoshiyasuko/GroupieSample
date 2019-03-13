package jp.egg.fried.groupiesample.recyclerviewsample.holder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.egg.fried.groupiesample.R


/**
 * AndroidHelloViewHolder
 *
 * Created by Yoshiyasu on 2019/03/14
 */

class AndroidHelloViewHolder private constructor(view: View) : RecyclerView.ViewHolder(view) {
    companion object {
        fun generate(parent: ViewGroup, inflater: LayoutInflater): AndroidHelloViewHolder {
            val view = inflater.inflate(R.layout.android_hello_view, parent)
            return AndroidHelloViewHolder(view)
        }
    }
}