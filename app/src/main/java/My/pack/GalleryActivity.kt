package My.pack


import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var gridView: GridView?=null
    private var galleryItemAdapter:GalleryItemAdapter?=null
    private var arrayList:ArrayList<GalleryItemList>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        val bundle: Bundle?=intent.extras
        val msg=bundle!!.getString("Rand_Gallery")
        arrayList = ArrayList()
        arrayList=setDataItem()
        gridView=findViewById(R.id.gallery_view)
        gridView=findViewById(R.id.gallery_view1)
        arrayList = ArrayList()
        arrayList=setDataItem()
        galleryItemAdapter= GalleryItemAdapter(applicationContext, arrayList!!)
        gridView?.adapter=galleryItemAdapter
        gridView?.onItemClickListener=this
    }

    private fun setDataItem(): ArrayList<GalleryItemList>? {
        var listItem:ArrayList<GalleryItemList> = ArrayList()
        listItem.add(GalleryItemList(R.drawable.calc))
        listItem.add(GalleryItemList(R.drawable.calender))
        listItem.add(GalleryItemList(R.drawable.gallery))
        listItem.add(GalleryItemList(R.drawable.music))
        listItem.add(GalleryItemList(R.drawable.stopwatch))
        listItem.add(GalleryItemList(R.drawable.notes))

        return listItem
    }


    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        var items:GalleryItemList=arrayList?.get(p2)!!
        Toast.makeText(applicationContext,"app", Toast.LENGTH_SHORT).show()
    }

}