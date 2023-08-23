package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import com.example.lovetest.databinding.FragmentResultBinding


class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController: NavController
    private lateinit var binding : FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?: -1
        binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)

        setReult(option)

        binding.btnHome.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    private fun setReult(option: Int) {
        when(option){
            1 -> {
                binding.tvMain.setText("You are a QUITTER!")
                binding.tvSub.setText("You can let the person easily.")
            }
            2 -> {
                binding.tvMain.setText("You should focus on yoursef")
                binding.tvSub.setText("You become really clingy to your ex.")
            }
            3 -> {
                binding.tvMain.setText("You should take it easy")
                binding.tvSub.setText("You can do crazy things no matter what it takes.")
            }
            4 -> {
                binding.tvMain.setText("You are pretty mature.")
                binding.tvSub.setText("You can easily accept the break-up.")
            }
        }
    }




}