package com.example.meme_generator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MEME_Template : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_template)
        loadMeme()
    }
    private fun loadMeme(){
        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://meme-api.herokuapp.com/gimme"

// Request a string response from the provided URL.
        val JsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url, null
            Response.Listener<> { response ->
           val url = response.getString("url ")
             Glide.with(this).load(url).into(memeImageView)

            },
            Response.ErrorListener {

            })

// Add the request to the RequestQueue.
        queue.add(JsonObjectRequest)
    }
    fun Share(view: android.view.View) {}
    fun Next(view: android.view.View) {}
}