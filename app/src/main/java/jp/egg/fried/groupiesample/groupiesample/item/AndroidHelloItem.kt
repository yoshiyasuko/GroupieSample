package jp.egg.fried.groupiesample.groupiesample.item

import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import jp.egg.fried.groupiesample.R


/**
 * AndroidHelloItem
 *
 * Created by Yoshiyasu on 2019/03/14
 */

class AndroidHelloItem : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.android_hello_view

    override fun bind(viewHolder: ViewHolder, position: Int) {
        /* 何かViewへの操作を行う */
    }
}