package com.andraskesik.covid.registration_fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andraskesik.covid.R;
import com.andraskesik.covid.activities.SignUpActivity;

/**
 * Created by andra on 2016-07-21.
 */
public class LoginDataFragment extends Fragment implements View.OnClickListener {

    private static final String TAG = LoginDataFragment.class.getSimpleName();
    private SignUpActivity mActivity;
    private TextInputLayout mEmail;
    private TextInputLayout mPassword;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mActivity = (SignUpActivity) getActivity();
        View view = inflater.inflate(R.layout.fragment_register_logindata, container, false);
        mActivity.setTitle("Register & Login");

        view.findViewById(R.id.button_register_logindata).setOnClickListener(this);

        mEmail =  (TextInputLayout) view.findViewById(R.id.field_register_email);
        mPassword = (TextInputLayout) view.findViewById(R.id.field_register_password);

        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_register_logindata:
                Log.d(TAG, mActivity.getmUser().toString());
//                Toast.makeText(getActivity(), mActivity.getmUser().toString(), Toast.LENGTH_SHORT).show();
                mActivity.getmUser().setPremium(false);
                ((SignUpActivity) getActivity()).createUser(
                                                            mEmail.getEditText().getText().toString(),
                                                            mPassword.getEditText().getText().toString());
                break;

        }
    }
}
