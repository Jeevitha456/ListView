package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    var dataList = ArrayList<CompanyCurrency>()
    lateinit var recyclerView:RecyclerView
    lateinit var adapter:RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user
       // val companies = ArrayList<Company>()

        //adding some dummy data to the list
       // companies.add(Company("Belal Khan", "Ranchi Jharkhand"))
        //companies.add(Company("Ramiz Khan", "Ranchi Jharkhand"))
        //companies.add(Company("Faiz Khan", "Ranchi Jharkhand"))
        //companies.add(Company("Yashar Khan", "Ranchi Jharkhand"))




        //creating our adapter
       //val adapter = RecyclerAdapter(companies)

        //now adding the adapter to recyclerview
       // recyclerView.adapter = adapter
        getData()
    }
    private fun getData() {
        val call: Call<List<CompanyCurrency>> = APIClient.getClient.getPhotos()
        call.enqueue(object : Callback<List<CompanyCurrency>> {

            override fun onResponse(call: Call<List<CompanyCurrency>>?, response: Response<List<CompanyCurrency>>?) {
                adapter = RecyclerAdapter(dataList)
                dataList.addAll(response!!.body()!!)
                recyclerView.adapter=adapter
                recyclerView.adapter?.notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<CompanyCurrency>>?, t: Throwable?) {

            }

        })
    }
}