package com.kivitool.kotlinlearning.listview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import com.kivitool.kotlinlearning.R
import com.kivitool.kotlinlearning.ViewEveryItem
import com.kivitool.kotlinlearning.models.LanguageItem

class ListView(var context: Context?=null, open var listView: List<LanguageItem>) : BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var inflater: LayoutInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view = inflater.inflate(R.layout.layout_for_listview_item, null)

        var title = view.findViewById(R.id.txttitle) as TextView
        var shortDescription = view.findViewById(R.id.overview) as TextView
        var image = view.findViewById(R.id.image) as ImageView

        title.text = listView.get(position).title
        shortDescription.text = listView.get(position).shortdescription
        image.setImageResource(listView.get(position).image)

        var linearLayout = view.findViewById(R.id.relLayout) as RelativeLayout

        linearLayout.setOnClickListener {

            val intent = Intent(context, ViewEveryItem::class.java).apply {
                putExtra("long_desc", listView.get(position).longDescription)
                putExtra("title", listView.get(position).title)
                putExtra("image", listView.get(position).image)
            }
            context!!.startActivity(intent)

        }

        return view

    }

    override fun getItem(position: Int): Any {
        return listView.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listView.size
    }


}