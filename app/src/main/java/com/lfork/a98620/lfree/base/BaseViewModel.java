package com.lfork.a98620.lfree.base;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;

import com.lfork.a98620.lfree.base.viewmodel.ViewModelNavigator;

/**
 * Created by 98620 on 2018/3/19.
 */

public abstract class BaseViewModel extends BaseObservable{

    public final ObservableBoolean dataIsLoading = new ObservableBoolean(true);

    public final ObservableBoolean dataIsEmpty = new ObservableBoolean(true);

    public Context context;

    private ViewModelNavigator navigator;

    public  void start(){};

    public  void destroy(){};

    public BaseViewModel() {
    }

    public BaseViewModel(Context context) {
        this.context = context;
    }

    public ViewModelNavigator getNavigator() {
        return navigator;
    }

    public void setNavigator(ViewModelNavigator navigator) {
        this.navigator = navigator;
    }

    public void unbindNavigator() {
        this.navigator = null;
    }
}