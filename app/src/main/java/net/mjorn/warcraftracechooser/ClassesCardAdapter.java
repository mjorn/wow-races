package net.mjorn.warcraftracechooser;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import net.mjorn.warcraftracechooser.races.WowClass;

import java.util.List;

public class ClassesCardAdapter extends RecyclerView.Adapter<ClassesCardAdapter.ViewHolder> {
    private List list;
    private Context context;
    //private Listener listener;

    public ClassesCardAdapter(Context context, List list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        WowClass wowClass = (WowClass) list.get(position);
        CardView card = holder.cardView;
        ImageView image = card.findViewById(R.id.class_image);
        TextView name = card.findViewById(R.id.class_name);
        TextView specs = card.findViewById(R.id.class_specs);

        image.setImageResource(wowClass.image);
        name.setText(wowClass.name);
        name.setTextColor(context.getResources().getColor(wowClass.color));
        specs.setText(wowClass.specs);

//        card.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(listener!=null) {
//                    listener.onClick(position);
//                }
//            }
//        });

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.fragment_classes_card, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder (CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }
    }

//    public void setListener(Listener listener) {
//        this.listener = listener;
//    }
//
//    public interface Listener {
//        void onClick(int position);
//    }
}
