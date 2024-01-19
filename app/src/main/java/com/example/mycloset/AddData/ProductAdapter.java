package com.example.mycloset.AddData;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycloset.FirebaseServices;
import com.example.mycloset.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>
{
    private List<Product> productList;
    private Context context;
    private FirebaseServices fbs;

    public ProductAdapter(Context context, List<Product> productList) {
        this.productList = productList;
        this.context = context;
        this.fbs = FirebaseServices.getInstance();
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.pro_item,parent,false);
        return new ProductAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.clothName.setText(product.getTakeAPhoto());
        holder.clothPhoto.getText(product.getViewOptions());
        if (product.getViewOptions() == null || product.getViewOptions().isEmpty())
        {
             productList.get().load(R.drawable.ic_fav).into(holder.itemView);
        }
        else {
            productList.get().load(product.getViewOptions()).into(holder.clothName);
        }
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView clothName ;

        ImageView pieceName , clothPhoto ;
        int position;

        ViewHolder(View itemView) {
            super(itemView);
            clothPhoto = itemView.findViewById(R.id.rvProductsProFragment);
            clothName = itemView.findViewById(R.id.rvProductsProFragment);
            pieceName = itemView.findViewById(R.id.rvProductsProFragment);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //((MainActivity)context).get().showMessageDialog(context, productList.get(position).get());

        }
    }
}