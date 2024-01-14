package com.aaozden.catchthejack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.renderscript.ScriptGroup.Binding
import android.view.View
import android.widget.ImageView
import com.aaozden.catchthejack.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var score = 0
    var imageArray = ArrayList<ImageView>()
    var runnable = Runnable{}
    var handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun hideImages(view: View){
        for (image in imageArray) {
            image.visibility = View.INVISIBLE
        }
        val random = Random()
        val randomIndex = random.nextInt(9)
        imageArray[randomIndex].visibility = View.VISIBLE
    }


    fun increaseScore(view: View){
        score = score +1
        binding.scoreText.text = "Score: ${score}"


    }

}