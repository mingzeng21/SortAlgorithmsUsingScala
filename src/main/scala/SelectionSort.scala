object SelectionSort {
  def selectionSort(arr: Array[Int]): Unit ={
    for (i <- 0 until arr.length-1){
      var min = i
      //find the smallest num
      for (j <- i+1 until arr.length){
        if (arr(j) < arr(min))
          min = j
      }
      //swap the smallest num with arr(i)
      val tmp = arr(i)
      arr(i) = arr(min)
      arr(min) = tmp
    }
  }
}
