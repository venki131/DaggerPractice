package com.example.daggerpractice;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

import com.example.daggerpractice.models.User;
import com.example.daggerpractice.ui.auth.AuthResource;

import javax.inject.Inject;

public class SessionManager {

    private static final String TAG = "SessionManager";
    private MediatorLiveData<AuthResource<User>> cachedUser = new MediatorLiveData<>();

    @Inject
    public SessionManager() {
    }

    public void authenticateWithId(final LiveData<AuthResource<User>> source) {
        if (cachedUser != null) {
            cachedUser.setValue(AuthResource.loading((User) null));
            cachedUser.addSource(source, new Observer<AuthResource<User>>() {
                @Override
                public void onChanged(AuthResource<User> userAuthResource) {
                    cachedUser.setValue(userAuthResource);
                    cachedUser.removeSource(source);
                }
            });
        } else{
            Log.d(TAG, "authenticateWithId: previous session detected. Retrieving user from cache.");
        }
    }

    public void logout() {
        Log.d(TAG, "logout: logging out...");
        cachedUser.setValue(AuthResource.<User>logout());
    }

    public LiveData<AuthResource<User>> getAuthUser() {
        return cachedUser;
    }
}
