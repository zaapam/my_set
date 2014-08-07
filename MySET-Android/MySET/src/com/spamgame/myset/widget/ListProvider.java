package com.spamgame.myset.widget;

import java.util.ArrayList;

import com.spamgame.myset.R;
import com.spamgame.myset.util.SETFormat;
import com.spamgame.myset.util.SETObject;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;

public class ListProvider implements RemoteViewsFactory {

	private ArrayList<SETObject> data = new ArrayList<SETObject>();
	private Context context = null;
	private int appWidgetId;
	
	public ListProvider(Context context, Intent intent) {
		this.context = context;
		appWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
		 
		populateListItem();
	}
	
	private void populateListItem() {		
		data.add(new SETObject("BLAND", 2.18, 0.6, 2.13));
		data.add(new SETObject("BLAND-W3", 0.73, 0.6, 10.57));
		data.add(new SETObject("TRUE", 12.30, 0.8, 4.57));
		data.add(new SETObject("EFORL", 1.41, -0.6, -5.28));
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public RemoteViews getLoadingView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RemoteViews getViewAt(int position) {
		// TODO Auto-generated method stub
		final RemoteViews remoteView = new RemoteViews(context.getPackageName(), R.layout.widget_list_row);
		SETObject item = data.get(position);
		remoteView.setTextViewText(R.id.widget_symbol, item.getCode());
		remoteView.setTextViewText(R.id.widget_value, SETFormat.toString(item.getPrice()));
		//remoteView.setTextViewText(R.id.widget_value_change, SETFormat.toString(item.getPriceChange()));
		
		remoteView.setTextColor(R.id.widget_value, SETFormat.getColor(item.getPrice()));
		//remoteView.setTextColor(R.id.widget_value_change, SETFormat.getColor(item.getPriceChange()));
				 
		return remoteView;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDataSetChanged() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub

	}

}
