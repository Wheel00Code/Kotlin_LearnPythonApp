package python.app.quizpython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chose_level.*
import kotlinx.android.synthetic.main.activity_chose_level.lv_one
import kotlinx.android.synthetic.main.activity_chose_level.lv_three
import kotlinx.android.synthetic.main.activity_chose_level.lv_two
import kotlinx.android.synthetic.main.activity_torna_escollir.*

class TornaEscollir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_torna_escollir)
        lv_one.text = "NIVELL EASY"
        lv_two.text = "NIVELL MEDIUM"
        lv_three.text = "NIVELL HARD"





        lv_one.setOnClickListener{


            val intent = Intent(this, QuizQuestions::class.java)

            startActivity(intent)
            finish()

        }

        lv_two.setOnClickListener{


            val intent = Intent(this, QQ2::class.java)

            startActivity(intent)
            finish()

        }
        lv_three.setOnClickListener{


            val intent = Intent(this, textActivity::class.java)
            startActivity(intent)
            finish()

        }

        sobre_mee.setOnClickListener{


            val intent = Intent(this, AboutMe::class.java)
            startActivity(intent)
            finish()

        }



    }


}