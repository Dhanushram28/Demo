package My.pack

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class fullscreenActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fullscreen_layout)
        val bundle: Bundle?=intent.extras
        val msg=bundle!!.getString("Rand_image")
        var name: String? =intent.getStringExtra("Rand_image")
        var icons: ImageView =findViewById(R.id.fullscreen_image)
        if(name=="Bike")
            icons.setImageResource(R.drawable.bike)
        if(name=="Car")
            icons.setImageResource(R.drawable.car)
        if(name=="Nature")
            icons.setImageResource(R.drawable.nature)
        if(name=="Falls")
            icons.setImageResource(R.drawable.falls)
        if(name=="Night")
            icons.setImageResource(R.drawable.night)
        if(name=="Movie")
            icons.setImageResource(R.drawable.movie)
        if(name=="Songs")
            icons.setImageResource(R.drawable.songs)
        if(name=="Library")
            icons.setImageResource(R.drawable.library)
        if(name=="Paris")
            icons.setImageResource(R.drawable.paris)
        if(name=="Zoo")
            icons.setImageResource(R.drawable.zoo)
        if(name=="Tech")
            icons.setImageResource(R.drawable.tech)
        if(name=="Jungle")
            icons.setImageResource(R.drawable.jungle)
    }
}