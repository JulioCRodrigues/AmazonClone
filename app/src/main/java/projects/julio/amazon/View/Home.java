package projects.julio.amazon.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import projects.julio.amazon.Adapter.HomeAdapter;
import projects.julio.amazon.Adapter.HomeAdapterAssistidos;
import projects.julio.amazon.R;
import projects.julio.amazon.databinding.ActivityHomeBinding;

public class Home extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private RecyclerView recyclerView;
    private RecyclerView recyclerViewFilmPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        recyclerView = binding.rvFilmes;
        recyclerViewFilmPlay = binding.rvFilmesAssistidos;

        // Configurando o adapter
        HomeAdapter homeAdapter = new HomeAdapter();
        HomeAdapterAssistidos homeAdapterAssistidos = new HomeAdapterAssistidos();

        // Recycler View
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(homeAdapter);

        // Recycler View Filmes assistidos
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewFilmPlay.setLayoutManager(layoutManager1);
        recyclerViewFilmPlay.setHasFixedSize(true);
        recyclerViewFilmPlay.setAdapter(homeAdapterAssistidos);

    }
}