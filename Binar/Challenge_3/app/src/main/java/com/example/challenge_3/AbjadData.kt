package com.example.challenge3

import com.example.challenge_3.Abjad

object AbjadData{
    private val itemAbjads = arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I" )

    val listAbjad: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in itemAbjads.indices) {
                val item = Abjad()
                item.huruf = itemAbjads[position]
                list.add(item)
            }
            return list
        }


    private val listA = arrayOf("associate", "adventure", "architect", "ambitious", "accompany", "ambulance",)
    val listAbjadA: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listA.indices) {
                val item = Abjad()
                item.huruf = listA[position]
                list.add(item)
            }
            return list
        }
    private val listB = arrayOf("banana", "banner", "begin")
    val listAbjadB: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listB.indices) {
                val item = Abjad()
                item.huruf = listB[position]
                list.add(item)
            }
            return list
        }
    private val listC = arrayOf("characteristic","constitutional","c lassification")
    val listAbjadC: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listC.indices) {
                val item = Abjad()
                item.huruf = listC[position]
                list.add(item)
            }
            return list
        }
    private val listD = arrayOf("discrimination", "d isappointment", "discriminatory")
    val listAbjadD: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listD.indices) {
                val item = Abjad()
                item.huruf = listD[position]
                list.add(item)
            }
            return list
        }
    private val listE = arrayOf("egg", "end", "enter")
    val listAbjadE: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listE.indices) {
                val item = Abjad()
                item.huruf = listE[position]
                list.add(item)
            }
            return list
        }
    private val listF = arrayOf("Farmer", "Father", "Falcon")
    val listAbjadF: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listF.indices) {
                val item = Abjad()
                item.huruf = listF[position]
                list.add(item)
            }
            return list
        }
    private val listG = arrayOf("gajah", "geologi", "geomatika")
    val listAbjadG: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listG.indices) {
                val item = Abjad()
                item.huruf = listG[position]
                list.add(item)
            }
            return list
        }
    private val listH = arrayOf("hadiah","hari", "hewan")
    val listAbjadH: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listH.indices) {
                val item = Abjad()
                item.huruf = listH[position]
                list.add(item)
            }
            return list
        }
    private val listI = arrayOf("indonesia", "ikan", "iguana")
    val listAbjadI: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listI.indices) {
                val item = Abjad()
                item.huruf = listI[position]
                list.add(item)
            }
            return list
        }
    private val listJ = arrayOf("jerapah", "jawaban", "jember")
    val listAbjadJ: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listJ.indices) {
                val item = Abjad()
                item.huruf = listJ[position]
                list.add(item)
            }
            return list
        }
}