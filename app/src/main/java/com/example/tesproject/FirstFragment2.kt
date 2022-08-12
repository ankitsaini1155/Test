package com.example.tesproject

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tesproject.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment2 : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("ACTIVITY","FirstFragment2  onCreateView")
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("ACTIVITY","FirstFragment2  onViewCreated")
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("ACTIVITY","FirstFragment2  onDestroyView")
        _binding = null
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("ACTIVITY","FirstFragment2  onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("ACTIVITY","FirstFragment2  onCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("ACTIVITY","FirstFragment2  onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("ACTIVITY","FirstFragment2  onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("ACTIVITY","FirstFragment2  onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ACTIVITY","FirstFragment2  onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ACTIVITY","FirstFragment2  onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ACTIVITY","FirstFragment2  onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("ACTIVITY","FirstFragment2  onDetach")
    }



}