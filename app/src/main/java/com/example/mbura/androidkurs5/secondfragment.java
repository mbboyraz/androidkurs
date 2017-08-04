package com.example.mbura.androidkurs5;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mbura on 22.07.2017.
 */

public class secondfragment extends Fragment {
    private final String MAIN_TAG="second fragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View v=inflater.inflate(R.layout.fragment_second,container,false);
        Log.e(MAIN_TAG,"onCreateView");
        return v;
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.e(MAIN_TAG,"onAttachFragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(MAIN_TAG,"onStart");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(MAIN_TAG,"onCreate");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(MAIN_TAG,"onResume");
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        Log.e(MAIN_TAG,"onCreateOptionsMenu");
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Log.e(MAIN_TAG,"onPrepareOptionsMenu");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(MAIN_TAG,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(MAIN_TAG,"onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(MAIN_TAG,"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(MAIN_TAG,"onDestroy");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(MAIN_TAG,"onConfigurationChanged");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(MAIN_TAG,"onDetach");
    }

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
        Log.e(MAIN_TAG,"onInflate");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(MAIN_TAG,"onAttach");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(MAIN_TAG,"onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(MAIN_TAG,"onActivityCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e(MAIN_TAG,"onViewStateRestored");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(MAIN_TAG,"onSaveInstanceState");
    }

}

