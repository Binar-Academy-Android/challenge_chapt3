package com.example.challenge_3.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.challenge3.AbjadData
import com.example.challenge_3.Abjad
import com.example.challenge_3.List_abjad_adapter
import com.example.challenge_3.R
import com.example.challenge_3.databinding.FragmentListKataBinding

class List_kata_Fragment : Fragment() {
    private var _binding: FragmentListKataBinding? = null
    private val binding get() = _binding!!

    private var list: ArrayList<Abjad> = arrayListOf()
    private lateinit var rvItems: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentListKataBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var abjad = arguments?.getString("click_abjad")

        when(abjad){
            "A" -> listA()
            "B" -> listB()
            "C" -> listC()
            "D" -> listD()
            "E" -> listE()
            "F" -> listF()
            "G" -> listG()
            "H" -> listH()
            "I" -> listI()
            "J" -> listJ()
        }
    }
    fun listA(){
        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjadA)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }
    fun listB(){
        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjadB)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }
    fun listC(){
        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjadC)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }
    fun listD(){
        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjadD)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }
    fun listE(){
        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjadE)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }
    fun listF(){
        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjadF)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }
    fun listG(){
        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjadG)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }
    fun listH(){
        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjadH)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }
    fun listI(){
        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjadI)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }
    fun listJ(){
        rvItems = view?.findViewById(R.id.rv_kata)!!
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjadJ)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }

}