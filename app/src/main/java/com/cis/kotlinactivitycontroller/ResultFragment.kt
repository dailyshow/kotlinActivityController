package com.cis.kotlinactivitycontroller


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class ResultFragment : Fragment() {
    var button2: Button? = null
    var textView1 : TextView? = null
    var textView2 : TextView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_result, container, false)
        button2 = view.findViewById(R.id.resultBtn)
        textView1 = view.findViewById(R.id.resultTv1)
        textView2 = view.findViewById(R.id.resultTv2)

        val mainActivity = activity as MainActivity

        textView1?.text = mainActivity.value1
        textView2?.text = mainActivity.value2

        button2?.setOnClickListener { view ->
            mainActivity.supportFragmentManager.popBackStack()
        }

        return view
    }


}
