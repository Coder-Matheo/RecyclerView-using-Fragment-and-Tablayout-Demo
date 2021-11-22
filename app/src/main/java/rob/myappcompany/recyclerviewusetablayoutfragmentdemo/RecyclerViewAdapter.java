package rob.myappcompany.recyclerviewusetablayoutfragmentdemo;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mConact;
    List<Conact> mData;


    public RecyclerViewAdapter(Context mConact, List<Conact> mData) {
        this.mConact = mConact;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);




        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_phone.setText(mData.get(position).getPhote());
        holder.img.setImageResource(mData.get(position).getPhote());
    }



    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout item_conact;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_conact = itemView.findViewById(R.id.conact_item_id);
            tv_name = itemView.findViewById(R.id.name_contact);
            tv_phone = itemView.findViewById(R.id.phone_conact);
            img = itemView.findViewById(R.id.imag_conact);

            tv_name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("TAG", "onClick: "+ tv_name.getText());
                }
            });
        }



    }
}
