package net.mjorn.warcraftracechooser.fragments;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import net.mjorn.warcraftracechooser.DatabaseHelper;
import net.mjorn.warcraftracechooser.R;

public class RacialsFragment extends RaceFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_racials, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();
        if(view!=null) {
            ImageView backgroundImage = view.findViewById(R.id.racials_back);
            backgroundImage.setImageResource(race.getBackground());
            ListView racials = view.findViewById(R.id.list_view_racials);
            RacialAdapter adapter = new RacialAdapter(getLayoutInflater().getContext(), R.layout.fragment_racials_item, race.getRacials());
            racials.setAdapter(adapter);
        }
    }

    private class RacialAdapter extends ArrayAdapter<Integer> {

        Context context;
        int resource;
        Integer[] list;

        public RacialAdapter(Context context, int resource, Integer[] list) {
            super(context, resource, list);
            this.context = context;
            this.resource = resource;
            this.list = list;
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent) {

            View row = convertView;
            RacialViewHolder holder = null;
            SQLiteOpenHelper dbHelper = new DatabaseHelper(context);

            if (row == null) {
                LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                row = inflater.inflate(R.layout.fragment_racials_item, parent, false);

                holder = new RacialViewHolder();
                holder.name = row.findViewById(R.id.racial_name);
                holder.icon = row.findViewById(R.id.racial_icon);
                holder.type = row.findViewById(R.id.racial_type);
                holder.desc = row.findViewById(R.id.racial_desc);

                row.setTag(holder);
            } else {
                holder = (RacialViewHolder) row.getTag();
            }

            Integer item = getItem(position);

            if(item!=null) {
                try {
                    SQLiteDatabase db = dbHelper.getReadableDatabase();
                    Cursor cursor = db.query(
                            "RACIALS",
                            new String[]{"NAME", "ICON", "TYPE", "DESCR"},
                            "NAME = ?",
                            new String[]{item.toString()},
                            null, null, null);
                    if(cursor.moveToFirst()) {
                        holder.name.setText(cursor.getInt(0));
                        holder.icon.setImageResource(cursor.getInt(1));
                        holder.type.setText(cursor.getInt(2));
                        holder.desc.setText(cursor.getInt(3));
                    }
                    cursor.close();
                    db.close();
                } catch(SQLiteException e) {}

            }

            return row;
        }

        class RacialViewHolder {
            ImageView icon;
            TextView name;
            TextView type;
            TextView desc;
        }
    }
}
