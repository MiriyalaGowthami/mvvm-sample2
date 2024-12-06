// LoginActivity.kt
package com.example.mvvmsample
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmsample.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        binding.viewModel=loginViewModel
        setContentView(binding.root)

        // Observe login result
//        loginViewModel.loginResult.observe(this, Observer { result ->
//            binding.tvLoginResult.text = result
//        })

        // Handle login button click
//        binding.btnLogin.setOnClickListener {
//            val email = binding.etEmail.text.toString()
//            val password = binding.etPassword.text.toString()
//            Log.d("onloginclicked","method called")
//            loginViewModel.onLoginClicked()
//
//        }
    }
}
