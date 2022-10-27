package com.kaspin.menghitungluastutorial;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;

import com.kaspin.menghitungluastutorial.model.LuasModel;
import com.kaspin.menghitungluastutorial.viewModel.LuasViewModel;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class LuasTest {
    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    LuasViewModel luasViewModel;
    LuasModel luasModel;

    @Before
    public void setup() {
        luasViewModel = new LuasViewModel();
        luasModel = new LuasModel(10, 2);

        luasViewModel.setMutableLiveData(luasModel);
    }

    @Test
    public void hitungLuas() {
        try {
            int hasilLuas = LiveDataUtil.getOrAwaitValue(luasViewModel.hitungLuas);

            assertEquals(20, hasilLuas);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
