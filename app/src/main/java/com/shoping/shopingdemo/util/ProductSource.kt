package com.shoping.shopingdemo.util

import com.shoping.shopingdemo.model.Products

interface ProductSource {
    fun getProduct(name: String): Products?

    fun getProducts(): List<Products>
}