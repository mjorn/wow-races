package net.mjorn.warcraftracechooser;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ArticlesCardAdapter extends RecyclerView.Adapter<ArticlesCardAdapter.ViewHolder>{
    private ArrayList<Article> list;
    private Context context;
    //private Listener listener;

    public ArticlesCardAdapter(Context context, ArrayList<Article> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public void onBindViewHolder(@NonNull ArticlesCardAdapter.ViewHolder holder, final int position) {
        CardView card = holder.cardView;
        TextView title = card.findViewById(R.id.title);
        ImageView image = card.findViewById(R.id.image);
        TextView text = card.findViewById(R.id.text);

        Article item = list.get(position);

        title.setText(item.getTitle());
        if(item.hasImage()) Picasso.with(context).load(item.getImageURL()).into(image);
        text.setText(item.getText());


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
    public ArticlesCardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.fragment_misc_card, parent, false);
        return new ArticlesCardAdapter.ViewHolder(cardView);
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
