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


public class AljazeraFragment extends Fragment {

   // private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
      //   galleryViewModel = new ViewModelProvider(this).get(GalleryViewModel.class);

        View  root = inflater.inflate(R.layout.fragment_aljazera,container,false);

        WebView webView = root.findViewById(R.id.webviewAljazera);
        webView.loadUrl("https://www.aljazeera.com");
        webView.setWebViewClient(new WebViewController());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
       // binding = null;
    }
}