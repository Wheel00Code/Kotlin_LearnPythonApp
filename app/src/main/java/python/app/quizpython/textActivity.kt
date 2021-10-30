package python.app.quizpython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_chose_level.*
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import kotlinx.android.synthetic.main.activity_quiz_questions.progressBar
import kotlinx.android.synthetic.main.activity_quiz_questions.tv_progress
import kotlinx.android.synthetic.main.activity_quiz_questions.tv_question
import kotlinx.android.synthetic.main.activity_text.*

class textActivity : AppCompatActivity() {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<txtQuestion>? = null
    private var mSeleectedOptionPosition: Int = 0
    lateinit var resp: EditText;
    lateinit var btn_sub: Button;
    var resp1 = "varListname.append('newvar')"
    val respostes = arrayListOf<String>( "df[-1:]", "10", "df['Price'].mean()", "print(name.upper())", "df[df[\"Price\"]>20]", "28","employers[2]","4", "You Are Too Young", "Seat")
    val preguntes = arrayListOf<String>("1. Print the last row of the dataframe (\"df\"): ", "2. Write the value of i : \n i = 0 \n while i < 10: \n i += 1", "3. Calculate the average of the column Price of the dataframe (\"df\") ", "4.Print  the variable 'name' in capital letters:","5. Show the rows of the dataframe (\"df\") how's price (column Price ) was bigger than 20. ","6. Write the correct answer of this operation:\n a = 5 / b = 3\n a= (a**2) + b", "7. Write the code to get 'Zoe' as the output: \n employers = ['Angelina','Andrew', 'Zoe','Jordan'] ", "8. Write what this code will show: \n cars = ['BMW','Audi','Toyota','Seat'] \nlen(cars)", "9. (Age = 12)\n if Age < 16:\n print(\"You Are Too Young \") \n What we will see in the screen?","10. Write the output of this code: \n company = 'seat' \n print(company.title()) "                                                                                                                 )
    var i = 0;
    var correct = 0;
    var incorrect = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)





        resp = findViewById(R.id.resp) as EditText
        btn_sub = findViewById(R.id.btn_submit) as Button
        tv_question.text= preguntes[0]
        progressBara.progress = 0
        tv_progressa.text = "0/10"


        btn_sub.setOnClickListener {

            val resposta = resp.text.toString()

            if (resposta == respostes[i]) {

                showan.text = "Nice!"
                correct += 1
            } else {

                showan.text = "The correct answer was: \n" +  respostes[i]
                incorrect += 1
            }
            i += 1

            btn_sub.setVisibility(View.INVISIBLE)
            next_quest.setVisibility(View.VISIBLE)
        }

        next_quest.setOnClickListener {

            if (i == 10) {

               next_quest.text = "FINISH"

                val intent = Intent(this, Result_txt::class.java)

                intent.putExtra(Constants.Resp_correct,correct)

                startActivity(intent)





            } else {
                resp.hint = ""
                resp.setText("");
                showan.text = ""

                tv_question.text = preguntes[i]
                btn_sub.setVisibility(View.VISIBLE)
                next_quest.setVisibility(View.INVISIBLE)

                progressBara.progress = i
                tv_progressa.text = "$i" + "/10"
            }



        }
    }
}





       // setQuestion()
    //}

  //  private fun setQuestion(){
      //  mCurrentPosition = 1
      //  val question=  mQuestionList!![mCurrentPosition -1 ]
       // default()


      //  progressBar.progress = mCurrentPosition
     //   tv_progress.text = "$mCurrentPosition"+ "/" + progressBar.max

    //    tv_question.text = question!!.question

    //}

    //private fun default(){
        //resp.text.toString() = ""

    //}
//}