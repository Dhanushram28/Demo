package My.pack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CalenderActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)
        val bundle: Bundle?=intent.extras
        val msg=bundle!!.getString("Rand_Calender")
    }

}