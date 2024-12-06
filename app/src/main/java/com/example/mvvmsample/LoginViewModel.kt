// LoginViewModel.kt
package com.example.mvvmsample
import android.util.Log

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class LoginViewModel : ViewModel() {

    // Observable fields for email and password that can be directly bound to the UI
    val email = MutableLiveData<String>("")
    val password = MutableLiveData<String>("")
    val result=MutableLiveData<String>("")

    private val _loginResult = MutableLiveData<String>()
    val loginResult: LiveData<String> get() = _loginResult

    fun onLoginClicked() {

        val emailValue = email.value ?: ""
        val passwordValue = password.value ?: ""
        Log.d("onlogin clicked","$emailValue $passwordValue")


        val loginModel = LoginModel(emailValue, passwordValue)
        if (loginModel.validateCredentials()) {
            _loginResult.value = "Login successful!"
            result.value="Login successful!"

        } else {
            _loginResult.value = "Invalid email or password"
            result.value="Invalid email or password"
        }
    }
}
