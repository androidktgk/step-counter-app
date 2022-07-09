package com.govind8061.homeworkouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.govind8061.homeworkouts.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    private var binding:ActivityDashboardBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val stepCounter=MyStepCounter(this)
        stepCounter.countSteps()

        binding?.tvSteps?.text=stepCounter.loadData().toString()
    }

    override fun onResume() {
        super.onResume()

    }


}