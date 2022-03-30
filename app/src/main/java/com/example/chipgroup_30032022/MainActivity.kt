package com.example.chipgroup_30032022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chipgroup_30032022.databinding.ActivityMainBinding
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupChipGroup()

    }
    private fun setupChipGroup() {
        binding.chip1.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast
                .makeText(this, "Removed 1st Chip", Toast.LENGTH_SHORT)
                .show()
        }

        binding.chip2.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast
                .makeText(this, "Removed 2nd Chip", Toast.LENGTH_SHORT)
                .show()
        }
        binding.chip3.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast
                .makeText(this, "Removed 3rd Chip", Toast.LENGTH_SHORT)
                .show()
        }
        binding.chip4.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast
                .makeText(this, "Removed 4th Chip", Toast.LENGTH_SHORT)
                .show()
        }
    }

}