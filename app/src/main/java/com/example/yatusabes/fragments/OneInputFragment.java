package com.example.yatusabes.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneInputFragment extends Fragment {
    View mMainView;
    private OnRadiusChangeListener mListener;
    public OneInputFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mMainView = inflater.inflate(R.layout.fragment_one_input, container, false);
        Button button = (Button) mMainView.findViewById(R.id.calculate_button);
        button.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }

            @Override
            public void OnClick(View view) {
                calculate(view);
            }
        });
        return mMainView;
    }

    public void calculate() {

        String radius = ((EditText) mMainView.findViewById(R.id.input_radius)).getText().toString();
        double rad = Float.parseFloat(radius);
        double volume = 4 * Math.PI * Math.pow(rad, 3) / 3;
    }

    interface OnRadiusChangeListener {
        void onRadiusChange(double rad, double volume);
    }

}
