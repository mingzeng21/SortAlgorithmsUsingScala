object QuickSort {
  //Quick Sort: O(nlogn)
  def quickSort(lst : List[Int]): List[Int] = lst match {
    case Nil => Nil
    case x::Nil => lst
    case _ =>
      //set the 1st num as the pivot
      val p = lst.head
      //divide and conquer
      val (before, after) = lst.tail.partition(_ < p)
      //recursion
      quickSort(before) ++ (p :: quickSort(after))
  }
}
