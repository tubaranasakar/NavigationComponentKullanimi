package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.navigationcomponentkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment1 = supportFragmentManager.findFragmentById(R.id.navHostFragment1) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomNavigationView,navHostFragment1.navController)
        /*NavigationUI.setupWithNavController() fonksiyonu, BottomNavigationView ile NavController'ı eşleştirir.
        İlk satır, NavHostFragment'i bulur ve gezinme kontrolcüsünü (NavController) sağlar.
        İkinci satır, BottomNavigationView ile NavController’ı eşleştirerek,
        kullanıcının menüde seçtiği öğeye göre fragment’lar arasında geçiş yapılmasını sağlar
        */

    }
}