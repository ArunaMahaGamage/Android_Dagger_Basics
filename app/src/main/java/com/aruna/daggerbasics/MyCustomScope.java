package com.aruna.daggerbasics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

// Creates MyCustomScope
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomScope {
}
