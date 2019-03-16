package jp.egg.fried.groupiesample.groupiesample.item

import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import jp.egg.fried.groupiesample.R


/**
 * HelloWorldItem
 *
 * Created by Yoshiyasu on 2019/03/14
 */

class HelloWorldItem : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.hello_world_view

    override fun bind(viewHolder: ViewHolder, position: Int) {
        /* 何かViewへの操作を行う */
    }
}