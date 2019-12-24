package com.ekremozan.mapbreadcrumbs.ui.sign._in

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.ekremozan.mapbreadcrumbs.R
import com.ekremozan.mapbreadcrumbs.data.remote.datasources.UserDataSource
import com.ekremozan.mapbreadcrumbs.data.remote.models.request.Login
import com.ekremozan.mapbreadcrumbs.databinding.ActivitySignBinding
import com.ekremozan.mapbreadcrumbs.databinding.FragmentSignInBinding
import com.ekremozan.mapbreadcrumbs.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_sign_in.*
import javax.inject.Inject

class SignInFragment : BaseFragment(), ISignInView {

    @Inject
    lateinit var presenter: ISignInPresenter<ISignInView>
    @Inject
    lateinit var userDataSource: UserDataSource
    private lateinit var binding: FragmentSignInBinding

    override fun setUp(view: View) {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter.onAttach(this)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_in, container, false)
        binding.signUp.setOnClickListener { navigateSignUp() }
        binding.loginButton.setOnClickListener { authenticate() }
        return binding.root
    }

    override fun onDestroyView() {
        presenter.onDetach()
        super.onDestroyView()
    }

    override fun navigateSignUp() {
        Navigation.findNavController(view!!).navigate(R.id.action_signInFragment_to_signUpFragment)
    }

    private fun authenticate() {
        val login = Login(textViewUserName.text.toString().trim(), textViewPassword.text.toString().trim())
        presenter.signIn(login)
    }
}
