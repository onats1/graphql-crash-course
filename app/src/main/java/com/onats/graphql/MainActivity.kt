package com.onats.graphql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleScope.launchWhenResumed {
            val response = apolloClient.query(LaunchListQuery()).execute()

            Log.d("LaunchList", "Success ${response.data}")
        }
    }
}