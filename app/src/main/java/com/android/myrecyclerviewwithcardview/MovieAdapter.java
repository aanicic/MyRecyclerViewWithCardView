package com.android.myrecyclerviewwithcardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private ArrayList<Movie> moviesList;

    public static class MovieViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mTitle;
        public TextView mDescription;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.imageThumb);
            mTitle = itemView.findViewById(R.id.movieTitle);
            mDescription = itemView.findViewById(R.id.movieDesc);

        }
    }

    public MovieAdapter(ArrayList<Movie> movies){
        moviesList = movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
        MovieViewHolder mvh = new MovieViewHolder(view);

        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        Movie movie = moviesList.get(position);
        holder.mImageView.setImageResource(movie.getImage());
        holder.mTitle.setText(movie.getTitle());
        holder.mDescription.setText(movie.getDescription());

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
