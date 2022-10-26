package com.example.gd8_a_0755

import kotlinx.android.synthetic.main.layout_tooltip.view.*
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker
import org.osmdroid.views.overlay.infowindow.InfoWindow

class CustomInfoWindow(mapView: MapView?) : InfoWindow(R.layout.layout_tooltip, mapView) {

    override fun onClose() {

    }

    override fun onOpen(item: Any?) {
        var marker = item as Marker
        var infoWindowData = marker.relatedObject as ModelMain

        val tvNamaLokasi = mView.tvNamaLokasi
        val tvAlamat = mView.tvAlamat
        val imageClose = mView.ImageClose

        tvNamaLokasi.text = infoWindowData.strName
        tvAlamat.text = infoWindowData.strVicinity
        imageClose.setOnClickListener{
            marker.closeInfoWindow()
        }
    }
}