package My.pack

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ItemAdapters(var context: Context, var arrayList: ArrayList<ItemList>): BaseAdapter() {
    override fun getItem(p0: Int): Any {
        return arrayList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view:View =View.inflate(context,R.layout.cardview_layout,null)

        var icons:ImageView=view.findViewById(R.id.icon_list)
        var title:TextView=view.findViewById(R.id.title_text_view)


        var items:ItemList=arrayList.get(p0)
        items.icons?.let { icons.setImageResource(it) }
        title.text= items.title



        return view!!
    }

    override fun getCount(): Int {
        return arrayList.size
    }

}