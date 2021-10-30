package python.app.quizpython

data class Question (
    val id: Int,
    val question: String,
    //val image: Int,
    val  optionOne: String,
    val  optionTwo: String,
    val  optionThree: String,
    val  optionFour: String,
    val correctAnswer: Int
)
data class txtQuestion (
    val id: Int,
    val question: String,
    val correctAnswer: String

)
