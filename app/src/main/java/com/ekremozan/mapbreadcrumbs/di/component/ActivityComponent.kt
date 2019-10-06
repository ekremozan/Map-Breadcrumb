package com.ekremozan.mapbreadcrumbs.di.component

import com.ekremozan.mapbreadcrumbs.di.PerActivity
import com.ekremozan.mapbreadcrumbs.di.module.ActivityModule
import dagger.Component


@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    // fun inject(activity: MainActivity)
}