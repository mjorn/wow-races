package net.mjorn.warcraftracechooser;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ClassesCardAdapter extends RecyclerView.Adapter<ClassesCardAdapter.ViewHolder> {
    private int[] list;
    private Context context;
    private SQLiteOpenHelper dbHelper;
    //private Listener listener;

    public ClassesCardAdapter(Context context, int[] list) {
        this.list = list;
        this.context = context;
        dbHelper = new DatabaseHelper(context);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        CardView card = holder.cardView;
        TextView name = card.findViewById(R.id.class_name);
        ImageView image = card.findViewById(R.id.class_image);
        TextView specs = card.findViewById(R.id.class_specs);

        int item = list[position];

        try {
            SQLiteDatabase db = dbHelper.getReadableDatabase();
            Cursor cursor  = db.query(
                    "CLASSES",
                    new String[]{"NAME", "COLOR", "IMAGE", "SPECS"},
                    "NAME = ?",
                    new String[]{Integer.toString(item)},
                    null, null, null);
            if(cursor.moveToFirst()) {
                name.setText(cursor.getInt(0));
                name.setTextColor(context.getResources().getColor(cursor.getInt(1)));
                image.setImageResource(cursor.getInt(2));
                specs.setText(cursor.getInt(3));
            }
            cursor.close();
            db.close();
        } catch (SQLiteException e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG);
        }


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
        return list.length;
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
