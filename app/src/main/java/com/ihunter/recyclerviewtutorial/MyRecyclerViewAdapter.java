package com.ihunter.recyclerviewtutorial;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>{

    private Context context;

    MyRecyclerViewAdapter(Context context){
        this.context = context.getApplicationContext();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recyclerview_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.post_image)
        ImageView imageView;

        MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void bind(){
            Glide.with(context.getApplicationContext()).load(R.drawable.bison).into(imageView);
        }
    }

}
