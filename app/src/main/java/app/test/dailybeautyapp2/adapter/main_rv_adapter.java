package app.test.dailybeautyapp2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import app.test.dailybeautyapp2.FaceActivity;
import app.test.dailybeautyapp2.HandsFeetActivity;
import app.test.dailybeautyapp2.R;
import app.test.dailybeautyapp2.SkinActivity;
import app.test.dailybeautyapp2.fragments.SkinFragment;
import app.test.dailybeautyapp2.EyesActivity;
import app.test.dailybeautyapp2.HairActivity;
import app.test.dailybeautyapp2.model.MainrecyclerViewModel;

public class main_rv_adapter extends RecyclerView.Adapter<main_rv_adapter.ViewHolder> {
    private MainrecyclerViewModel[] MainrecyclerViewModelo;
    private Context context;
    private String tabTitles;

    public main_rv_adapter(MainrecyclerViewModel[] rv_model_main, Context context, String tabTitles) {
        this.MainrecyclerViewModelo = rv_model_main;
        this.context = context;
        this.tabTitles = tabTitles;
    }


    @NonNull
    @Override
    public main_rv_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listitemHome = inflater.inflate(R.layout.card_r_v_main, parent, false);
        ViewHolder viewHolder = new ViewHolder(listitemHome);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull main_rv_adapter.ViewHolder holder, int position) {
        MainrecyclerViewModel myhomeListData =  MainrecyclerViewModelo[position];
        holder.textView.setText(MainrecyclerViewModelo[position].getRv_text_main());
        holder.imageView.setImageResource(MainrecyclerViewModelo[position].getRv_img_main());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getTabTitle() == "Eyes") {
                    Intent intent = new Intent(context, EyesActivity.class);
                    intent.putExtra("dieses_name", MainrecyclerViewModelo[position].getRv_text_main());
                    context.startActivity(intent);
                } else if (getTabTitle() == "Face") {
                    Intent intent = new Intent(context, FaceActivity.class);
                    intent.putExtra("dieses_name", MainrecyclerViewModelo[position].getRv_text_main());
                    context.startActivity(intent);
                } else if (getTabTitle() == "Hair") {
                    Intent intent = new Intent(context, HairActivity.class);
                    intent.putExtra("dieses_name", MainrecyclerViewModelo[position].getRv_text_main());
                    context.startActivity(intent);
                } else if (getTabTitle() == "HandsFeet") {
                    Intent intent = new Intent(context, HandsFeetActivity.class);
                    intent.putExtra("dieses_name", MainrecyclerViewModelo[position].getRv_text_main());
                    context.startActivity(intent);
                } else if(getTabTitle() == "Skin"){
                    Intent intent = new Intent(context, SkinActivity.class);
                    intent.putExtra("dieses_name", MainrecyclerViewModelo[position].getRv_text_main());
                    context.startActivity(intent);
                }
                else
                {
                    Toast.makeText(context, "nknjkbnbkjbkhn", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return MainrecyclerViewModelo.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private CardView cardView;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.txt_eyes_rv);
            this.cardView = (CardView) itemView.findViewById(R.id.card_eyes);
            this.imageView = (ImageView) itemView.findViewById(R.id.img_eyes_rv);
        }
    }

    public String getTabTitle() {
        return tabTitles;
    }
}
