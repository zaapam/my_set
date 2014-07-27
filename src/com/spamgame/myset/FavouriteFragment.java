package com.spamgame.myset;

import com.spamgame.myset.adapter.FavouriteAdapter;

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
		
		String[] values = new String[]{ "Message1", "Message2", "Message3" };
		//ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values);
		FavouriteAdapter adapter = new FavouriteAdapter(getActivity(), values);
		setListAdapter(adapter);
		
		return rootView;
	}
}
