package projects.julio.amazon.Adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import projects.julio.amazon.R;

public class HomeAdapterAssistidos extends RecyclerView.Adapter<HomeAdapterAssistidos.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemListFilmsPlay = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_filmes_assistidos_adapter, parent, false);
        return new MyViewHolder(itemListFilmsPlay);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{

        ImageView imageFilm;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageFilm = itemView.findViewById(R.id.ivFilmesAssistidos);
        }
    }
}
