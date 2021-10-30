package python.app.quizpython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
//import kotlinx.android.synthetic.main.activity_result.Next
import kotlinx.android.synthetic.main.activity_result.back
import kotlinx.android.synthetic.main.activity_result.nota
import kotlinx.android.synthetic.main.activity_result.tv_name
import kotlinx.android.synthetic.main.activity_result.tv_score
import kotlinx.android.synthetic.main.activity_resultatqq2.*

class Resultatqq2 : AppCompatActivity() {

    private var Nomej2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultatqq2)


        Nomej2 = getIntent().getStringExtra("Namej2");


        back.setOnClickListener{
            val intent = Intent(this, TornaEscollir::class.java)
            startActivity(intent)
            finish()
        }
        Next.setOnClickListener{
            val intent = Intent(this, textActivity::class.java)
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