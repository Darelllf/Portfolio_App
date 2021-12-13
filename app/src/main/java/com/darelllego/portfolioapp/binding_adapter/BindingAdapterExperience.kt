package com.darelllego.portfolioapp.binding_adapter



import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import com.darelllego.portfolioapp.data.Portofolio

@BindingAdapter("androidTitle")
fun TextView.setExperienceTitle(data: Portofolio?) {
    data?.let {
        text = data.title
    }
}

@BindingAdapter( "experienceDetail")
fun TextView.setExperienceDetail(data: Portofolio?){
    data?.let{
        text = data.detail
    }
@BindingAdapter("ExperienceImage")
fun ImageView.setExperienceImage(data: Portofolio) {
    load(data.image) {
        crossfade(1000)
    }
}


}