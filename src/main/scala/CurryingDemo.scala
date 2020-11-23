object CurryingDemo extends App {
  def compute(dim1: Int)(dim2: Int)(dim3: Int) = {
    dim1 + dim2 + (dim3 / 2)
  }


  val computeDim1 = compute(1) _

  val computeDim2 = computeDim1(2)

  val finalDim = computeDim2(4)


  print(finalDim)

}
