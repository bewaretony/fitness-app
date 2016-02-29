package com.jjsoftware.fitaddiction;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jai on 2/28/2016.
 */
public class NavigationDrawerAdapter extends BaseAdapter {
    private List<NavigationDrawerItem> mDrawerItems;
    private LayoutInflater mLayoutInflater;

    public NavigationDrawerAdapter(Context context, List<NavigationDrawerItem> mDrawerItems) {
        super();
        this.mDrawerItems = mDrawerItems;
        this.mDrawerItems = mDrawerItems;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mDrawerItems.size();
    }

    @Override
    public Object getItem(int position) {
        //This is not used because we don't need it for this application
        //I am writing comments for the first time! Yay! I'm Batman
        //Schreiber is my hero
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = mLayoutInflater.inflate(R.layout.custom_navigation_drawer, null);
        NavigationDrawerItem navigationDrawerItem = mDrawerItems.get(position);

        TextView title = (TextView) convertView.findViewById(R.id.navigation_item_title);
        title.setText(navigationDrawerItem.getTitle());

        ImageView icon = (ImageView) convertView.findViewById(R.id.navigation_item_icon);
        icon.setImageResource(navigationDrawerItem.getIconID());

        return convertView;
    }
}
