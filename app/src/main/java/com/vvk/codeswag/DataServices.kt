package com.vvk.codeswag

import com.vvk.codeswag.Model.Category
import com.vvk.codeswag.Model.Product

object DataServices {
    val Categories = listOf(
        Category("SHIRT", "shirtimage"),
        Category("HATS","hatimage"),
        Category("HOODIE","hoodieimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("vvk graphic beeniw","$10","hat01"),
        Product("vvk hot black","$12","hat02"),
        Product("vvk hot white","$34","hat03"),
        Product("vvk hot white","$32","hat04")
    )

    val shirt = listOf(
        Product("vvk hot skin","$12","shirt01"),
        Product("vvk hot grey","$15","shirt02"),
        Product("vvk night walk","$76","shirt03"),
        Product("vvk whity slashy","$45","shirt04")
    )

    val hoodie = listOf(
        Product("vvk hot black","$12","hoodie01"),
        Product("vvk hot tone","$15","hoodie02"),
        Product("vvk black tone","$76","hoodie03"),
        Product("vvk whity skin","$45","hoodie04")
    )
}