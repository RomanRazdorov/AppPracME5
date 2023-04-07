package com.example.apppracme5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class ThirdFragment extends Fragment {
    final private static String TAG = ThirdFragment.class.getSimpleName();

    public ThirdFragment(){
    }
    EditText email;
    Button btnReg;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_linear_fragment, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        email = (EditText) view.findViewById(R.id.logMail);



        btnReg = (Button) view.findViewById(R.id.btnLogIn);

        btnReg.setOnClickListener(vie -> {
            Bundle userData = new Bundle();
            userData.putString("Email", email.getText().toString());
            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_secondFragment,userData);

        });

    }

}