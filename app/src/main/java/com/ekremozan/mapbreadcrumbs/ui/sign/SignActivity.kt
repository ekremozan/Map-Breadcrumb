package com.ekremozan.mapbreadcrumbs.ui.sign


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.ekremozan.mapbreadcrumbs.R
import com.ekremozan.mapbreadcrumbs.databinding.ActivitySignBinding
import com.ekremozan.mapbreadcrumbs.service.LocationService
import com.ekremozan.mapbreadcrumbs.ui.base.BaseActivity
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit
import javax.inject.Inject


class SignActivity : BaseActivity(), ISignView {

    @Inject
    lateinit var mPresenter: ISignPresenter<ISignView>

    private lateinit var binding: ActivitySignBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,  R.layout.activity_sign)
        mPresenter.onAttach(this@SignActivity)
        Intent(this, LocationService::class.java).also {
            startService(it)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDetach()

    }
}
