package com.spamgame.myset;

import java.util.ArrayList;

import org.json.JSONObject;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxStatus;
import com.spamgame.myset.adapter.SETObjectAdapter;
import com.spamgame.myset.util.SETObject;

import eu.erikw.PullToRefreshListView;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class FavouriteFragment extends Fragment implements OnClickListener {

	private PullToRefreshListView listView;
	private SETObjectAdapter adapter;
	private Button btnAdd;
	private EditText textAdd;
	private ArrayList<SETObject> listSymbol;
	private AQuery aq;
	
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView = inflater.inflate(R.layout.fragment_favourite, container, false);
		
		Log.d(AppConfig.LOG, "Hello MySET");
		
		//String[] values = new String[]{ "Message1", "Message2", "Message3" };
		listSymbol = new ArrayList<SETObject>();
		//ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values);
		adapter = new SETObjectAdapter(getActivity(), listSymbol);
		//setListAdapter(adapter);
		
		listView = (PullToRefreshListView)rootView.findViewById(R.id.favourite_list);
		listView.setAdapter(adapter);
		
		aq = new AQuery(getActivity());
		
		textAdd = (EditText)rootView.findViewById(R.id.edit_add_favourite);
		
		btnAdd = (Button)rootView.findViewById(R.id.btn_add_favourite);
		btnAdd.setOnClickListener(this);
		
		getActivity().runOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
		        Log.d(AppConfig.LOG, "Load...");
		        
		        String url = "http://www.google.com/uds/GnewsSearch?q=Obama&v=1.0";             
		        aq.ajax(url, JSONObject.class, FavouriteFragment.this, "bindData");
			}
		});
		
		
		
		return rootView;
	}
	
	public void bindData(String url, JSONObject json, AjaxStatus status) {
		Log.d(AppConfig.LOG, "Favourite binddata");
		
		listSymbol.add(new SETObject("BLAND", 2.18, 0.6, 2.13));
		listSymbol.add(new SETObject("BLAND-W3", 0.73, 0.6, 10.57));
		listSymbol.add(new SETObject("TRUE", 12.30, 0.8, 4.57));
		listSymbol.add(new SETObject("EFORL", 1.41, -0.6, -5.28));
		
		adapter.notifyDataSetChanged();
	}
	
	private void doAddSymbol() {
		String symbol = textAdd.getText().toString();
		
		listSymbol.add(new SETObject("TEST", 1.41, -0.6, -5.28));
		adapter.notifyDataSetChanged();
	}
	
	private class DataTask extends AsyncTask<Void, Void, String[]> {

        @Override
        protected String[] doInBackground(Void... params) {
            // Simulates a background job.
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                ;
            }
            
            return null;
        }

        @Override
        protected void onPostExecute(String[] result) {
            //mListItems.addFirst("Added after refresh...");

            // Call onRefreshComplete when the list has been refreshed.
            //((PullToRefreshListView) getListView()).onRefreshComplete();

            super.onPostExecute(result);
        }
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v == btnAdd) {
			doAddSymbol();
			textAdd.clearFocus();
			
			final InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
		    imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
		}
	}
}
