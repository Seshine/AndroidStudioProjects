package com.rachana.jasondemo;

/**
 * Created by Felight Students on 10/15/2016.
 */
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Movie> moviesList;
    private ArrayList<com.rachana.jasondemo.Movie> android;
    Movie movie;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.name);
            genre = (TextView) view.findViewById(R.id.email);
            year = (TextView) view.findViewById(R.id.mobile);
        }
    }


    public MoviesAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.title.setText(android.get(position).getTitle());
        holder.genre.setText(android.get(position).getGenre());
        holder.year.setText(android.get(position).getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
