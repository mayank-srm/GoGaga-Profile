package com.mayank.gogaga_profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<TvShow> TvShowList;
    private Context context;

    CustomAdapter(List<TvShow> TvShowList) {
        this.TvShowList = TvShowList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        context = parent.getContext();
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        TvShow tvShow = TvShowList.get(position);

        Glide.with(context).load(tvShow.getImgTvshow()).into(holder.imgTvShow);
        holder.textTvShow.setText(tvShow.getTvshow());
    }

    @Override
    public int getItemCount() {
        return TvShowList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgTvShow;
        TextView textTvShow;
        CardView cv;

        ViewHolder(View itemView) {
            super(itemView);
            imgTvShow = itemView.findViewById(R.id.coverImage);
            textTvShow = itemView.findViewById(R.id.textTvshow);
        }
    }
}
