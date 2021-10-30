package python.app.quizpython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about_me.*
import kotlinx.android.synthetic.main.activity_result.*

class AboutMe : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)


        tornar.setOnClickListener{
            val intent = Intent(this, TornaEscollir::class.java)
            startActivity(intent)
            finish()
        }




        


    }
}