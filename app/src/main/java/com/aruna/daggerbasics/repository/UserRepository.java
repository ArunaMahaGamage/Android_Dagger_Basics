package com.aruna.daggerbasics.repository;

import com.aruna.daggerbasics.MyCustomScope;

import javax.inject.Inject;

// Scope this class to a component using @Singleton scope (i.e. ApplicationGraph)

@MyCustomScope
public class UserRepository {
    private final UserLocalDataSource userLocalDataSource;
    private final UserRemoteDataSource userRemoteDataSource;

    // @Inject lets Dagger know how to create instances of this object
    @Inject
    public UserRepository(UserLocalDataSource userLocalDataSource, UserRemoteDataSource userRemoteDataSource) {
        this.userLocalDataSource = userLocalDataSource;
        this.userRemoteDataSource = userRemoteDataSource;
    }
}
