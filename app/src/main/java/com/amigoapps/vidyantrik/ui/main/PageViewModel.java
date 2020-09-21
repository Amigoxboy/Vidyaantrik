package com.amigoapps.vidyantrik.ui.main;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;



import java.io.IOError;
import java.io.IOException;

import static android.content.ContentValues.TAG;

public class PageViewModel extends ViewModel {



    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();

    private LiveData<String> Heading = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            switch(mIndex.getValue())
            {

                case 1: return "--Home--";
                case 2:  return "--Events--";
                case 3: return "--Stories--";
                default: return "Sorry Page Under Construction";
            }
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return Heading;
    }
}

