package com.stefan.viewmp_tutorial_2072013.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.stefan.viewmp_tutorial_2072013.R
import com.stefan.viewmp_tutorial_2072013.databinding.NameListItemBinding
import com.stefan.viewmp_tutorial_2072013.entity.NameViewModel
import android.view.animation.AnimationUtils


class NameListAdapter(private val viewModel: NameViewModel) : RecyclerView.Adapter<NameListAdapter.ViewHolder>() {
    //Initialize the empty List
    private var names = emptyList<String>()

    //Initialize the viewholder (for each rv which views are holded)
    // class and the type (connecting to the layout from name_list_item.xml)
    class ViewHolder(val binding: NameListItemBinding) : RecyclerView.ViewHolder(binding.root)

    //The onCreateViewHolder() method creates a new ViewHolder
    // object for an item in the RecyclerView by inflating
    // the item's layout and creating a binding object to bind the item's data to the layout.
    // It returns the ViewHolder to the RecyclerView.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = NameListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    //The onBindViewHolder() method in the RecyclerView.Adapter class binds
    // data from the view model to the views in the view holder and updates the UI.
    // It does this by setting the value of the name property in the binding
    // object and immediately applying the data binding.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.name = names[position]
        holder.binding.executePendingBindings()
    }

    //The getItemCount() method in the RecyclerView.Adapter class returns the
    // number of items in the data set. It is used by the RecyclerView to
    // determine how many items to display and how to lay them out.
    override fun getItemCount() = names.size

    fun updateNames() {
        this.names = viewModel.names
        notifyDataSetChanged()
    }

    //The updateNames() method in the NameListAdapter class updates the list of names in the adapter and
// tells the RecyclerView to refresh the UI by setting the names property to the list of names in the view model
// and calling the notifyDataSetChanged() method.
    // This causes the RecyclerView to rebind all items in the data set and update the UI to reflect the new data.
}