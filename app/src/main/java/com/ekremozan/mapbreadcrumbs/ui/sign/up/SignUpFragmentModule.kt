package com.ekremozan.mapbreadcrumbs.ui.sign.up

import dagger.Module
import dagger.Provides

@Module
abstract class SignUpFragmentModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideSignUpPresenter(presenter: SignUpPresenter<ISignUpView>): ISignUpPresenter<ISignUpView> = presenter
    }
}