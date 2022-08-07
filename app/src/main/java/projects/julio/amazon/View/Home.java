package projects.julio.amazon.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;

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

        // Spiner para categorias
        Spinner spinner = binding.spCategorias;
        ArrayAdapter<CharSequence> adapterCategoria = ArrayAdapter.createFromResource(this, R.array.categoria_array, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapterCategoria.setDropDownViewResource(androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item);
        spinner.setSelection(0, false);
        spinner.setAdapter(adapterCategoria);

        // Navegação entre as telas
        binding.bottomNavigation.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.page_1:
                    Intent intent = new Intent(this, Home.class);
                    startActivity(intent);
                    break;
                case R.id.page_2:
                    Intent intentDown = new Intent(getApplicationContext(), Downloads.class);
                    startActivity(intentDown);
                    break;
                case R.id.page_3:
                    Intent intentPrime = new Intent(getApplicationContext(), MyPrime.class);
                    startActivity(intentPrime);
                    break;

            }



            return true;
        });
    }
}