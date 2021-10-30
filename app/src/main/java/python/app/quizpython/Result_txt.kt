package python.app.quizpython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_result.back
import kotlinx.android.synthetic.main.activity_result.nota
import kotlinx.android.synthetic.main.activity_result.tv_name
import kotlinx.android.synthetic.main.activity_result.tv_score
import kotlinx.android.synthetic.main.activity_result_txt.*

class Result_txt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_txt)



        back.setOnClickListener{
            val intent = Intent(this, TornaEscollir::class.java)
            startActivity(intent)
            finish()
        }

        aboutme.setOnClickListener{
            val intent = Intent(this, AboutMe::class.java)
            startActivity(intent)
            finish()
        }








        tv_name.text = "Thank you so much for practicing on my app, I hope you had learn"

        val intent = getIntent()

        val correctAnswers = intent.getIntExtra(Constants.Resp_correct,0)




        nota.text = correctAnswers.toString()


        if(correctAnswers>5){
            tv_score.text = "NICE WORK !!"
        }else{
            tv_score.text =  "Keep practicing !!"
        }
    }
}