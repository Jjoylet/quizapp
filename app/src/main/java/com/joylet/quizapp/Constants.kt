package com.joylet.quizapp

object Constants {



    fun getQuestions(): ArrayList<Question> {
        val questionlist = ArrayList<Question>()

        val que1 = Question(
            1, "Which animal is this?",
            R.drawable.kangaroo,
            "Cow",
            "Dog",
            "Kangaroo",
            "Hyena",
            3
        )

        questionlist.add(que1)

        val que2 = Question(
            2, "Which animal is this?",
            R.drawable.donkey,
            "Horse",
            "Donkey",
            "Kangaroo",
            "Lion",
            2
        )

        questionlist.add(que2)

        val que3 = Question(
            3, "Which animal is this?",
            R.drawable.elephant,
            "Elephant",
            "Cow",
            "Giraffe",
            "Buffallo",
            1
        )

        questionlist.add(que3)

        val que4 = Question(
            4, "Which animal is this?",
            R.drawable.hyena,
            "Kangaroo",
            "Dog",
            "fox",
            "Hyena",
            4
        )

        questionlist.add(que4)

        val que5 = Question(
            5, "Which animal is this?",
            R.drawable.horse,
            "Cow",
            "horse",
            "donkey",
            "zebra",
            2
        )

        questionlist.add(que5)

        val que6 = Question(
            6, "Which animal is this?",
            R.drawable.mantis,
            "grasshopper",
            "fly",
            "bee",
            "mantis",
            4
        )

        questionlist.add(que6)

        val que7 = Question(
            7, "Which animal is this?",
            R.drawable.parrot,
            "owl",
            "pegion",
            "butterfly",
            "parrot",
            4
        )

        questionlist.add(que7)

        val que8 = Question(
            8, "Which animal is this?",
            R.drawable.pegion,
            "Pegion",
            "Parrot",
            "bee",
            "owl",
            1
        )

        questionlist.add(que8)


        val que9 = Question(
            9, "Which animal is this?",
            R.drawable.pig,
            "pig",
            "Dog",
            "guinea pig",
            "Hyena",
            1
        )

        questionlist.add(que9)

        val que10 = Question(
            10, "Which animal is this?",
            R.drawable.rabbit,
            "Cow",
            "Dog",
            "rabbit",
            "Guinea Pig",
            3
        )

        questionlist.add(que10)



        return questionlist
    }
}