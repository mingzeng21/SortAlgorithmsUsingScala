object QuickSort {
  def quickSort(lst : List[Int]): List[Int] = lst match {
    case Nil => Nil
    case x::Nil => lst
    case _ =>
      val p = lst.head
      val (before, after) = lst.tail.partition(_ < p)
      quickSort(before) ++ (p :: quickSort(after))
  }
}
