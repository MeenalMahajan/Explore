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


public class CNNFragment extends Fragment {

   // private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //slideshowViewModel = new ViewModelProvider(this).get(SlideshowViewModel.class);

        View  root = inflater.inflate(R.layout.fragment_cnn,container,false);

        WebView webView = root.findViewById(R.id.webviewCNN);
        webView.loadUrl("https://www.cnn.com");
        webView.setWebViewClient(new WebViewController());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
       // binding = null;
    }
}