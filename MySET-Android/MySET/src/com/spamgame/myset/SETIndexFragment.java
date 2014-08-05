package com.spamgame.myset;

import java.util.ArrayList;

import com.spamgame.myset.adapter.SETObjectAdapter;
import com.spamgame.myset.util.SETObject;

import eu.erikw.PullToRefreshListView;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SETIndexFragment extends Fragment {

	private PullToRefreshListView listView;
	private SETObjectAdapter adapter;
	private ArrayList<SETObject> listSymbol;
	
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView = inflater.inflate(R.layout.fragment_setindex, container, false);
		
		listSymbol = new ArrayList<SETObject>();
		listSymbol.add(new SETObject("SET", 1513, 17.13, 2.13));
		listSymbol.add(new SETObject("SET50", 1133, 0.6, 10.57));
		listSymbol.add(new SETObject("SET100", 956.30, 0.8, 4.57));
		listSymbol.add(new SETObject("MAI", 489, -0.6, -5.28));
		
		adapter = new SETObjectAdapter(getActivity(), listSymbol);
		
		listView = (PullToRefreshListView)rootView.findViewById(R.id.setindex_list);
		listView.setAdapter(adapter);
		
		return rootView;
	}
}
