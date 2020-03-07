package com.example.android.renters.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

import com.example.android.renters.R

/**
 * A simple [Fragment] subclass.
 * Use the [IngresarDatosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class IngresarDatosFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_ingresar_datos, container, false)
        val boton: Button = vista.findViewById(R.id.enviar_btn)
        boton.setOnClickListener {
            val directions = IngresarDatosFragmentDirections.datosIngresados()
            findNavController().navigate(directions)
        }

        return vista
    }
}
