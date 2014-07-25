package com.spamgame.myset.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class FavouriteAdapter extends ArrayAdapter<String> {

	private Context context;
	private String[] values;
	
	public FavouriteAdapter(Context context, String[] values) {
		super(context, android.R.layout.simple_list_item_1);
		
		this.context = context;
		this.values = values;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		return super.getView(position, convertView, parent);
	}
}
