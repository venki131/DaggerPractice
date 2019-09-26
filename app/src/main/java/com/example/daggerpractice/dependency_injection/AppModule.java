package com.example.daggerpractice.dependency_injection;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.daggerpractice.R;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * add things which are going to stay for the complete application eg. retrofit
 */
@Module
public class AppModule {
    @Singleton
    @Provides
    static RequestOptions provideRequestOptions() {
        return RequestOptions
                .placeholderOf(R.drawable.logo)
                .error(R.drawable.ic_launcher_background)
                .apply(RequestOptions.circleCropTransform());
    }

    @Singleton
    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions) {
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    @Singleton
    @Provides
    static Drawable provideAppDrawable(Application application) {
        return ContextCompat.getDrawable(application, R.drawable.logo);
    }
}
