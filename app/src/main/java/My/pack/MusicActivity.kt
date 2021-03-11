package My.pack

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_music.*
import java.util.*

class MusicActivity: AppCompatActivity() {

    private lateinit var mediaPlayer:MediaPlayer
    private lateinit var runnable: Runnable
    private lateinit var handler:Handler
    private var pause:Boolean=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)
        val bundle: Bundle?=intent.extras
        val msg=bundle!!.getString("Rand_Music")

        playBtn.setOnClickListener{
            if(pause){
                mediaPlayer.seekTo(mediaPlayer.currentPosition)
                mediaPlayer.start()
                pause=false
            }
            else{
                mediaPlayer=MediaPlayer.create(applicationContext,R.drawable.bike)
                mediaPlayer.start()
            }
            initializeSeekBar(){
                playBtn.isEnabled=false
                pauseBtn.isEnabled=true
            }
            mediaPlayer.setOnCompletionListener {
                playBtn.isEnabled=false
                pauseBtn.isEnabled=false
            }
        }

        playBtn.setOnClickListener{
            if(mediaPlayer.isPlaying){
                mediaPlayer.pause()
                pause=true
                playBtn.isEnabled=true
                pauseBtn.isEnabled=false
            }
        }

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                if (b) {
                    mediaPlayer.seekTo(i * 1000)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
    }

    private fun initializeSeekBar(function: () -> Unit) {
        seekBar.max = mediaPlayer.seconds

        runnable = Runnable {
            seekBar.progress = mediaPlayer.currentSeconds

            startTime.text = "${mediaPlayer.currentSeconds.toString()} "
            val diff = mediaPlayer.seconds - mediaPlayer.currentSeconds
            endTime.text = "$diff"

            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
    }
}
val MediaPlayer.seconds:Int
    get() {
        return this.duration / 1000
    }

val MediaPlayer.currentSeconds:Int
    get() {
        return this.currentPosition/1000
    }