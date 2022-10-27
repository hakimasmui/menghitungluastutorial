package com.kaspin.menghitungluastutorial.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.kaspin.menghitungluastutorial.model.LuasModel;

public class LuasViewModel extends ViewModel {
    MutableLiveData<LuasModel> mutableLiveData = new MutableLiveData<>();

    public LuasViewModel() {

    }

    public void setMutableLiveData(LuasModel luasModel) {
        mutableLiveData.setValue(luasModel);
    }

    public LiveData<Integer> hitungLuas = Transformations.map(mutableLiveData,
            LuasModel::hitungLuas);

    public void hitungLuas(int aqua, int pensil) {

    }

    String[] array = new String[]{"Aqua", "Pensil"};
}
