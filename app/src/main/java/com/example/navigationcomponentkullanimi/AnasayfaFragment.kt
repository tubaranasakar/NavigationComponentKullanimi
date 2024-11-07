package com.example.navigationcomponentkullanimi

import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        binding.buttonDetay.setOnClickListener {
            //Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
            //binding.textView.text = "Nasılsın?"
            val urun = Urunler(100,"TV")
            val gecis = AnasayfaFragmentDirections.detayGecis(urun = urun,ad = "Tuba",yas = 23, boy = 1.56f, bekar = true)
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Yaşam döngüsü","OnCreate")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam döngüsü","onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yaşam döngüsü","onResume")
    }


}