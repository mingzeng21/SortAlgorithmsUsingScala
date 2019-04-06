object BubbleSort {
  //Bubble sort: O(n^2)
  def bubbleSort(arr: Array[Int]) {
    for (i <- 0 until arr.length - 1; j <- 0 until arr.length - 1 - i) {
      if (arr(j) > arr(j + 1)) {
        val temp = arr(j)
        arr(j) = arr(j + 1)
        arr(j + 1) = temp
      }
    }
  }
}
