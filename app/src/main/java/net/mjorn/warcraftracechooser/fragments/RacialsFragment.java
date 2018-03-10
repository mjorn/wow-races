package net.mjorn.warcraftracechooser.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import net.mjorn.warcraftracechooser.R;
import net.mjorn.warcraftracechooser.races.Racial;

import java.util.List;

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

    private class RacialAdapter extends ArrayAdapter<Racial> {

        Context context;
        int resource;
        List<Racial> list;

        public RacialAdapter(Context context, int resource, List<Racial> list) {
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

            if (row == null) {
                LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                row = inflater.inflate(R.layout.fragment_racials_item, parent, false);

                holder = new RacialViewHolder();
                holder.icon = row.findViewById(R.id.racial_icon);
                holder.name = row.findViewById(R.id.racial_name);
                holder.type = row.findViewById(R.id.racial_type);
                holder.desc = row.findViewById(R.id.racial_desc);

                row.setTag(holder);
            } else {
                holder = (RacialViewHolder) row.getTag();
            }

            Racial racial = getItem(position);

            holder.icon.setImageResource(racial.getIcon());
            holder.name.setText(racial.getName());
            holder.type.setText(racial.getType().toString());
            holder.desc.setText(racial.getDesc());

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
