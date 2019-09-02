package com.example.lab6_603021049_9


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_three.view.*

/**
 * A simple [Fragment] subclass.
 */
class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_three, container, false)
        view.btnClickFragThree.setOnClickListener(){
            val toast = Toast.makeText(context, "Click on Fragment three", Toast.LENGTH_SHORT)
            toast.show()
        }
        return view
    }


}
