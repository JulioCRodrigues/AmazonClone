package projects.julio.amazon.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import projects.julio.amazon.R;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_filmes_adapter, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.play.setText("Assistir");
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{

        ImageView imagem;
        TextView play;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imagem = itemView.findViewById(R.id.imageBanner);
            play = itemView.findViewById(R.id.tvPlay);
        }
    }
}
