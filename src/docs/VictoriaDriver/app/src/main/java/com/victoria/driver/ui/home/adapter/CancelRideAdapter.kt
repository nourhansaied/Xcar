package com.victoria.driver.ui.home.adapter

import android.content.Context
import android.support.v7.widget.AppCompatRadioButton
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.victoria.driver.R
import com.victoria.driver.ui.interfaces.ItemClickListener
import com.victoria.driver.ui.model.CancelReason
import kotlinx.android.synthetic.main.row_cancel_reason_item_layout.view.*


/**
 * Created  on 3/10/16.
 */

class CancelRideAdapter(private val context: Context, private var eList: List<CancelReason>, itemClickListener: ItemClickListener) : RecyclerView.Adapter<CancelRideAdapter.ViewHolder>() {
    lateinit var view: View
    var itemClickListener: ItemClickListener = itemClickListener


    var lastPosition: AppCompatRadioButton? = null
    var selectedPosition: Int = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        view = LayoutInflater.from(context).inflate(R.layout.row_cancel_reason_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.bind(eList[position].reason)

    }


    override fun getItemCount(): Int {
        return eList.size
    }


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(reason: String) {
            view.radioButton.text = reason
            view.radioButton.setOnCheckedChangeListener { compoundButton, b ->

                lastPosition?.isChecked = false


                lastPosition = compoundButton as AppCompatRadioButton

                if (b) {
                    selectedPosition = adapterPosition
                    itemClickListener.onItemEventFired(reason, adapterPosition)
                }
            }
        }
    }
}
