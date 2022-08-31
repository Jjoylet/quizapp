package com.joylet.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionList:ArrayList<Question>? = null
    private var mSelectedOptionPosition :Int = 0
    private var mCorrectAnswers:Int = 0
    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        val option_one : TextView = findViewById(R.id.option_one)
        val option_two : TextView = findViewById(R.id.option_two)
        val option_three : TextView = findViewById(R.id.option_three)
        val option_four : TextView = findViewById(R.id.option_four)
        val btn_submit : Button = findViewById(R.id.btn_submit)

        mQuestionList = Constants.getQuestions()
        setQuestion()
        option_one.setOnClickListener(this)
        option_two.setOnClickListener(this)
        option_three.setOnClickListener(this)
        option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)


    }
    private fun setQuestion(){
        val progressBar:ProgressBar = findViewById(R.id.Progressbar)
        val tv_progress:TextView = findViewById(R.id.tv_progress)
        val btn_submit : Button = findViewById(R.id.btn_submit)

        defaultOptionView()

        if (mCurrentPosition == mQuestionList!!.size){
            btn_submit.text = "FINISH"
        }else{
            btn_submit.text = "SUBMIT"
        }

        val tv_question : TextView = findViewById(R.id.tv_question)
        val iv_image : ImageView = findViewById(R.id.iv_image)
        val option_one : TextView = findViewById(R.id.option_one)
        val option_two : TextView = findViewById(R.id.option_two)
        val option_three : TextView = findViewById(R.id.option_three)
        val option_four : TextView = findViewById(R.id.option_four)
        val question = mQuestionList!![mCurrentPosition-1]

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        option_one.text = question.optionOne
        option_two.text = question.optionTwo
        option_three.text = question.optionThree
        option_four.text = question.optionFour


    }

    private fun defaultOptionView(){
        val options = ArrayList<TextView>()
        val option_one : TextView = findViewById(R.id.option_one)
        val option_two : TextView = findViewById(R.id.option_two)
        val option_three : TextView = findViewById(R.id.option_three)
        val option_four : TextView = findViewById(R.id.option_four)

        options.add(0,option_one)
        options.add(1,option_two)
        options.add(2,option_three)
        options.add(3,option_four)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg

            )

        }
    }

    override fun onClick(p0: View?) {
        val option_one : TextView = findViewById(R.id.option_one)
        val option_two : TextView = findViewById(R.id.option_two)
        val option_three : TextView = findViewById(R.id.option_three)
        val option_four : TextView = findViewById(R.id.option_four)
        val btn_submit : Button = findViewById(R.id.btn_submit)
        when(p0?.id){
            R.id.option_one ->{
                selectedOptionView(option_one,1)
            }
            R.id.option_two ->{
                selectedOptionView(option_two,2)
            }
            R.id.option_three ->{
                selectedOptionView(option_three,3)
            }
            R.id.option_four ->{
                selectedOptionView(option_four ,4)
            }
            R.id.btn_submit ->{
                if (mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mQuestionList!!.size ->{
                            setQuestion()
                        }else -> {
                           val intent = Intent(this,ResultActivity::class.java)
                           intent.putExtra(Constants.USER_NAME,mUserName)
                           intent.putExtra(Constants.CORRECT_ANSWERS,mCorrectAnswers)
                           intent.putExtra(Constants.TOTAL_QUESTION,mQuestionList!!.size)
                           startActivity(intent)
                           finish()
                        }
                    }
                }else{
                    val question = mQuestionList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
                    }else {
                        mCorrectAnswers++
                        answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                    }

                    if(mCurrentPosition == mQuestionList!!.size){
                        btn_submit.text = "FINISH"
                    }else{
                        btn_submit.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        val option_one : TextView = findViewById(R.id.option_one)
        val option_two : TextView = findViewById(R.id.option_two)
        val option_three : TextView = findViewById(R.id.option_three)
        val option_four : TextView = findViewById(R.id.option_four)
        when(answer){
            1 ->{
                option_one.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2 ->{
                option_two.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3 ->{
                option_three.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4 ->{
                option_four.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
        }
    }
     private fun selectedOptionView(textView: TextView,
                                    selectedOptionNum: Int){
         defaultOptionView()
         mSelectedOptionPosition = selectedOptionNum
         textView.setTextColor(Color.parseColor("#363A43"))
         textView.setTypeface(textView.typeface, Typeface.BOLD)
         textView.background = ContextCompat.getDrawable(
             this,
             R.drawable.selective_option_border_bg

         )
     }

}