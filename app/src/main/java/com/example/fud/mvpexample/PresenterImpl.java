package com.example.fud.mvpexample;

/**
 * Created by FuD on 15/7/10.
 */
public class PresenterImpl implements Presenter {

    MainView view;
    MergeModel model;
    PresenterImpl(MainView view){
        this.view = view;
        model = new MergeModelImpl();
    }
    @Override
    public void mergeText(String a) {
        view.setText(model.getMerge(a,"123"));
    }
}
