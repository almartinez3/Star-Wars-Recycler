package co.devbeerloper.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import model.Band;

public class MyBandAdapter extends RecyclerView.Adapter <BandViewHolder>{


    @NonNull
    @Override
    public BandViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BandViewHolder bandViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
