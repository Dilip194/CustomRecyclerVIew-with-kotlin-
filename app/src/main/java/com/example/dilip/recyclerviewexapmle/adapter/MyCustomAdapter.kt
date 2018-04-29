package com.example.dilip.recyclerviewexapmle.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.dilip.recyclerviewexapmle.R
import com.example.dilip.recyclerviewexapmle.model.User

class MyCustomAdapter(context : Context,  userList : ArrayList<User>) : RecyclerView.Adapter<MyCustomAdapter.CustomViewHolder>() {

    private var list : ArrayList<User>;
    private var mContext : Context;

    init {
        list = userList;
        mContext = context;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        var view : View;
        view = LayoutInflater.from(parent.context).inflate(R.layout.content_activity_main,parent,false);
        return CustomViewHolder(view);
    }

    override fun getItemCount(): Int {
        return list.size;
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindCustomView(list[position])
    }


    class CustomViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bindCustomView(user: User) {
            var image = itemView.findViewById(R.id.image) as ImageView;
            var name = itemView.findViewById(R.id.name) as TextView;
            var contact = itemView.findViewById(R.id.mobile_number) as TextView;

            image.setImageResource(user.image);
            name.setText(user.name)
            contact.setText(""+user.mobile)
        }
    }
}