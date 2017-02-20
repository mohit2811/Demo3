package com.example.mohitpallaptop.letsshareride;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by ghumman on 2/10/2017.
 */

public class ride_fragment extends Fragment {
Button play;

    Boolean music_state = false;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View rootview = inflater.inflate(R.layout.ride_layout ,container ,false);
        play=(Button)rootview.findViewById ( R.id.play_btn );
        final MediaPlayer mPlayer = MediaPlayer.create(getActivity (), R.raw.vehicle);
        play.setOnClickListener ( new View.OnClickListener ()
        {
            @Override
             public void onClick(View v)
                {
                   if (music_state)
                        {
                        mPlayer.pause ();
                      music_state = false;
                        }
                    else
                        {
                        mPlayer.start ();
                        music_state = true;

                        }
                }
        }
        );

            return rootview;
    }
}
