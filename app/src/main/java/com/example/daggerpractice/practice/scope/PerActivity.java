package com.example.daggerpractice.practice.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Creating custom scopes which will create Singleton for activity
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {
}
