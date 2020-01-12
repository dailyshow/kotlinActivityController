package com.cis.kotlinactivitycontroller


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

/**
 * A simple [Fragment] subclass.
 */
class InputFragment : Fragment() {
    var button: Button? = null
    var edit1: EditText? = null
    var edit2: EditText? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_input, container, false)
        button = view.findViewById(R.id.inputBtn)
        edit1 = view.findViewById(R.id.inputEt1)
        edit2 = view.findViewById(R.id.inputEt2)

        button?.setOnClickListener { view ->
            val mainActivity = activity as MainActivity

            mainActivity.value1 = edit1?.text.toString()
            mainActivity.value2 = edit2?.text.toString()

            edit1?.editableText?.clear()
            edit2?.editableText?.clear()

            mainActivity.setFragment("result")
        }

        return view
    }


}
