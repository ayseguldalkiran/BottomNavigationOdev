package com.aysegul.bottomnavigationodev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.carpma_fragment.*
import kotlinx.android.synthetic.main.carpma_fragment.view.*
import kotlinx.android.synthetic.main.toplama_fragment.*

class CarpmaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val tasarim = inflater.inflate(R.layout.carpma_fragment, container,false)

        tasarim.buttonCarp.setOnClickListener {
            val carpim = CarpmaSayilar(sayi3.text.toString().toInt(), sayi4.text.toString().toInt())
            val gecis = CarpmaFragmentDirections.actionCarpmaFragmentToCarpmaSonucFragment(carpim)
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim
    }

}