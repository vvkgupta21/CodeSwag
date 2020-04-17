package com.vvk.codeswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.vvk.codeswag.Adapter.CategoryAdapter
import com.vvk.codeswag.DataServices
import com.vvk.codeswag.Model.Category
import com.vvk.codeswag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataServices.categories)
        CategoriesListView.adapter = adapter
    }
}