package com.joylet.quizapp

object Constants {

       const val USER_NAME: String = "user_name"
       const val TOTAL_QUESTION : String = "total_question"
       const val CORRECT_ANSWERS: String = "correct_answers"

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

        val que11 = Question(
            11, "Which type of house is this?",
            R.drawable.beach,
            "Beach",
            "Bungalow",
            "Stone",
            "Grass house",
            1
        )

        questionlist.add(que11)

        val que12 = Question(
            12, "Which of type of house is this?",
            R.drawable.bungalow,
            "Bungalow",
            "Beach",
            "Stone",
            "Mud",
            1
        )

        questionlist.add(que12)

        val que13 = Question(
            5, "Which words matches the picture?",
            R.drawable.bird,
            "vaca",
            "pajaro",
            "gata",
            "puerta",
            2
        )

        questionlist.add(que13)

        val que14 = Question(
            14, "Which of these words matches the picture?",
            R.drawable.cat,
            "vaca",
            "gato",
            "pajaro",
            "zebra",
            2
        )

        questionlist.add(que14)

        val que15 = Question(
            15, "What does this animal produce?",
            R.drawable.cow,
            "milk",
            "powder",
            "oil",
            "fur",
            1
        )

        questionlist.add(que15)

        val que16 = Question(
            16, "This of this words can be used to represent the image?",
            R.drawable.cups,
            "Stationary",
            "Cultery",
            "Stationery",
            "Utensils",
            2
        )

        questionlist.add(que16)

        val que17 = Question(
            17, "Which type of house is this?",
            R.drawable.cottage,
            "Apartment",
            "Condo",
            "Bungalow",
            "Cottage",
            4
        )

        questionlist.add(que17)

        val que18 = Question(
            18, "Which type of car is this?",
            R.drawable.honda,
            "Lumborghini",
            "Honda",
            "Corrola",
            "Toyota",
            2
        )

        questionlist.add(que18)

        val que19 = Question(
            19, "Which type vehicle is this?",
            R.drawable.lumbogini,
            "Lumborghini",
            "Maserati",
            "Ford",
            "Nissan",
            1
        )

        questionlist.add(que19)

        val que20 = Question(
            20, "Which type of vehicle is this?",
            R.drawable.maserati,
            "Ford",
            "Honda",
            "Maserati",
            "Mercedes",
            3
        )

        questionlist.add(que20)

        val que21 = Question(
            21, "Which type of vehicle is this?",
            R.drawable.toyota,
            "Toyota",
            "Honda",
            "Ford",
            "Taxi",
            1
        )

        questionlist.add(que21)


        return questionlist
    }
}