//package com.example.assets.fragment
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ListView
//import androidx.fragment.app.ListFragment
//import com.example.assets.R
//
//
//class SongListFragment : ListFragment() {
//
//
//
//    var listener: OnSongSelectedListener? = null
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//       // listAdapter= ArrayAdapter<String>(activity,android.R.layout.simple_list_item_activated_1,libros)
//
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_article_list, container, false)
//    }
//    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
//        // Append the clicked item's row ID with the content provider Uri
//               // Send the event and Uri to the host activity
//        listener?.onSongSelected(0)
//    }
//    companion object {
//               // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String) =
//            SongListFragment().apply {
//                arguments = Bundle().apply {
//                    putString("valor", param1)
//                }
//            }
//    }
//}