package com.example.purryuhgames;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.purryuhgames.BuzzWire.MainActivity;
import com.example.purryuhgames.ColorGame.ColorGameHomePage;
import com.example.purryuhgames.PersonalityTest.Personality_FirstPage;

import java.util.ArrayList;

public class GamesFragment extends Fragment {

    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;
    ImageView imageBackground;
    GamesFragment gamesFragment;
    Activity context;
    int cont;
    int[] backgroundColors = {0xFF6E0406, 0xFF023B4C, 0xFFED1C24};
    Button playbutton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        View root = inflater.inflate(R.layout.menu_fragment_games, container, false);

        viewPager2 = root.findViewById(R.id.viewpager);
        //viewPager2.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL,false));
        imageBackground = root.findViewById(R.id.imageBackground); // Initialize the ImageView for background

        int[] images = {R.drawable.colorgame, R.drawable.buzzg, R.drawable.personality};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i = 0; i < images.length; i++) {
            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i]);
            viewPagerItemArrayList.add(viewPagerItem);
        }


        VPAdapter vpAdapter = new VPAdapter(getActivity(), viewPagerItemArrayList);
        viewPager2.setAdapter(vpAdapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer transformer = new CompositePageTransformer();
        transformer.addTransformer(new MarginPageTransformer(40));
        transformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(transformer);

        // Scroll to the middle item
        viewPager2.post(() -> viewPager2.setCurrentItem(viewPagerItemArrayList.size() / 2));

        // Change background color on swipe
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                imageBackground.setBackgroundColor(backgroundColors[position % backgroundColors.length]);
            }
        });


        playbutton = root.findViewById(R.id.playbutton);

        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (cont){
                    case 1: startActivity(new Intent(context, ColorGameHomePage.class));
                            break;
                    case 2: startActivity(new Intent(context, MainActivity.class));
                            break;
                    case 3: startActivity(new Intent(context, Personality_FirstPage.class));
                            break;
                }
            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position){
                    case 0: cont = 1; break;
                    case 1: cont = 2; break;
                    case 2: cont = 3; break;
                    default: cont = 0; break;
                }
            }
        });

        return root;
    }




}
