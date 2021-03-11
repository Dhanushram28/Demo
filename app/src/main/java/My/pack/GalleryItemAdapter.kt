package My.pack

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class GalleryItemAdapter(var context: Context,var arrayList: ArrayList<GalleryItemList>): BaseAdapter() {

    override fun getItem(p0: Int): Any {
        return arrayList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view:View =View.inflate(context,R.layout.gallery_layout,null)

        var image:ImageView=view.findViewById(R.id.gallery_image)

        var galleryitems:GalleryItemList=arrayList.get(p0)
        galleryitems.image?.let { image.setImageResource(it) }

        return view!!
    }

    override fun getCount(): Int {
        return arrayList.size
    }

}