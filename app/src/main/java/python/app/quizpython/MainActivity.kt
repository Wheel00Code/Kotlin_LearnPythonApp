package python.app.quizpython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        btn_start.setOnClickListener{

            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this,
                    "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
            val intent = Intent(this, ChoseLevel::class.java)
                intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent)
                finish()

                val intent1 = Intent(this, QuizQuestions::class.java)
                intent1.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent)
                finish()
                val intent2 = Intent(this, ResultActivity::class.java)
                intent2.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent)
                finish()
        }
        }
    }
}