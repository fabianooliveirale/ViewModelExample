package com.fabiano.viewmodelexample.repository

import com.fabiano.viewmodelexample.model.form.AuthForm
import com.fabiano.viewmodelexample.utils.CallBack

class LoginService {
    fun requestLogin(authForm: AuthForm, callBack: (CallBack) -> (Unit)) {
        if (authForm.login == "login" && authForm.password == "123") {
            callBack(CallBack.SUCCESS)
            return
        }


        if (authForm.login == "1" && authForm.password == "1") {
            callBack(CallBack.FAILURE)
            return
        }


        callBack(CallBack.ERROR)
    }
}