package com.example.lovetest.fragment


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R

//View.OnClickListener 추가하므로 fun onClick 함수 추가
class QuestionFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController
    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        button = view.findViewById(R.id.btn_next2)
        button.setOnClickListener(this)

    }

    //함수 내용을 위 처럼 button.setOnClickListener(this)로 적용 시켜야함, this가 onClick 내용
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_next2 -> {
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }


    }
}