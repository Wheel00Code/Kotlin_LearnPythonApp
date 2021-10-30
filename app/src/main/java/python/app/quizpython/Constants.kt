package python.app.quizpython

object Constants{

    const val  USER_NAME: String = "user_name"

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val  CORRECT_ANSWERS: String = "correct_answers"

    const val TOTAL_QUESTIONS2: String = "total_questions"
    const val  CORRECT_ANSWERS2: String = "correct_answers"


    const val  Resp_correct: String = "correct_answers"




    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        //Question 1
        val que1 = Question(1,
            "Which of the next answers will add Bob to the list ? ",
            "Customers.append('Bob') ",
            "Customers.add('Bob') ",
            "Customers = ('Bob') ",
            "Customers.append(Bob) ",
            1)
        questionsList.add(que1)

        //Question 2
        val que2 = Question(2,
            "Which answers will print trek in the screen? \n bicycles = ['city','trek', 'redline'] ",
            "print(bicycles(1))",
            "print(bicycles[2])",
            "print(bicycles[1])",
            "print(second.bicycles)",
            3)
        questionsList.add(que2)

        //Question 3
        val que3 = Question(3,
            "current_n = 1\n" +
                    "while current_n <=5: \n" +
                    "    print(current_n) \n" +
                    "    current_n += 1   \n Select what we will see in the screen ",
            "1,2,3,4,5,6",
            "1,2,3,4,5",
            "0,1,2,3,4,5",
            "15",
            2)
        questionsList.add(que3)

        //Question 4
        val que4 = Question(4,
            " Which option will add 'BMW' between  Honda and Ducati \n motorcycles = ['Honda','Ducati', 'Yamaha']",
            "motorcycles[0] = 'BMW'",
            "motorcycles.add[0] = 'BMX'",
            "motorcycles.insert(1, 'BMX')",
            "motorcycles.insert('BMX', 1)",
            3)
        questionsList.add(que4)

        //Question 5
        val que5 = Question(5,
            "Select the correct answer of this operation:  ( a = 8 / b = 2 )\n b = a / b , a = a * (2*b)",
            "a = 16, b  = 4",
            "a = 24 , b = 4",
            "a = 8, b = 2",
            "a = 64 b = 4 ",
            4)
        questionsList.add(que5)

        //Question 6
        val que6 = Question(6,
            "What will show this code? \n Age = 21 \n message = \" Happy \" + Age + \" rd Birthday\" \n print(message)",
            "TypeError",
            "Happy Age rd Birthday",
            "SyntaxError",
            "Happy 21 rd Birthday",
            1)
        questionsList.add(que6)

        //Question 7
        val que7 = Question(7,
            "Which is the output of this code?\n name = \"maggie\" \n print(name.title())",
            "MAGGIE",
            "Maggie",
            "maggie",
            "Name",
            2)
        questionsList.add(que7)

        //Question 8
        val que8 = Question(8,
            ">>>grade = 7\n" +
                    ">>>if grade > 5:\n" +
                    "...     print(\"Well done !\")  \n What we will see in the screen?",
            "Nothing",
            "Well done !",
            "7",
            "True",
            2)
        questionsList.add(que8)

        //Question 9
        val que9 = Question(9,
            "Select the correct output of this operations:  ( a = 5 / b = 3 ) \n  a = a + b , a = a * b",
            "a = 5",
            "a = 8",
            "a = 15",
            "a = 24",
            4)
        questionsList.add(que9)

        //Question 10
        val que10 = Question(10,
            "Which line of code remove all the 'pizza' from the list 'menu' ? ",
            "while 'pizza' in menu:\n      menu.remove('pizza')",
            "menu.remove('pizza')",
            "menu.remove.all('pizza')",
            "while menu in 'pizza':\n" +
                    "      menu.remove('pizza')",
            1)
        questionsList.add(que10)



        return questionsList

    }


    fun getQuestions2(): ArrayList<Question> {
        val questionsList2 = ArrayList<Question>()

        //Question 1
        val que1 = Question(
            1,
            "Select the correct answer of this operation:  ( a = 12 / b = 3 )\n "  +
                    "a = a - b ," +
                    " a = a - (2*b)\n",
            "a = 12 ",
            "a = 4 ",
            "a = 3 ",
            "Not one is correct",
            3
        )
        questionsList2.add(que1)

        //Question 2
        val que2 = Question(2,
            "How to delete Yamaha of the this list: \n motorcycles = ['Honda','Ducati', 'Yamaha']",
            "delete motorcycle[2]",
            "del motorcycles[3]",
            "motorcycles[2] = ' ' ",
            "del motorcycles[2]",
            4)
        questionsList2.add(que2)

        //Question 3
        val que3 = Question(3,
            "Remove 'John Smith' of the list Students: ",
            "remove Students('John Smith')",
            "del Students = 'John Smith'",
            "Students.remove('John Smith')",
            "del Students[John Smith]",
            3)
        questionsList2.add(que3)

        //Question 4
        val que4 = Question(4,

            ">>>current_n = 0\n" +
                    ">>>while current_n <=10:\n" +
                    "...     print(current_n)\n" +
                    "...     current_n += 2 \n" + "Select the correct output:\"",
            "0, 2, 4, 6, 8, 10",
            "2, 4, 6, 8, 10, 12",
            "Error",
            "2, 4, 8, 16",
            1)
        questionsList2.add(que4)

        //Question 5
        val que5 = Question(5,
            "Get the name of the last customer of the list Customers",
            "print(Customers[-1])",
            "print(Customers[last])",
            "print(Customers[len])",
            "print(len.Customers())",
            1)
        questionsList2.add(que5)

        //Question 6
        val que6 = Question(6,
            "How to calculate the square of 5",
            "5*2",
            "5^2",
            "5**2",
            "5**5",
            3)
        questionsList2.add(que6)

        //Question 7
        val que7 = Question(7,
            "Select the correct answer of this operation:  ( a = 10 i = 0)  \n" +
                    " while a < 100: \n a += 10  \n i += 1",
            "i = 9",
            "i = 100",
            "i = 110",
            "i = 10",
            1)
        questionsList2.add(que7)

        //Question 8
        val que8 = Question(8,
            "What will show this code? \n >>>squares = [ ] \n >>>for value in range (1,11): \n...    square = value**2 \n...   squares.append(square) ",
            "One array with the square of the first 11 numbers",
            "One array with 11  squares of the last number",
            "One array with the square of the first 10 numbers",
            "One array with 10  squares of the last number",
            3)
        questionsList2.add(que8)

        //Question 9
        val que9 = Question(9,
            "Age = 20\n if Age < 16:\n print(\"You Are Too Young \") \n What we will see in the screen?",
            "True",
            "You Are Too Young",
            "Nothing",
            "Error",
            3)
        questionsList2.add(que9)

        //Question 10
        val que10 = Question(10,
            "We have the 'Menu' list with all the plates. What will show this operation: " + "for plate in Menu: \n" + "    print(plate) \n",
            "All the plates in the array Menu",
            "SyntaxError ",
            "Menu Array",
            "The number of the plates in Menu",
            1)
        questionsList2.add(que10)

        return questionsList2
    }





    fun getQuestions3(): ArrayList<txtQuestion> {
        val questionsList3 = ArrayList<txtQuestion>()

        //Question 1
        val que1 = txtQuestion(
            1,
            "Para introducir una variable en un ARRAY qual de las respuestas es correcta? 1.3",
            "var1"
        )
        questionsList3.add(que1)

        //Question 2
        val que2 = txtQuestion(2,
            "Para salir treak por pantalla cual és la respuesra correcta ? (\"bicycles = ['city','treak', redline']) 2 ",
            "bicycles = ['city','treak', redline']print(bicycles(1))")

        questionsList3.add(que2)

        //Question 3
        val que3 = txtQuestion(3,
            "Para escribir en pantalla todas las variables de un ARRAY, cual és la respuesta correcta?  3 ",
            "Argentina")
        questionsList3.add(que3)

        //Question 4
        val que4 = txtQuestion(4,
            "Añadir BMW en entre Honda i duckati motorcycles = ['Honda','Ducati', 'Yamaha'] 4 ",
            "Argentina")
        questionsList3.add(que4)

        //Question 5
        val que5 = txtQuestion(5,
            "Como suprimir Yamaha de la lista siguiente? motorcycles = \"['Honda','Ducati', 'Yamaha'] 5 ",
            "Argentina")
        questionsList3.add(que5)

        //Question 6
        val que6 = txtQuestion(6,
            "Añade BMX en el primer lugar de la lista siguiente: \"bicycles = ['city','treak', redline'] 6 ",
            "Argentina")
        questionsList3.add(que6)

        //Question 7
        val que7 = txtQuestion(7,
            "En la següent llista (\"Notas\") on no sabem els valors ens demanen que donguem el ultim de la llista 7",
            "Argentina")
        questionsList3.add(que7)

        //Question 8
        val que8 = txtQuestion(8,
            "En la lista Alumnos, quermos elminar a Antonio Perez, sin saber su ubicaccion en la lista como lo hariamos ? 8",
            "Argentina")
        questionsList3.add(que8)

        //Question 9
        val que9 = txtQuestion(9,
            "Indique el resultado correcto de la siguiente operaccion:  ( a = 5 / b = 3 ) a = a + b  a = a - b 9",
            "Argentina")
        questionsList3.add(que9)

        //Question 10
        val que10 = txtQuestion(10,
            "Aquina de les seguents respostes indica el cuadrat de 5  10 ",
            "Argentina")
        questionsList3.add(que10)

        return questionsList3
    }
}