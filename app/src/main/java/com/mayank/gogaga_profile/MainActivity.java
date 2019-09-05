package com.mayank.gogaga_profile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.RemoteBanner;
import ss.com.bannerslider.views.BannerSlider;

public class MainActivity extends AppCompatActivity {

    BannerSlider bannerSlider;
    private List<Banner> remoteBanners = new ArrayList<>();
    public CustomAdapter adapter;
    public RecyclerView recyclerView1,recyclerView2 , recyclerView3,recyclerView4;
    ArrayList<TvShow> tvShows = new ArrayList<>();

    public static final String[] TvShows =
            {
                    "Breaking Bad",
                    "Rick and Morty",
                    "FRIENDS",
                    "Sherlock",
                    "Stranger Things",
                    "Breaking Bad",
                    "Rick and Morty",
                    "FRIENDS",
                    "Sherlock",
                    "Stranger Things"
            };



    public static final String[] TvShowImgs =
            {
                    "https://m.media-amazon.com/images/M/MV5BMjhiMzgxZTctNDc1Ni00OTIxLTlhMTYtZTA3ZWFkODRkNmE2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg",
                    "https://cdn.shopify.com/s/files/1/0191/7850/products/RICKMORTY_50_-_COVER_A_SOLICIT_WEB_1024x1024.jpg?v=1559080783",
                    "https://m.media-amazon.com/images/M/MV5BNDVkYjU0MzctMWRmZi00NTkxLTgwZWEtOWVhYjZlYjllYmU4XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_UY268_CR0,0,182,268_AL_.jpg",
                    "https://m.media-amazon.com/images/M/MV5BMWY3NTljMjEtYzRiMi00NWM2LTkzNjItZTVmZjE0MTdjMjJhL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNTQ4NTc5OTU@._V1_UX182_CR0,0,182,268_AL_.jpg",
                    "https://m.media-amazon.com/images/M/MV5BZGExYjQzNTQtNGNhMi00YmY1LTlhY2MtMTRjODg3MjU4YTAyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                    "https://m.media-amazon.com/images/M/MV5BMjhiMzgxZTctNDc1Ni00OTIxLTlhMTYtZTA3ZWFkODRkNmE2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg",
                    "https://cdn.shopify.com/s/files/1/0191/7850/products/RICKMORTY_50_-_COVER_A_SOLICIT_WEB_1024x1024.jpg?v=1559080783",
                    "https://m.media-amazon.com/images/M/MV5BNDVkYjU0MzctMWRmZi00NTkxLTgwZWEtOWVhYjZlYjllYmU4XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_UY268_CR0,0,182,268_AL_.jpg",
                    "https://m.media-amazon.com/images/M/MV5BMWY3NTljMjEtYzRiMi00NWM2LTkzNjItZTVmZjE0MTdjMjJhL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNTQ4NTc5OTU@._V1_UX182_CR0,0,182,268_AL_.jpg",
                    "https://m.media-amazon.com/images/M/MV5BZGExYjQzNTQtNGNhMi00YmY1LTlhY2MtMTRjODg3MjU4YTAyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bannerSlider = findViewById(R.id.banner_slider1);
        remoteBanners.add(new RemoteBanner("https://m.media-amazon.com/images/M/MV5BZGExYjQzNTQtNGNhMi00YmY1LTlhY2MtMTRjODg3MjU4YTAyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg"
        ));
        remoteBanners.add(new RemoteBanner("https://cdn.shopify.com/s/files/1/0191/7850/products/RICKMORTY_50_-_COVER_A_SOLICIT_WEB_1024x1024.jpg?v=1559080783"
        ));
        remoteBanners.add(new RemoteBanner("https://m.media-amazon.com/images/M/MV5BNDVkYjU0MzctMWRmZi00NTkxLTgwZWEtOWVhYjZlYjllYmU4XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_UY268_CR0,0,182,268_AL_.jpg"
        ));
        remoteBanners.add(new RemoteBanner("https://m.media-amazon.com/images/M/MV5BMWY3NTljMjEtYzRiMi00NWM2LTkzNjItZTVmZjE0MTdjMjJhL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNTQ4NTc5OTU@._V1_UX182_CR0,0,182,268_AL_.jpg"
        ));
        remoteBanners.add(new RemoteBanner("https://m.media-amazon.com/images/M/MV5BMjhiMzgxZTctNDc1Ni00OTIxLTlhMTYtZTA3ZWFkODRkNmE2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg"
        ));
        bannerSlider.setBanners(remoteBanners);


        for (int i = 0; i < TvShowImgs.length; i++) {

            TvShow tvShow = new TvShow();
            tvShow.setTvshow(TvShows[i]);
            tvShow.setImgTvshow(TvShowImgs[i]);

            tvShows.add(tvShow);
        }

        adapter = new CustomAdapter(tvShows);

        recyclerView1 = findViewById(R.id.customRecyclerView1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setAdapter(adapter);

        recyclerView2 = findViewById(R.id.customRecyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setAdapter(adapter);

        recyclerView3 = findViewById(R.id.customRecyclerView3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerView3.setItemAnimator(new DefaultItemAnimator());
        recyclerView3.setAdapter(adapter);

        recyclerView4 = findViewById(R.id.customRecyclerView4);
        recyclerView4.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerView4.setItemAnimator(new DefaultItemAnimator());
        recyclerView4.setAdapter(adapter);
    }
}