package My.pack


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_music.*
import kotlinx.android.synthetic.main.fullscreen_layout.*


class GalleryActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var gridView: GridView? = null
    private var galleryItemAdapter: GalleryItemAdapter? = null
    private var arrayList: ArrayList<GalleryItemList>? = null
    private var  imageFullView: ImageView?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("Rand_Gallery")
        arrayList = ArrayList()
        arrayList = setDataItem()
        gridView = findViewById(R.id.gallery_view)
        arrayList = ArrayList()
        arrayList = setDataItem()
        galleryItemAdapter = GalleryItemAdapter(applicationContext, arrayList!!)
        gridView?.adapter = galleryItemAdapter
        gridView?.onItemClickListener = this
    }

    private fun setDataItem(): ArrayList<GalleryItemList>? {
        var listItem: ArrayList<GalleryItemList> = ArrayList()
        listItem.add(GalleryItemList(R.drawable.falls))
        listItem.add(GalleryItemList(R.drawable.jungle))
        listItem.add(GalleryItemList(R.drawable.library))
        listItem.add(GalleryItemList(R.drawable.night))
        listItem.add(GalleryItemList(R.drawable.zoo))
        listItem.add(GalleryItemList(R.drawable.nature))
        listItem.add(GalleryItemList(R.drawable.car))
        listItem.add(GalleryItemList(R.drawable.paris))
        listItem.add(GalleryItemList(R.drawable.tech))
        listItem.add(GalleryItemList(R.drawable.songs))
        listItem.add(GalleryItemList(R.drawable.movie))
        listItem.add(GalleryItemList(R.drawable.bike))

        return listItem
    }



    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        var items: GalleryItemList = arrayList?.get(p2)!!
        Toast.makeText(applicationContext, "image", Toast.LENGTH_SHORT).show()

        if (items.image==R.drawable.bike){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Bike")
            startActivity(intent)
        }

        if (items.image==R.drawable.car){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Car")
            startActivity(intent)
        }

        if (items.image==R.drawable.movie){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Movie")
            startActivity(intent)
        }

        if (items.image==R.drawable.songs){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Songs")
            startActivity(intent)
        }

        if (items.image==R.drawable.falls){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Falls")
            startActivity(intent)
        }

        if (items.image==R.drawable.jungle){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Jungle")
            startActivity(intent)
        }

        if (items.image==R.drawable.paris){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Paris")
            startActivity(intent)
        }

        if (items.image==R.drawable.library){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Library")
            startActivity(intent)
        }

        if (items.image==R.drawable.night){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Night")
            startActivity(intent)
        }

        if (items.image==R.drawable.tech){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Tech")
            startActivity(intent)
        }

        if (items.image==R.drawable.zoo){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Zoo")
            startActivity(intent)
        }

        if (items.image==R.drawable.nature){

            val intent = Intent(this, fullscreenActivity::class.java)
            intent.putExtra("Rand_image", "Nature")
            startActivity(intent)
        }
    }

}

