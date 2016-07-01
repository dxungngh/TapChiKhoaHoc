package com.danielnguyen.khoahoc.domain.interactors;


import com.danielnguyen.khoahoc.domain.interactors.base.Interactor;


public interface WelcomingInteractor extends Interactor {

    interface Callback {
        void onMessageRetrieved(String message);

        void onRetrievalFailed(String error);
    }
}
