package com.example.lesson6task6java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.UserViewHolder> {

    List<User> user;

    public RecyclerAdapter(List<User> users) {
        this.user = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new UserViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_member_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        User users = user.get(position);

        if (holder instanceof UserViewHolder) {
            TextView name = ((UserViewHolder) holder).name;

            name.setText(users.getName());
        }
    }

    @Override
    public int getItemCount() {
        return user.size();
    }
  static class   UserViewHolder extends RecyclerView.ViewHolder{
      TextView name;
      public UserViewHolder(@NonNull View itemView) {
          super(itemView);
          name = itemView.findViewById(R.id.name);
      }
  }

}
