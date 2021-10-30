package python.app.quizpython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_chose_level.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class ChoseLevel : AppCompatActivity() {

    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_level)

        mUserName = intent.getStringExtra(Constants.USER_NAME)



        wc_name.text = "Welcome " + mUserName
        lv_one.text = "NIVELL EASY"
        lv_two.text = "NIVELL MEDIUM"
        lv_three.text = "NIVELL HARD"





        lv_one.setOnClickListener{


                val intent = Intent(this, QuizQuestions::class.java)
                intent.putExtra("Nom",mUserName)
                startActivity(intent)
                finish()

        }

        lv_two.setOnClickListener{


            val intent = Intent(this, QQ2::class.java)
            intent.putExtra("Nomj2",mUserName)
            startActivity(intent)
            finish()

        }
        lv_three.setOnClickListener{


            val intent = Intent(this, textActivity::class.java)
            startActivity(intent)
            finish()

        }

        abt_me.setOnClickListener{


            val intent = Intent(this, AboutMe::class.java)
            startActivity(intent)
            finish()

        }




    }
}
