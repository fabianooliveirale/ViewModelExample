package com.fabiano.viewmodelexample.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.fabiano.viewmodelexample.R
import com.fabiano.viewmodelexample.`interface`.RequestInterface
import com.fabiano.viewmodelexample.databinding.ActivityLoginBinding
import com.fabiano.viewmodelexample.utils.ViewAnimation
import com.fabiano.viewmodelexample.utils.extensions.initActivity
import com.fabiano.viewmodelexample.utils.extensions.toast
import com.fabiano.viewmodelexample.viewModel.LoginViewModel
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), RequestInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initViewModel()
    }

    override fun onStart() {
        super.onStart()
        initAnimation()
    }

    private fun initViewModel() {
        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.viewModel = viewModel
        viewModel.requestInterface = this
    }

    private fun initAnimation() {
        ViewAnimation.fadeInDown(constraintTitle, 200)
        ViewAnimation.slideInLeft(textInputLayoutLogin, 600)
        ViewAnimation.slideInRight(textInputLayoutPassword, 600)
        ViewAnimation.fadeInUp(btnLogin, 1000)
    }

    override fun success() {
        initActivity(MainActivity())
    }

    override fun error(error: String) {
        toast(error)
    }

    override fun failure(error: String) {
        toast(error)
    }
}
