package com.vvk.codeswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.vvk.codeswag.Model.Category
import com.vvk.codeswag.R



class CategoryAdapter(context : Context, categories : List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView : View
        val holder : ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImageView = categoryView.findViewById(R.id.categoryimageview)
            holder.categoryName = categoryView.findViewById(R.id.categoryname)
            categoryView.tag = holder
        } else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImageView?.setImageResource(resourceId)

        println(resourceId)

        holder.categoryName?.text = category.title

        return categoryView

    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder{
        var categoryImageView : ImageView? = null
        var categoryName : TextView? = null
    }

}