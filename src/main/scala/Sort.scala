object Sort {

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

  def merge (a : List[Int], b : List[Int]): List[Int] = (a, b) match {
    case (Nil, _) => b
    case (_, Nil) => a
    case (x::xs, y::ys) =>
      if (x < y)
        x :: merge(xs, b)
      else
        y :: merge(a, ys)
  }

  def mergeSort (lst : List[Int]): List[Int] = {
    if (lst.length < 2)
      lst
    else{
      val (first, second) = lst.splitAt(lst.length/2)
      merge(mergeSort(first),mergeSort(second))
    }
  }

  def main(args: Array[String]): Unit = {
    val nums: List[Int] = List.fill(50)(util.Random.nextInt(100))
    println("before sort")
    println(nums.mkString(","))
    println("sorted")
    println(mergeSort(nums).mkString(","))
  }


}
