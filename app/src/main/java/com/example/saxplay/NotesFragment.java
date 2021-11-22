package com.example.saxplay;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Objects;

public class NotesFragment extends Fragment implements View.OnClickListener {

    private static final String TAG = "NotesFragment";

    Button low_Bb, low_B, low_C, low_C_sharp, low_D, low_D_sharp, low_E, low_F, low_F_sharp, low_G, low_G_sharp, low_A;
    Button mid_Bb, mid_B, mid_C, mid_C_sharp, mid_D, mid_D_sharp, mid_E, mid_F, mid_F_sharp, mid_G, mid_G_sharp, mid_A;
    Button high_Bb, high_B, high_C, high_C_sharp, high_D, high_D_sharp, high_E, high_F, high_F_sharp, high_G, high_G_sharp, high_A;
    Button high_high_Bb, high_high_B, high_high_C;

    public NotesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notes, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initialiseLowButtons();
        initialiseMidButtons();
        initialiseHighButtons();
        initialiseHighHighButtons();

        setLowButtonsClick();
        setMidButtonsClick();
        setHighButtonsClick();
        setHighHighButtonsClick();

    }

    public void initialiseLowButtons() {

        low_Bb = Objects.requireNonNull(getActivity()).findViewById(R.id.low_a_sharp);
        low_B = getActivity().findViewById(R.id.low_b);
        low_C = getActivity().findViewById(R.id.low_c);
        low_C_sharp = getActivity().findViewById(R.id.low_c_sharp);
        low_D = getActivity().findViewById(R.id.low_d);
        low_D_sharp = getActivity().findViewById(R.id.low_d_sharp);
        low_E = getActivity().findViewById(R.id.low_e);
        low_F = getActivity().findViewById(R.id.low_f);
        low_F_sharp = getActivity().findViewById(R.id.low_f_sharp);
        low_G = getActivity().findViewById(R.id.low_g);
        low_G_sharp = getActivity().findViewById(R.id.low_g_sharp);
        low_A = getActivity().findViewById(R.id.low_a);

    }

    public void initialiseMidButtons() {

        mid_Bb = Objects.requireNonNull(getActivity()).findViewById(R.id.mid_a_sharp);
        mid_B = getActivity().findViewById(R.id.mid_b);
        mid_C = getActivity().findViewById(R.id.mid_c);
        mid_C_sharp = getActivity().findViewById(R.id.mid_c_sharp);
        mid_D = getActivity().findViewById(R.id.mid_d);
        mid_D_sharp = getActivity().findViewById(R.id.mid_d_sharp);
        mid_E = getActivity().findViewById(R.id.mid_e);
        mid_F = getActivity().findViewById(R.id.mid_f);
        mid_F_sharp = getActivity().findViewById(R.id.mid_f_sharp);
        mid_G = getActivity().findViewById(R.id.mid_g);
        mid_G_sharp = getActivity().findViewById(R.id.mid_g_sharp);
        mid_A = getActivity().findViewById(R.id.mid_a);
    }

    public void initialiseHighButtons() {

        high_Bb = Objects.requireNonNull(getActivity()).findViewById(R.id.high_a_sharp);
        high_B = getActivity().findViewById(R.id.high_b);
        high_C = getActivity().findViewById(R.id.high_c);
        high_C_sharp = getActivity().findViewById(R.id.high_c_sharp);
        high_D = getActivity().findViewById(R.id.high_d);
        high_D_sharp = getActivity().findViewById(R.id.high_d_sharp);
        high_E = getActivity().findViewById(R.id.high_e);
        high_F = getActivity().findViewById(R.id.high_f);
        high_F_sharp = getActivity().findViewById(R.id.high_f_sharp);
        high_G = getActivity().findViewById(R.id.high_g);
        high_G_sharp = getActivity().findViewById(R.id.high_g_sharp);
        high_A = getActivity().findViewById(R.id.high_a);
    }

    public void initialiseHighHighButtons() {

        high_high_Bb = Objects.requireNonNull(getActivity()).findViewById(R.id.high_high_a_sharp);
        high_high_B = getActivity().findViewById(R.id.high_high_b);
        high_high_C = getActivity().findViewById(R.id.high_high_c);

    }

    public void setLowButtonsClick() {
        low_Bb.setOnClickListener(this);
        low_B.setOnClickListener(this);
        low_C.setOnClickListener(this);
        low_C_sharp.setOnClickListener(this);
        low_D.setOnClickListener(this);
        low_D_sharp.setOnClickListener(this);
        low_E.setOnClickListener(this);
        low_F.setOnClickListener(this);
        low_F_sharp.setOnClickListener(this);
        low_G.setOnClickListener(this);
        low_G_sharp.setOnClickListener(this);
        low_A.setOnClickListener(this);
    }

    public void setMidButtonsClick() {

        mid_Bb.setOnClickListener(this);
        mid_B.setOnClickListener(this);
        mid_C.setOnClickListener(this);
        mid_C_sharp.setOnClickListener(this);
        mid_D.setOnClickListener(this);
        mid_D_sharp.setOnClickListener(this);
        mid_E.setOnClickListener(this);
        mid_F.setOnClickListener(this);
        mid_F_sharp.setOnClickListener(this);
        mid_G.setOnClickListener(this);
        mid_G_sharp.setOnClickListener(this);
        mid_A.setOnClickListener(this);
    }

    public void setHighButtonsClick() {

        high_Bb.setOnClickListener(this);
        high_B.setOnClickListener(this);
        high_C.setOnClickListener(this);
        high_C_sharp.setOnClickListener(this);
        high_D.setOnClickListener(this);
        high_D_sharp.setOnClickListener(this);
        high_E.setOnClickListener(this);
        high_F.setOnClickListener(this);
        high_F_sharp.setOnClickListener(this);
        high_G.setOnClickListener(this);
        high_G_sharp.setOnClickListener(this);
        high_A.setOnClickListener(this);
    }

    public void setHighHighButtonsClick() {

        high_high_Bb.setOnClickListener(this);
        high_high_B.setOnClickListener(this);
        high_high_C.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        String ourId = view.getResources().getResourceEntryName(id);

        Log.i(TAG, "onClick: " + ourId);

        int resId = view.getResources().getIdentifier(ourId, "raw", "com.example.saxplay");

        MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), resId);

        mediaPlayer.start();

    }


}