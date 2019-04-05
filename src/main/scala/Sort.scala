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

  //Bubble sort: O(n^2)
  def bubbleSort(arr: Array[Int]) {
    for (i <- 0 until arr.length - 1 ; j <- 0 until arr.length - 1 - i) {
      if (arr(j) > arr(j+1)){
        val temp = arr(j)
        arr(j) = arr(j+1)
        arr(j+1) = temp
      }
    }
  }


  def main(args: Array[String]): Unit = {
    val nums: List[Int] = List.fill(50)(util.Random.nextInt(100))
    println("before sort")
    println(nums.mkString(","))
    println("sorted")
    val array = nums.toArray
    bubbleSort(array)
    println(array.mkString(","))
  }


}
