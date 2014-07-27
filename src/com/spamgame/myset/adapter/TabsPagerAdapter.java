package com.spamgame.myset.adapter;

import com.spamgame.myset.FavouriteFragment;
import com.spamgame.myset.SETIndexFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public static int PAGE_NUMBER = 2;
	
	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int index) {
		// TODO Auto-generated method stub
		switch (index) {
			case 0:
				return new FavouriteFragment();
				
			case 1:
				return new SETIndexFragment();
		}
		
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return PAGE_NUMBER;
	}

}
