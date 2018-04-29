package com.example.dilip.recyclerviewexapmle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.example.dilip.recyclerviewexapmle.adapter.MyCustomAdapter
import com.example.dilip.recyclerviewexapmle.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById(R.id.recycleview) as RecyclerView
        var layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        var userList = ArrayList<User>()

        userList.add(User(R.mipmap.ic_launcher,"Dilip kumar",8897963698))
        userList.add(User(R.mipmap.ic_launcher,"Ashish kumar Gupta",8897963698))
        userList.add(User(R.mipmap.ic_launcher,"Aryan kumar",8897963698))
        userList.add(User(R.mipmap.ic_launcher,"Shobhit kumar",8897963698))
        userList.add(User(R.mipmap.ic_launcher,"Yuvraj kumar",8897963698))
        userList.add(User(R.mipmap.ic_launcher,"Ram Gupta",8897963698))
        userList.add(User(R.mipmap.ic_launcher,"Dilip kumar",87493009384))
        userList.add(User(R.mipmap.ic_launcher,"Raj Pratap kumar",8873458728))

        recyclerView.adapter = MyCustomAdapter(this,userList)

    }
}
