package com.hariofspades.dagger2advanced.dagger.components;

import com.hariofspades.dagger2advanced.interfaces.RandomUsersApi;
import com.squareup.picasso.Picasso;

import dagger.Component;

@Component
public interface RandomUserComponent {
    RandomUsersApi getRandomUsersApi();
    Picasso getPicasso();
}
