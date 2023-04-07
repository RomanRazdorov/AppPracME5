package com.example.apppracme5;

import android.content.Context;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class SecondFragment extends Fragment {
    final public static String TAG = SecondFragment.class.getSimpleName();

    public SecondFragment() {

    }

    public static SecondFragment newInstance() {
        return new SecondFragment();
    }


    private TextView Nick;
    private TextView Names;
    private TextView Surnames;
    private TextView Emails;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_data_reciever_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Nick = (TextView) view.findViewById(R.id.getNick);
        Names = (TextView) view.findViewById(R.id.getName);
        Surnames = (TextView) view.findViewById(R.id.getSurname);
        Emails = (TextView) view.findViewById(R.id.getEmail);

        if (getArguments() != null) {
            Bundle bundle = getArguments();
            if (bundle.get("Nickname") != null) {
                Nick.setText(bundle.get("Nickname").toString());
            } else {
                Nick.setText("");
            }
            if (bundle.get("FName") != null) {
                Names.setText(bundle.get("FName").toString());
            } else {
                Names.setText("");
            }
            if (bundle.get("SName") != null) {
                Surnames.setText(bundle.get("SName").toString());
            } else {
                Surnames.setText("");
            }
            Emails.setText(bundle.get("Email").toString());
        }

    }


}
