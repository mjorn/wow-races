package net.mjorn.warcraftracechooser.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import net.mjorn.warcraftracechooser.R;
import net.mjorn.warcraftracechooser.races.WowClass;

import java.util.ArrayList;
import java.util.List;

public class ClassesFragment extends RaceFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_classes, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();
        if(view!=null) {

            Context context = getLayoutInflater().getContext();
            int resource = R.layout.fragment_classes_item;
            ArrayList<WowClass> list = race.getClasses();

            ListView listView = view.findViewById(R.id.list_of_classes);
            WowClassAdapter adapter = new WowClassAdapter(context, resource, list);
            listView.setAdapter(adapter);

        }
    }

    private class WowClassAdapter extends ArrayAdapter<WowClass> {

        Context context;
        int resource;
        List<WowClass> list;

        public WowClassAdapter(Context context, int resource, List<WowClass> list) {
            super(context, resource, list);

            this.context = context;
            this.resource = resource;
            this.list = list;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            View row = convertView;
            WowClassViewHolder holder = null;

            if(row==null) {
                LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                row = inflater.inflate(resource, parent, false);

                holder = new WowClassViewHolder();
                holder.image = row.findViewById(R.id.class_image);
                holder.name = row.findViewById(R.id.class_name);
                holder.specs = row.findViewById(R.id.class_specs);

                row.setTag(holder);
            } else {
                holder = (WowClassViewHolder) row.getTag();
            }

            WowClass wowClass = getItem(position);

            holder.image.setImageResource(wowClass.image);
            holder.name.setText(wowClass.name);
            holder.name.setTextColor(getResources().getColor(wowClass.color));
            holder.specs.setText(wowClass.specs);

            return row;
        }

        class WowClassViewHolder {
            ImageView image;
            TextView name;
            TextView specs;
        }
    }

}
