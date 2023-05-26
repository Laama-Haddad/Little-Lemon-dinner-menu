package com.littlelemon.menu

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> productsList.sortBasedOnPriceAscending()
            SortType.PriceDesc -> productsList.sortBasedOnPriceDescending()
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

    private fun List<ProductItem>.sortBasedOnPriceAscending(): List<ProductItem> {
        return sortedWith(compareBy { it.price })
    }
    private fun List<ProductItem>.sortBasedOnPriceDescending(): List<ProductItem> {
        return sortedWith(compareByDescending { it.price })
    }
}