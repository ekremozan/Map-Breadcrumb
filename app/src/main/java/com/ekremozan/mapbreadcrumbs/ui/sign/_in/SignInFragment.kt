package com.ekremozan.mapbreadcrumbs.ui.sign._in

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ekremozan.mapbreadcrumbs.R
import com.ekremozan.mapbreadcrumbs.ui.base.BaseFragment
import javax.inject.Inject

class SignInFragment : BaseFragment(), ISignInView {

    @Inject
    lateinit var presenter: ISignInPresenter<ISignInView>

    override fun setUp(view: View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_in_layout, container, false)

        return view
    }

    override fun onDestroyView() {
        presenter.onDetach()
        super.onDestroyView()
    }

}
