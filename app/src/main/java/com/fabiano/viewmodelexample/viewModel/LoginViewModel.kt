package com.fabiano.viewmodelexample.viewModel

import android.view.View
import androidx.lifecycle.ViewModel
import com.fabiano.viewmodelexample.`interface`.RequestInterface
import com.fabiano.viewmodelexample.model.form.AuthForm
import com.fabiano.viewmodelexample.repository.LoginService
import com.fabiano.viewmodelexample.utils.CallBack

class LoginViewModel : ViewModel() {
    var authForm: AuthForm = AuthForm()
    var requestInterface: RequestInterface? = null

    fun loginClick(view: View) {
        if (authForm.login.isNullOrEmpty() || authForm.password.isNullOrEmpty()) {
            requestInterface?.error("Login or Password is empty")
            return
        }

        LoginService().requestLogin(authForm) { callBack ->
            when (callBack) {
                CallBack.SUCCESS -> requestInterface?.success()
                CallBack.ERROR -> requestInterface?.error("error callBack")
                CallBack.FAILURE -> requestInterface?.failure("problema de conexão")
            }
        }
    }
}