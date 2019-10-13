package com.ekremozan.mapbreadcrumbs.ui.sign

import dagger.Module
import dagger.Provides

@Module
abstract class SignActivityModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideSignPresenter(presenter: SignPresenter<ISignView>): ISignPresenter<ISignView> = presenter
    }
}