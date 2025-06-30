package com.example.fragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class ArticleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_article, container, false)

        val ratingBar = view.findViewById<RatingBar>(R.id.ratingBar)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)
        val rateButton = view.findViewById<Button>(R.id.rateButton)

        rateButton.setOnClickListener {
            val rating = ratingBar.rating
            val selected = radioGroup.checkedRadioButtonId
            val message = if (selected != -1) {
                val response = view.findViewById<RadioButton>(selected).text
                "Rated $rating stars. Response: $response"
            } else {
                "Rated $rating stars."
            }
            Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
