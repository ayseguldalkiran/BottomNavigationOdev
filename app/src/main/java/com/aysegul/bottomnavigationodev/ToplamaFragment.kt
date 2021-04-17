package com.aysegul.bottomnavigationodev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.aysegul.bottomnavigationodev.databinding.ToplamaFragmentBinding
import kotlinx.android.synthetic.main.toplam_sonuc_fragment.view.*
import kotlinx.android.synthetic.main.toplama_fragment.*
import kotlinx.android.synthetic.main.toplama_fragment.view.*

class ToplamaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.toplama_fragment, container,false)

        tasarim.buttonTopla.setOnClickListener {
            val toplam = ToplamaSayilar(sayi1.text.toString().toInt(), sayi2.text.toString().toInt())
            val gecis = ToplamaFragmentDirections.actionToplamaFragmentToToplamaSonucFragment(toplam)
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim
    }

}