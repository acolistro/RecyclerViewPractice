package com.fes.ui_exercise1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fes.ui_exercise1.model.User;

import java.util.ArrayList;
import java.util.List;

class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyUsersViewholder> {
    private final List<User> list;

    public UserAdapter(List<User> list) {
        this.list= list;
    }

    List<User> userList= new ArrayList<>();
    

    @NonNull
    @Override
    public MyUsersViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_users, parent, false);
        MyUsersViewholder myUsersViewholder = new MyUsersViewholder(view);
        return myUsersViewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyUsersViewholder holder, int position) {
        User user = list.get(position);
        holder.tvName.setText(user.getName());
        holder.tvNi.setText(user.getNi());
        holder.tvPass.setText(user.getPassport());
        holder.tvGend.setText(user.getGender());
        holder.tvBdate.setText(user.getBdate());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //create a class that extends a viewholder

    class MyUsersViewholder extends RecyclerView.ViewHolder {

        TextView tvName, tvNi, tvPass, tvGend, tvBdate;
        public MyUsersViewholder(@NonNull View itemView) {
            super(itemView);
            tvName= itemView.findViewById(R.id.tvName);
            tvNi= itemView.findViewById(R.id.tvNi);
            tvPass= itemView.findViewById(R.id.tvPass);
            tvGend= itemView.findViewById(R.id.tvGend);
            tvBdate= itemView.findViewById(R.id.tvBdate);
        }
    }

}
