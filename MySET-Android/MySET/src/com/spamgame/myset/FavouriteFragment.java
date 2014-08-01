package com.spamgame.myset;

import java.util.ArrayList;

import com.spamgame.myset.adapter.FavouriteAdapter;
import com.spamgame.myset.util.SETObject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class FavouriteFragment extends ListFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView = inflater.inflate(R.layout.fragment_favourite, container, false);
		
		//String[] values = new String[]{ "Message1", "Message2", "Message3" };
		ArrayList<SETObject> objects = new ArrayList<SETObject>();
		objects.add(new SETObject("BLAND", 2.18, 0.6, 2.13));
		objects.add(new SETObject("BLAND-W3", 0.73, 0.6, 10.57));
		objects.add(new SETObject("TRUE", 12.30, 0.8, 4.57));
		objects.add(new SETObject("EFORL", 1.41, -0.6, -5.28));
		//ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values);
		FavouriteAdapter adapter = new FavouriteAdapter(getActivity(), objects);
		setListAdapter(adapter);
		
		return rootView;
	}
}
