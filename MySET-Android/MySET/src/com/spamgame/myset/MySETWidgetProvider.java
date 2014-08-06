package com.spamgame.myset;

import java.util.Random;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class MySETWidgetProvider extends AppWidgetProvider {

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
		// TODO Auto-generated method stub
		ComponentName widget = new ComponentName(context, MySETWidgetProvider.class);
		int[] allWidgetIds = appWidgetManager.getAppWidgetIds(widget);
		
		for (int widgetId : allWidgetIds) {
			// create some random data
			int number = (new Random().nextInt(100));
			
			RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
			remoteViews.setTextViewText(R.id.update, String.valueOf(number));
			
			// Register an onClickListener
			Intent intent = new Intent(context, MySETWidgetProvider.class);

			intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
			intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetIds);

			PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
			remoteViews.setOnClickPendingIntent(R.id.update, pendingIntent);
			appWidgetManager.updateAppWidget(widgetId, remoteViews);
		}
		
		super.onUpdate(context, appWidgetManager, appWidgetIds);
	}
}
