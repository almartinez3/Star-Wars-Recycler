package co.devbeerloper.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class swAdapter extends RecyclerView.Adapter <swAdapter.SwViewHolder> {
    private Context mContext;
    private ArrayList<Swars> swarsArrayList;

    public swAdapter(Context context, ArrayList<Swars> exampleList){
        mContext =context;
        swarsArrayList = exampleList;

    }

    @NonNull
    @Override
    public SwViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

       View v = LayoutInflater.from(mContext).inflate(R.layout.swars_layout, viewGroup, false );
       return new SwViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SwViewHolder holder, int position) {
        Swars currentItem = swarsArrayList.get(position);

        String sNombre = currentItem.getName();
        String sHeight = currentItem.getHeight();
        String sMass = currentItem.getMass();
        String sHairColor = currentItem.getHair_color();
        String sSkinColor = currentItem.getSkin_color();
        String sEyeColor = currentItem.getEye_color();
        String sBirthYear = currentItem.getBirth_year();
        String sGender = currentItem.getGender();

        holder.nombre.setText(sNombre);
        holder.height.setText(sHeight);
        holder.mass.setText(sMass);
        holder.hair_color.setText(sHairColor);
        holder.skin_color.setText(sSkinColor);
        holder.eye_color.setText(sEyeColor);
        holder.birth_year.setText(sBirthYear);
        holder.gender.setText(sGender);



    }

    @Override
    public int getItemCount() {
        return swarsArrayList.size();
    }

    public class SwViewHolder extends RecyclerView.ViewHolder{

        public TextView nombre;
        public TextView height;
        public TextView mass;
        public TextView hair_color;
        public TextView skin_color;
        public TextView eye_color;
        public TextView birth_year;
        public TextView gender;




        public SwViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.swName);
            height = itemView.findViewById(R.id.swHeight);
            mass = itemView.findViewById(R.id.swMass);
            hair_color = itemView.findViewById(R.id.swHairColor);
            skin_color = itemView.findViewById(R.id.swSkinColor);
            eye_color = itemView.findViewById(R.id.swEyeColor);
            birth_year = itemView.findViewById(R.id.swBirthYear);
            gender = itemView.findViewById(R.id.swGender);


        }
    }

}
