package com.shoping.shopingdemo.support

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.shoping.shopingdemo.util.ProductSource

class ProductFragmentFactory(
    private val productDataSource: ProductSource? = null
) : FragmentFactory() {


    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return super.instantiate(classLoader, className)
    }

}