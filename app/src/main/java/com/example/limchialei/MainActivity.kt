package com.example.limchialei

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    // Declare variables to store the selected values from Spinners
    private var selectedExamType: String = ""
    private var selectedBMGrade: String = ""
    private var selectedBIGrade: String = ""
    private var selectedMMGrade: String = ""
    private var selectedADDMGrade: String = ""
    private var selectedSJGrade: String = ""
    private var selectedBCGrade: String = ""
    private var selectedPMGrade: String = ""
    private var selectedPHYGrade: String = ""
    private var selectedCHEGrade: String = ""
    private var selectedBIOGrade: String = ""
    private var totalNoA: Int = 0
    private var totalNoB: Int = 0
    private var totalNoC: Int = 0
    private var totalNoD: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val examTypeSpinner = findViewById<Spinner>(R.id.examType)
        val bmGradeSpinner = findViewById<Spinner>(R.id.bmgrade)
        val biGradeSpinner = findViewById<Spinner>(R.id.bigrade)
        val mmGradeSpinner = findViewById<Spinner>(R.id.mmgrade)
        val addmGradeSpinner = findViewById<Spinner>(R.id.addmgrade)
        val sjGradeSpinner = findViewById<Spinner>(R.id.sjgrade)
        val bcGradeSpinner = findViewById<Spinner>(R.id.bcgrade)
        val pmGradeSpinner = findViewById<Spinner>(R.id.pmgrade)
        val phyGradeSpinner = findViewById<Spinner>(R.id.phygrade)
        val cheGradeSpinner = findViewById<Spinner>(R.id.chegrade)
        val bioGradeSpinner = findViewById<Spinner>(R.id.biograde)

        // Create an ArrayAdapter with the grade options as attributes
        val resultType = arrayOf("SPM", "O Level")
        val grades = arrayOf("A","B","C","D")

        val adapterRType = ArrayAdapter(this, android.R.layout.simple_spinner_item, resultType)
        adapterRType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val adapterGrade = ArrayAdapter(this, android.R.layout.simple_spinner_item, grades)
        adapterGrade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Set the adapter for the Spinner
        examTypeSpinner.adapter = adapterRType
        bmGradeSpinner.adapter = adapterGrade
        biGradeSpinner.adapter = adapterGrade
        mmGradeSpinner.adapter = adapterGrade
        addmGradeSpinner.adapter = adapterGrade
        sjGradeSpinner.adapter = adapterGrade
        bcGradeSpinner.adapter = adapterGrade
        pmGradeSpinner.adapter = adapterGrade
        phyGradeSpinner.adapter = adapterGrade
        cheGradeSpinner.adapter = adapterGrade
        bioGradeSpinner.adapter = adapterGrade

        // Add an item selected listener to the examTypeSpinner
        examTypeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected exam type
                selectedExamType = resultType[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })
        bmGradeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected BM grade
                selectedBMGrade = grades[position]
                if (selectedBMGrade == "A") {
                    totalNoA++
                }else if (selectedBMGrade == "B"){
                    totalNoB++
                }else if (selectedBMGrade == "C"){
                    totalNoC++
                }else if (selectedBMGrade == "D")
                    totalNoD++
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })
        biGradeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected BM grade
                selectedBIGrade = grades[position]
                if (selectedBIGrade == "A") {
                    totalNoA++
                }else if (selectedBIGrade == "B"){
                    totalNoB++
                }else if (selectedBIGrade == "C"){
                    totalNoC++
                }else if (selectedBIGrade == "D")
                    totalNoD++
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })
        mmGradeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected BM grade
                selectedMMGrade = grades[position]
                if (selectedMMGrade == "A") {
                    totalNoA++
                }else if (selectedMMGrade == "B"){
                    totalNoB++
                }else if (selectedMMGrade == "C"){
                    totalNoC++
                }else if (selectedMMGrade == "D")
                    totalNoD++
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })
        addmGradeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected BM grade
                selectedADDMGrade = grades[position]
                if (selectedADDMGrade == "A") {
                    totalNoA++
                }else if (selectedADDMGrade == "B"){
                    totalNoB++
                }else if (selectedADDMGrade == "C"){
                    totalNoC++
                }else if (selectedADDMGrade == "D")
                    totalNoD++
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })
        sjGradeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected BM grade
                selectedSJGrade = grades[position]
                if (selectedSJGrade == "A") {
                    totalNoA++
                }else if (selectedSJGrade == "B"){
                    totalNoB++
                }else if (selectedSJGrade == "C"){
                    totalNoC++
                }else if (selectedSJGrade == "D")
                    totalNoD++
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })
        bcGradeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected BM grade
                selectedBCGrade = grades[position]
                if (selectedBCGrade == "A") {
                    totalNoA++
                }else if (selectedBCGrade == "B"){
                    totalNoB++
                }else if (selectedBCGrade == "C"){
                    totalNoC++
                }else if (selectedBCGrade == "D")
                    totalNoD++
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })
        pmGradeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected BM grade
                selectedPMGrade = grades[position]
                if (selectedPMGrade == "A") {
                    totalNoA++
                }else if (selectedPMGrade == "B"){
                    totalNoB++
                }else if (selectedPMGrade == "C"){
                    totalNoC++
                }else if (selectedPMGrade == "D")
                    totalNoD++
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })
        phyGradeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected BM grade
                selectedPHYGrade = grades[position]
                if (selectedPHYGrade == "A") {
                    totalNoA++
                }else if (selectedPHYGrade == "B"){
                    totalNoB++
                }else if (selectedPHYGrade == "C"){
                    totalNoC++
                }else if (selectedPHYGrade == "D")
                    totalNoD++
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })
        cheGradeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected BM grade
                selectedCHEGrade = grades[position]
                if (selectedCHEGrade == "A") {
                    totalNoA++
                }else if (selectedCHEGrade == "B"){
                    totalNoB++
                }else if (selectedCHEGrade == "C"){
                    totalNoC++
                }else if (selectedCHEGrade == "D")
                    totalNoD++
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })
        bioGradeSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Retrieve the selected BM grade
                selectedBIOGrade = grades[position]
                if (selectedBIOGrade == "A") {
                    totalNoA++
                }else if (selectedBIOGrade == "B"){
                    totalNoB++
                }else if (selectedBIOGrade == "C"){
                    totalNoC++
                }else if (selectedBIOGrade == "D")
                    totalNoD++
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected if needed
            }
        })

        val submitButton = findViewById<Button>(R.id.submitbtn)
        submitButton.setOnClickListener {

            // Call the function to check entry requirements and get the eligibility message
            val eligibilityMessage = checkEntryRequirements()

            // Create an Intent to start the ResultActivity
            val intent = Intent(this, ResultActivity::class.java)

            // Pass the eligibility message as an extra with the intent
            intent.putExtra("eligibility_message", eligibilityMessage)

            // Start the ResultActivity
            startActivity(intent)
        }
    }

    // Define a function to check entry requirements and determine program eligibility
    private fun checkEntryRequirements(): String {
        // Define the entry requirements
        val minRelevantCScore = 5

        // Check if the selected grades meet the foundation program requirements
        val meetsFoundation = (
                totalNoC >= minRelevantCScore &&
                        selectedBMGrade == "A" || selectedBMGrade == "B" || selectedBMGrade == "C"&&
                        selectedBIGrade == "A" || selectedBIGrade == "B" || selectedBIGrade == "C" &&
                        selectedMMGrade == "A" || selectedMMGrade == "B"
                )

        // Check if the selected grades meet the diploma program requirements
        val meetsDiploma = (
                (totalNoC <5) && (totalNoA >= 3 || totalNoB >= 3 )
                )


        // Determine the program eligibility
        // Declare the finalResult variable
        var finalResult = ""

        val programEligibility = when {
            meetsFoundation -> {
                finalResult = "Congratulation! You are eligible for the foundation programme."
                finalResult
            }
            !meetsFoundation && meetsDiploma -> {
                finalResult = "Congratulation! You are eligible for the diploma programme."
                finalResult
            }
            else -> {
                finalResult = "Sorry, You do not meet the programme entry requirements."
                finalResult
            }
        }
        return programEligibility
    }
}