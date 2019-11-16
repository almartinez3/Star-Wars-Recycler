package co.devbeerloper.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

public class swViewHolder  extends RecyclerView.ViewHolder{
    //View v = LayoutInflater.from(Context context)//
    public TextView name;
    public TextView height;
    public TextView mass;
    public TextView hair_color;
    public TextView skin_color;
    public TextView eye_color;
    public TextView birth_year;
    public TextView gender;




    public swViewHolder(@NonNull View itemView) {
        super(itemView);
        this.name = (TextView) itemView.findViewById(R.id.swName);
        this.height = (TextView) itemView.findViewById(R.id.swHeight);
        this.mass = (TextView) itemView.findViewById(R.id.swMass);
        this.hair_color = (TextView) itemView.findViewById(R.id.swHairColor);
        this.skin_color = (TextView) itemView.findViewById(R.id.swSkinColor);
        this.eye_color = (TextView) itemView.findViewById(R.id.swEyeColor);
        this.birth_year = (TextView) itemView.findViewById(R.id.swBirthYear);
        this.gender = (TextView) itemView.findViewById(R.id.swGender);
    }
}
