package com.example.daggerpractice.dependency_injection.main;

import com.example.daggerpractice.network.main.MainApi;
import com.example.daggerpractice.ui.main.posts.PostRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @Provides
    static MainApi provideMainApi(Retrofit retrofit) {
        return retrofit.create(MainApi.class);
    }

    @Provides
    static PostRecyclerAdapter provideAdapter() {
        return new PostRecyclerAdapter();
    }
}
