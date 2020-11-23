class Employee(val employeeId: Int, val employeeName: String, var employeeAge: Int) {
  override def toString = "Employee : [" + employeeId+"]["+employeeName+"]["+employeeAge+"]"

}

object ClassDemo extends App {
  val employee = new Employee(1, "A", 23)
  employee.employeeAge=25
  print(employee)
}






