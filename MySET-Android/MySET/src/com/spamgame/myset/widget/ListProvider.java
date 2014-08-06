package com.spamgame.myset.widget;

import java.util.ArrayList;

import com.spamgame.myset.R;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;

public class ListProvider implements RemoteViewsFactory {

	private ArrayList<ListItem> listItemList = new ArrayList();
	private Context context = null;
	private int appWidgetId;
	
	public ListProvider(Context context, Intent intent) {
		this.context = context;
		appWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
		 
		populateListItem();
	}
	
	private void populateListItem() {
		for (int i = 0; i < 10; i++) {
			ListItem listItem = new ListItem();
			listItem.heading = "Heading" + i;
			listItem.content = i + " This is the content of the app widget listview.Nice content though";
			listItemList.add(listItem);
		}
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listItemList.size();
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RemoteViews getLoadingView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RemoteViews getViewAt(int position) {
		// TODO Auto-generated method stub
		final RemoteViews remoteView = new RemoteViews(
		context.getPackageName(), R.layout.widget_list_row);
		ListItem listItem = listItemList.get(position);
		remoteView.setTextViewText(R.id.heading, listItem.heading);
		remoteView.setTextViewText(R.id.content, listItem.content);
				 
		return remoteView;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 0;
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
