package com.example.swanset

class ComboUtil {
  /* arr[] ---> Input Array
	data[] ---> Temporary array to store current combination
	start & end ---> Starting and Ending indexes in arr[]
	index ---> Current index in data[]
	r ---> Size of a combination to be printed */
  private fun <T> combinationUtil(
    arr: Array<T>, data: MutableList<T>, start: Int,
    end: Int, index: Int, r: Int, finalSets: MutableSet<Set<T>>
  ): Set<Set<T>> {
    // Current combination is ready to be printed, print it
    if (index == r) {
      val set: MutableSet<T> = mutableSetOf()
      for (j in 0 until r) {
        print(data[j].toString() + " ")
        println("")
        set.add(data[j])
      }
      finalSets.add(set)
      return finalSets
    }

    // replace index with all possible elements. The condition
    // "end-i+1 >= r-index" makes sure that including one element
    // at index will make a combination with remaining elements
    // at remaining positions
    var i = start
    while (i <= end && end - i + 1 >= r - index) {
      data[index] = arr[i]
      combinationUtil(arr, data, i + 1, end, index + 1, r, finalSets)
      i++
    }
    return finalSets;
  }

  // The main function that prints all combinations of size r
  // in arr[] of size n. This function mainly uses combinationUtil()
  public fun <T> getCombination(arr: Array<T>, n: Int, r: Int): Set<Set<T>> {
    // A temporary array to store all combination one by one

    // Print all combination using temporary array 'data[]'
    return combinationUtil<T>(arr, mutableListOf<T>(), 0, n - 1, 0, r, mutableSetOf())
  }

  /*Driver function to check for above function*/
//  @JvmStatic
//  fun main(args: Array<String>) {
//    val arr = intArrayOf(1, 2, 3, 4, 5)
//    val r = 3
//    val n = arr.size
//    printCombination(arr, n, r)
//  }
}
