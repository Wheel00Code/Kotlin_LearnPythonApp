package python.app.quizpython

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QQ2 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuesrionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers: Int = 0
    private var nomj2: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        nomj2 = getIntent().getStringExtra("Nomj2");

        mQuesrionList = Constants.getQuestions2()

        setQuestion()

        tv_opition_one.setOnClickListener(this)
        tv_opition_two.setOnClickListener(this)
        tv_opition_three.setOnClickListener(this)
        tv_opition_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)

    }

    private fun setQuestion(){


        val question = mQuesrionList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuesrionList!!.size){
            btn_submit.text = "FINISH"
        }else{
            btn_submit.text= "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition"+ "/" + progressBar.max

        tv_question.text = question!!.question
        tv_opition_one.text = question.optionOne
        tv_opition_two.text = question.optionTwo
        tv_opition_three.text = question.optionThree
        tv_opition_four.text = question.optionFour

    }

    private fun defaultOptionsView(){

        val options = ArrayList<TextView>()
        options.add(0, tv_opition_one)
        options.add(1, tv_opition_two)
        options.add(2, tv_opition_three)
        options.add(3, tv_opition_four)

        for(option in options){

            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_opition_one -> {
                selectedOptionView(tv_opition_one,  1)
            }
            R.id.tv_opition_two -> {
                selectedOptionView(tv_opition_two,  2)
            }
            R.id.tv_opition_three -> {
                selectedOptionView(tv_opition_three,  3)
            }
            R.id.tv_opition_four -> {
                selectedOptionView(tv_opition_four,  4)
            }

            R.id.btn_submit -> {
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition ++

                    when{
                        mCurrentPosition <= mQuesrionList!!.size -> {
                            setQuestion()
                        }else -> {
                        val intent = Intent(this, Resultatqq2::class.java)
                        intent.putExtra("Namej2", nomj2)
                        intent.putExtra(Constants.CORRECT_ANSWERS2,mCorrectAnswers)
                        intent.putExtra(Constants.TOTAL_QUESTIONS2, mQuesrionList!!.size)
                        startActivity(intent)
                    }
                    }
                }else {
                    val question = mQuesrionList?.get(mCurrentPosition-1)
                    if (question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
                    }else {
                        mCorrectAnswers ++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuesrionList!!.size) {
                        btn_submit.text = "FINISH"
                    }else{
                        btn_submit.text= "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }

            }


        }

    }

    private  fun answerView(answer: Int, drawableView: Int){
        when (answer){
            1 -> {
                tv_opition_one.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 -> {
                tv_opition_two.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3 -> {
                tv_opition_three.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            4 -> {
                tv_opition_four.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
        }

    }

    private  fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum


        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )

    }
}