package com.example.challenge_3.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.challenge3.AbjadData
import com.example.challenge_3.Abjad
import com.example.challenge_3.List_abjad_adapter
import com.example.challenge_3.R
import com.example.challenge_3.databinding.FragmentListAbjadFragmentBinding

class List_abjad_fragment : Fragment() {
    private var _binding: FragmentListAbjadFragmentBinding? = null
    private val binding get() = _binding!!

    private var list: ArrayList<Abjad> = arrayListOf()
    private lateinit var rvItems: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentListAbjadFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvItems = view.findViewById(R.id.rv_abjad)
        rvItems.setHasFixedSize(true)

        list.addAll(AbjadData.listAbjad)

        rvItems.layoutManager = LinearLayoutManager(context)
        val listAdapter = List_abjad_adapter(list)
        rvItems.adapter = listAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}