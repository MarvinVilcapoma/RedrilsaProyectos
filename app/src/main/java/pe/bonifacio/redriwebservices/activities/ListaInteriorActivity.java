package pe.bonifacio.redriwebservices.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import pe.bonifacio.redriwebservices.R;
import pe.bonifacio.redriwebservices.adapters.InteriorMinaAdapter;
import pe.bonifacio.redriwebservices.services.ApiService;


public class ListaInteriorActivity extends AppCompatActivity {

    private static final String TAG = ListaInteriorActivity.class.getSimpleName();

    private RecyclerView listInterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_interior);

        listInterior=findViewById(R.id.recyclerviewListaInterior);

        listInterior.setLayoutManager(new LinearLayoutManager(this));

        listInterior.setAdapter(new InteriorMinaAdapter());

        initialize();
    }
    private void initialize() {


    }
}
