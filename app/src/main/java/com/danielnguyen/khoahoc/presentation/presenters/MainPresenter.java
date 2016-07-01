package com.danielnguyen.khoahoc.presentation.presenters;

import com.danielnguyen.khoahoc.presentation.presenters.base.BasePresenter;
import com.danielnguyen.khoahoc.presentation.ui.BaseView;


public interface MainPresenter extends BasePresenter {

    interface View extends BaseView {
        void displayWelcomeMessage(String msg);
    }
}
