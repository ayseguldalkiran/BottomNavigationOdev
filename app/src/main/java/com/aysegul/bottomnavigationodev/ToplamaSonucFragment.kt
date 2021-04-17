package com.aysegul.bottomnavigationodev

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.toplam_sonuc_fragment.view.*
import kotlinx.android.synthetic.main.toplama_fragment.*
import kotlinx.android.synthetic.main.toplama_fragment.view.*

class ToplamaSonucFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.toplam_sonuc_fragment, container,false)

        val bundle: ToplamaSonucFragmentArgs by navArgs()
        val gelenToplam = bundle.toplam
        var text = "Toplama Sonuç: "
        tasarim.toplam.text = text + (gelenToplam.sayi1.toString().toInt() + gelenToplam.sayi2.toString().toInt()).toString()

        return tasarim
    }

}