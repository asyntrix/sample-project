package com.angkorsuntrix.laundryapp.ui.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.angkorsuntrix.laundryapp.R;
import com.angkorsuntrix.laundryapp.databinding.FragmentLoginBinding;

/**
 * Created by borrom on 2/22/16.
 */
public class LoginFragment extends Fragment {

    FragmentLoginBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false);
        return mBinding.getRoot();
    }

}
