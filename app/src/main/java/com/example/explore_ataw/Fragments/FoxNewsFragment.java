package com.example.explore_ataw.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.explore_ataw.R;
import com.example.explore_ataw.WebViewController;

public class FoxNewsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View  root = inflater.inflate(R.layout.fragment_fox_news,container,false);

        WebView webView = root.findViewById(R.id.webviewFoxNews);
        webView.loadUrl("https://www.foxnews.com");
        webView.setWebViewClient(new WebViewController());


        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // binding = null;
    }

}