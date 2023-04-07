package com.example.apppracme5;

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


public class FirstFragment extends Fragment {
    final public static String TAG = FirstFragment.class.getSimpleName();

    public FirstFragment(){

    }

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }


    private EditText nickname;
    private EditText fname;
    private EditText sname;
    private EditText email;
    private TextView logIn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.activity_main_frament, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nickname = (EditText) view.findViewById(R.id.nickname);
        fname = (EditText) view.findViewById(R.id.name);
        sname = (EditText) view.findViewById(R.id.surname);
        email = (EditText) view.findViewById(R.id.email);
        logIn = (TextView) view.findViewById(R.id.logNow);

        TextView loadTitle = (TextView) view.findViewById(R.id.regscrn);
        loadTitle.setText(R.string.title);
        ImageView loadPicture = (ImageView) view.findViewById(R.id.catgif);
        loadPicture.setImageResource(R.drawable.catgif);
        Button btnReg = (Button) view.findViewById(R.id.btnreg);


        btnReg.setOnClickListener(vie -> {
            Bundle userData = new Bundle();
            userData.putString("Nickname", nickname.getText().toString());
            userData.putString("FName", fname.getText().toString());
            userData.putString("SName", sname.getText().toString());
            userData.putString("Email", email.getText().toString());
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment,userData);

        });
        logIn.setOnClickListener(vie -> {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_thirdFragment);
        });
    }

}