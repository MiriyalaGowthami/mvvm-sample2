// LoginModel.kt
package com.example.mvvmsample
data class LoginModel(val email: String, val password: String) {

    fun isValidEmail(): Boolean {
        return email.isNotEmpty() && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun isValidPassword(): Boolean {
        return password.length >= 6
    }

    fun validateCredentials(): Boolean {
        return isValidEmail() && isValidPassword()
    }
}
