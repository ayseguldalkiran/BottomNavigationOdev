package com.aysegul.bottomnavigationodev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.carpma_sonuc_fragment.view.*
import kotlinx.android.synthetic.main.toplam_sonuc_fragment.view.*

class CarpmaSonucFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.carpma_sonuc_fragment, container,false)

        val bundle: CarpmaSonucFragmentArgs by navArgs()
        val gelenCarpim = bundle.carpim
        var text = "Çarpma Sonuç: "
        tasarim.carpim.text = text + (gelenCarpim.sayi3.toString().toInt() * gelenCarpim.sayi4.toString().toInt()).toString()

        return tasarim
    }

}