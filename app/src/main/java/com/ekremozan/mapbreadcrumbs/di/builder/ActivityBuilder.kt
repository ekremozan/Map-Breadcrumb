package com.ekremozan.mapbreadcrumbs.di.builder

import com.ekremozan.mapbreadcrumbs.di.scope.ActivityScope
import com.ekremozan.mapbreadcrumbs.ui.sign.SignActivity
import com.ekremozan.mapbreadcrumbs.ui.sign.SignActivityModule
import com.ekremozan.mapbreadcrumbs.ui.sign._in.SignInFragment
import com.ekremozan.mapbreadcrumbs.ui.sign._in.SignInFragmentModule
import com.ekremozan.mapbreadcrumbs.ui.sign.up.SignUpFragment
import com.ekremozan.mapbreadcrumbs.ui.sign.up.SignUpFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [SignActivityModule::class])
    abstract fun bindMainActivity(): SignActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [SignUpFragmentModule::class])
    abstract fun bindSignUpFragment(): SignUpFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [SignInFragmentModule::class])
    abstract fun bindSignInFragment(): SignInFragment
}