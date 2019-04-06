object SortTest {
  def main(args: Array[String]): Unit = {
    val nums: List[Int] = List.fill(50)(util.Random.nextInt(100))
    println("before sort")
    println(nums.mkString(","))
    println("sorted")
    val array = nums.toArray
    SelectionSort.selectionSort(array)
    println(array.mkString(","))
  }
}






