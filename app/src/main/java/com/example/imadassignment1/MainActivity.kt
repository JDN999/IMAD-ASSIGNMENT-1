package com.example.imadassignment1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var ageEditText: EditText
    private lateinit var resultTextView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ageEditText = findViewById(R.id.ageEditText)
        resultTextView = findViewById(R.id.resultTextView)
        val submitButton: Button = findViewById(R.id.submitButton)
        val clearButton: Button = findViewById(R.id.clearButton)

        submitButton.setOnClickListener {
            val ageText = ageEditText.text.toString().trim()
            if (ageText.isNotEmpty()) {
                val age = ageText.toIntOrNull()
                if (age != null && age in 20..100) { // Check if age is within valid range
                    val matchedPerson = findHistoricalPerson(age)
                    resultTextView.text = matchedPerson
                } else {
                    resultTextView.text = "Age is out of range (20-100)"
                }
            } else {
                resultTextView.text = "Please enter a valid age"
            }
        }

        clearButton.setOnClickListener {
            ageEditText.text.clear()
            resultTextView.text = ""
        }
    }

    private fun findHistoricalPerson(age: Int): String {

        val historicalPeople = mapOf(
            16 to "Anne Frank",
            17 to "Ritchie Valens",
            18 to "Tutankhamun",
            19 to "Joan of Arc",
            20 to "Agatha of Sicily",
            21 to "Pocahontas",
            22 to "Black Dahlia",
            23 to "Charles IX of France",
            24 to "King Baldwin IV",
            25 to "John Keats",
            26 to "Sharon Tate",
            27 to "Kurt Cobain",
            28 to "Caligula",
            29 to "Hank Williams",
            30 to "Nero",
            31 to "Commodus",
            32 to "Alexander the Great",
            33 to "Andres Bonifacio",
            34 to "Yuri Gagarin",
            35 to "Wolfgang Amadeus Mozart",
            36 to "Princess Diana",
            37 to "Vincent van Gogh",
            38 to "Charlotte Bronte",
            39 to "Cleopatra",
            40 to "John Lennon",
            41 to "Amelia Earhart",
            42 to "Elvis Presley",
            43 to "Johannes Vermeer",
            44 to "F. Scott Fitzgerald",
            45 to "Vlad the Impaler",
            46 to "John F. Kennedy",
            47 to "Alexander Hamilton",
            48 to "Whitney Houston",
            49 to "Saint Joseph",
            50 to "Michael Jackson",
            51 to "Napoleon Bonaparte",
            52 to "William Shakespeare",
            53 to "Vladimir Lenin",
            54 to "Christopher Columbus",
            55 to "Julius Caesar",
            56 to "Abraham Lincoln",
            57 to "Mansa Musa",
            58 to "Charles Dickens",
            59 to "William the Conqueror",
            60 to "Theodore Roosevelt",
            61 to "Benito Mussolini",
            62 to "Martin Luther",
            63 to "Franklin D Roosevelt",
            64 to "Jackie Kennedy",
            65 to "Genghis Khan",
            66 to "Marie Curie",
            67 to "Leonardo da Vinci",
            68 to "Osman I",
            69 to "Elizabeth I of England",
            70 to "Marco Polo",
            71 to "Sir Arthur Conan Doyle",
            72 to "Confucius",
            73 to "Charles Darwin",
            74 to "Josef Stalin",
            75 to "Alexander Graham Bell",
            76 to "Albert Einstein",
            78 to "Mahatma Gandhi",
            79 to "George Washington Carver",
            80 to "Marlon Brando",
            81 to "Queen Victoria",
            82 to "Neil Armstrong",
            83 to "Thomas Jefferson",
            84 to "Isaac Newton",
            85 to "Agatha Christie",
            86 to "Nikola Tesla",
            87 to "Helen Keller",
            88 to "Charlie Chaplin",
            89 to "James Stewart",
            90 to "Winston Churchill",
            91 to "Pablo Picasso",
            92 to "Rosa Parks",
            93 to "Ronald Reagan",
            94 to "Nancy Reagan",
            95 to "Nelson Mandela",

        )

        return historicalPeople[age] ?: "No match found"
    }
}