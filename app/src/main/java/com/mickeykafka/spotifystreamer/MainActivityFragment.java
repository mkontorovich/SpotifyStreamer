package com.mickeykafka.spotifystreamer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> artistListAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] artistSampleData = {
                "Coldplay",
                "The Strokes",
                "Velvet Underground",
                "No Doubt",
                "The Virgins",
                "Roy Orbison",
                "The Pillows",
                "Weezer",
                "Arcade Fire",
                "Radiohead",
                "Pixies",
                "Ratatat",
                "Yeah Yeah Yeahs",
                "Daft Punk",
                "The Seatbelts"
        };

        List<String> artistSampleList = new ArrayList<>(Arrays.asList(artistSampleData));

        artistListAdapter = new ArrayAdapter<>(getActivity(),
                R.layout.list_item_artist, R.id.list_item_artist_textview, artistSampleList);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view_artists);
        listView.setAdapter(artistListAdapter);

        return rootView;
    }
}
