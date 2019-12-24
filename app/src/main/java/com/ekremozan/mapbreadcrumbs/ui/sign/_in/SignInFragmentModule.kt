package com.ekremozan.mapbreadcrumbs.ui.sign._in

import dagger.Module
import dagger.Provides

@Module
abstract class SignInFragmentModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideSignInPresenter(presenter: SignInPresenter<ISignInView>): ISignInPresenter<ISignInView> = presenter
    }
}