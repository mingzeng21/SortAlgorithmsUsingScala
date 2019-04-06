object MergeSort {
  //merge method for merge sort
  def merge (a : List[Int], b : List[Int]): List[Int] = (a, b) match {
    case (Nil, _) => b
    case (_, Nil) => a
    //compare the first element
    case (x::xs, y::ys) =>
      if (x < y)
        x :: merge(xs, b)
      else
        y :: merge(a, ys)
  }

  //Merge sort: O(nlogn)
  def mergeSort (lst : List[Int]): List[Int] = {
    if (lst.length < 2)
      lst
    else{
      //divide
      val (first, second) = lst.splitAt(lst.length/2)
      //recursion
      merge(mergeSort(first),mergeSort(second))
    }
  }
}
