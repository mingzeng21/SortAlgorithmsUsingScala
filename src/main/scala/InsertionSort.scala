object InsertionSort {
  //O(n^2)
  def insertionSort(arr: Array[Int]): Unit ={
    for (i <- 1 until arr.length){
      val tmp = arr(i)
      var j = i - 1
      while (j > -1 && arr(j) > tmp){
        arr(j+1) = arr(j)
        j -= 1
      }
      arr(j+1) = tmp
    }
  }
}
