package com.example.explore_ataw.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.explore_ataw.R;
import com.example.explore_ataw.WebViewController;


public class BBCFragment extends Fragment {

    //private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       // homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View  root = inflater.inflate(R.layout.fragment_bbc,container,false);

        WebView webView = root.findViewById(R.id.webviewBBC);
        webView.loadUrl("https://www.bbc.co.uk/news");
        webView.setWebViewClient(new WebViewController());


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }
}