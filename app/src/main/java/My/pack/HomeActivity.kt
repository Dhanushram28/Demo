package My.pack

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity: AppCompatActivity() , AdapterView.OnItemClickListener{

    private var listView:ListView?=null
    private var itemAdapters:ItemAdapters?=null
    private var arrayList:ArrayList<ItemList>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        listView=findViewById(R.id.cardView)
        arrayList = ArrayList()
        arrayList=setDataItem()
        itemAdapters= ItemAdapters(applicationContext,arrayList!!)
        listView?.adapter=itemAdapters
        listView?.onItemClickListener=this
    }
    private fun setDataItem(): ArrayList<ItemList> {
        var listItem:ArrayList<ItemList> = ArrayList()
        listItem.add(ItemList(R.drawable.calc,"Calculator"))
        listItem.add(ItemList(R.drawable.calender,"Calender"))
        listItem.add(ItemList(R.drawable.gallery,"Gallery"))
        listItem.add(ItemList(R.drawable.music,"Music"))
        listItem.add(ItemList(R.drawable.stopwatch,"Stopwatch"))
        listItem.add(ItemList(R.drawable.notes,"Notes"))

        return listItem
    }

    override fun onItemClick(parent: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
       var items:ItemList=arrayList?.get(p2)!!
        Toast.makeText(applicationContext,items.title,Toast.LENGTH_SHORT).show()
        if(items.title=="Calculator") {
            val intent = Intent(this, CalcActivity::class.java)
            var data = ""
            intent.putExtra("Rand_Calc", data)
            startActivity(intent)
        }
        else if(items.title=="Calender") {
            val intent = Intent(this, CalenderActivity::class.java)
            var data = ""
            intent.putExtra("Rand_Calender", data)
            startActivity(intent)
        }
        else if(items.title=="Gallery") {
            val intent = Intent(this, GalleryActivity::class.java)
            var data = ""
            intent.putExtra("Rand_Gallery", data)
            startActivity(intent)
        }
    }
}


