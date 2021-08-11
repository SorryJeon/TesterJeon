package com.example.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lotto.*
import java.security.acl.AclNotFoundException
import java.util.*
import kotlin.collections.ArrayList

class lotto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lotto)

        button.setOnClickListener {
            val animation1 = AnimationUtils.loadAnimation(this, R.anim.fadeout)
            val animation2 = AnimationUtils.loadAnimation(this, R.anim.fadein)
            ani1.startAnimation(animation1)
            ani2.startAnimation(animation1)
            result.startAnimation(animation1)
            ani1.startAnimation(animation2)
            ani2.startAnimation(animation2)
            result.startAnimation(animation2)

            var array = arrayOf<Int>(1, 2, 3, 4, 5, 6)
            var index = 0
            while (index < array.size) {
                val random = Random()
                array[index] = random.nextInt(45) + 1
                var check = 0
                while (check < index) {
                    if (array[index] == array[check]) {
                        index--
                        break
                    }
                    check++
                }
                index++
            }

            var array2 = array.sortedArray()
            result.text = "결과 = ${array2.toList()}"
            var first1 = array2[0]
            var second1 = array2[1]
            var third1 = array2[2]
            var fourth1 = array2[3]
            var fifth1 = array2[4]
            var sixth1 = array2[5]
            first.text = "$first1"
            second.text = "$second1"
            third.text = "$third1"
            fourth.text = "$fourth1"
            fifth.text = "$fifth1"
            sixth.text = "$sixth1"

        }
    }


}
