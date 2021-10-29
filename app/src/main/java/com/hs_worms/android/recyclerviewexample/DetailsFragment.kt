package com.hs_worms.android.recyclerviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val ELEMENT_NR = "element_nr"

class DetailsFragment : Fragment() {

    private lateinit var textView: TextView

    private var elementNr = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments != null)
            elementNr = arguments?.getSerializable(ELEMENT_NR) as Int
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_2, container, false)

        textView = view.findViewById(R.id.textView)
        updateText()

        return view
    }

    private fun updateText() {
        textView.text = "The following element has been selected: " + elementNr.toString()
    }

    fun update (elementNr: Int) {
        this.elementNr = elementNr
        updateText()
    }

    companion object {
        fun newInstance(elementNr: Int): DetailsFragment {
            val args = Bundle().apply {
                putSerializable(ELEMENT_NR, elementNr)
            }
            return DetailsFragment().apply {
                arguments = args
            }
        }
    }

}
