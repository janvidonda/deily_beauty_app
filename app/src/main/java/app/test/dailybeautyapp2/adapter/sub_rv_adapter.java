package app.test.dailybeautyapp2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import app.test.dailybeautyapp2.DescriptionActivity;
import app.test.dailybeautyapp2.R;
import app.test.dailybeautyapp2.model.subrecyclerViewModel;

public class sub_rv_adapter extends RecyclerView.Adapter<sub_rv_adapter.ViewHolder> {
    private subrecyclerViewModel[] subrecyclerViewModels;
    private String eyes_tabTitles;
    private Context context;


    public sub_rv_adapter(subrecyclerViewModel[] rv_model_main, Context context, String eyes_tabTitles) {
        this.subrecyclerViewModels = rv_model_main;
        this.context = context;
        this.eyes_tabTitles = eyes_tabTitles;
    }

    @NonNull

    @Override
    public sub_rv_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listitemHome = inflater.inflate(R.layout.card_r_v_sub, parent, false);
        sub_rv_adapter.ViewHolder viewHolder = new sub_rv_adapter.ViewHolder(listitemHome);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull sub_rv_adapter.ViewHolder holder, int position) {

        subrecyclerViewModel myhomeListData = subrecyclerViewModels[position];
        holder.txtmain.setText(subrecyclerViewModels[position].getMain_title());
        holder.txtsub.setText(subrecyclerViewModels[position].getSub_title());
        holder.sub_imageView.setImageResource(subrecyclerViewModels[position].getSub_image());
        holder.linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DescriptionActivity.class);
                intent.putExtra("product_name", subrecyclerViewModels[position].getMain_title());
                intent.putExtra("product_image", subrecyclerViewModels[position].getSub_image());
                intent.putExtra("des", subrecyclerViewModels[position].getDes_title());
                intent.putExtra("title", subrecyclerViewModels[position].getTitle());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return subrecyclerViewModels.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtmain, txtsub;
        private LinearLayout linearlayout;
        private ImageView sub_imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtmain = (TextView) itemView.findViewById(R.id.list_tv_main);
            this.txtsub = (TextView) itemView.findViewById(R.id.list_tv_sub);
            this.linearlayout = (LinearLayout) itemView.findViewById(R.id.linearlayout_card_sub);
            this.sub_imageView = (ImageView) itemView.findViewById(R.id.list_image);
        }
    }

}
