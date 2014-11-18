package com.example.patadechucho;

import com.example.patadechucho.MainActivity.PlaceholderFragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;

public class InicioActivity extends ActionBarActivity
	implements NavigationDrawerFragment.NavigationDrawerCallbacks {

	/**
	* Fragment managing the behaviors, interactions and presentation of the navigation drawer.
	*/
	private NavigationDrawerFragment mNavigationDrawerFragment;
	
	/**
	* Used to store the last screen title. For use in {@link #restoreActionBar()}.
	*/
	private CharSequence mTitle;
	
	@Override
	public void onNavigationDrawerItemSelected(int position) {
		// update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
	}


}
