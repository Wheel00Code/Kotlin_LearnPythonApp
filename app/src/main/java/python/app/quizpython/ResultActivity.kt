package python.app.quizpython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chose_level.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    private var Nomee: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

         Nomee = getIntent().getStringExtra("Name");


        back.setOnClickListener{
            val intent = Intent(this, TornaEscollir::class.java)
            startActivity(intent)
            finish()
        }
        Neext.setOnClickListener{
            val intent = Intent(this, QQ2::class.java)
            startActivity(intent)
            finish()
        }






        tv_name.text = "Thank you so much for practicing on my app, I hope you had learn "
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        nota.text = correctAnswers.toString()

       if(correctAnswers>5){
           tv_score.text = "NICE WORK !!"
       }else{
           tv_score.text =  "Keep practicing !!"
       }

    }
}