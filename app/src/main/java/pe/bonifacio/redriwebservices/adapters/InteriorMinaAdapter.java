package pe.bonifacio.redriwebservices.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pe.bonifacio.redriwebservices.R;
import pe.bonifacio.redriwebservices.models.MaquinaIm;

public class InteriorMinaAdapter extends RecyclerView.Adapter<InteriorMinaAdapter.ViewHolder> {

    private List<MaquinaIm> maquinaImList;
    private String proyecto;

    public InteriorMinaAdapter(){
            this.maquinaImList = new ArrayList<>();

    }

    public void setMaquinaImList(List<MaquinaIm> maquinaImLists){
            this.maquinaImList = maquinaImLists;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView nombre;
        ViewHolder(View itemView){
            super(itemView);
            nombre=itemView.findViewById(R.id.nombre_im);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inferiormina,parent,false);
        return new ViewHolder(itemView);

    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Context context=holder.itemView.getContext();
        final MaquinaIm maquinaIm= this.maquinaImList.get(position);


        holder.nombre.setText("Maquinas: "+maquinaIm.getNombre_im());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, InteriorMinaAdapter.class);
                intent.putExtra("id",maquinaIm.getId_im());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return this.maquinaImList.size();
    }
}
