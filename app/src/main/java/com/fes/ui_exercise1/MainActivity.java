package com.fes.ui_exercise1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fes.ui_exercise1.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<User> userList = new ArrayList<>();
    private RecyclerView rv_users;

    // 1 add relevant library
//    private Button btn_create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializedUI();

    }

    public void setUpRecyclerView() {
        rv_users= findViewById(R.id.rv_users);
        rv_users.setLayoutManager(new LinearLayoutManager(this));
        rv_users.setHasFixedSize(true);
        rv_users.setAdapter(new UserAdapter(userList));
    }

    public void setUpDataSource() {
        User user = new User("Leonardo DiCaprio", "ni", "876876", "Male", "1/1/1970");
        userList.add(user);

        user = new User("Matt Damon", "ni", "876654", "Male", "1/6/1970");
        userList.add(user);

        user = new User("Lin Manuel Miranda", "ni", "870023", "Male", "1/1/1970");
        userList.add(user);

        user = new User("Jennifer Lawrence", "ni", "098876", "Female", "4/1/1990");
        userList.add(user);

        user = new User("Keanu Reeves", "ni", "333876", "Male", "6/1/1962");
        userList.add(user);

        user = new User("Arya Stark", "ni", "878236", "Female", "3/15/1996");
        userList.add(user);

        user = new User("Carmela Soprano", "ni", "876876", "Male", "1/1/1970");
        userList.add(user);
    }

    public void initializedUI(){

    }

//    public void btn_click(View view){
//    Intent i = new Intent(getApplicationContext(),Activity2.class);
//    startActivity(i);
//    }
}