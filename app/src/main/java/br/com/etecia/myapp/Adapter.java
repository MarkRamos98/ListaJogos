package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;
    private List<Games> lsgames;

    public Adapter(Context context, List<Games> lsgames) {
        this.context = context;
        this.lsgames = lsgames;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_games,parent,false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.NomeMod.setText(lsgames.get(position).getNome());
        holder.ImageMod.setImageResource(lsgames.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return lsgames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ImageMod;

        TextView NomeMod;

        TextView ClassMod;

        TextView DescricaoMod;

        TextView ClassEtMod;

        TextView DatMod;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ImageMod = itemView.findViewById(R.id.ImageMod);
            NomeMod = itemView.findViewById(R.id.NomeMod);
            ClassMod = itemView.findViewById(R.id.ClassMod);
            DescricaoMod = itemView.findViewById(R.id.DescricaoMod);
            ClassEtMod = itemView.findViewById(R.id.ClassEtMod);
            DatMod = itemView.findViewById(R.id.DatMod);

        }
    }

}
