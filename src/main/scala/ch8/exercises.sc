/* #1 **/
//class BankAccount(initialBalance: Double){
//  protected var balance = initialBalance
//  def currentBalance = balance : Double
//  def deposit (amount: Double) = { balance += amount - 1 ; balance}
//  def withdraw (amount: Double) = { balance -= amount + 1; balance}
//}
//
//val myAccount = new BankAccount(1200)
//
//myAccount.currentBalance
//
//myAccount.deposit(3)
//
//myAccount.withdraw(100)
//

/* #2 **/
//class SavingsAccount(amount: Double) extends BankAccount(amount) {
//  var transactions = 3;
//  def earnMonthlyInterest = {
//    balance = balance * 1.0015
//    transactions = 3;
//  }
//
//  override def deposit(amount: Double): Double = {
//    transactions match {
//      case 0 => super.deposit(amount)
//      case _ => {
//        transactions -= 1
//        balance += amount
//        balance.asInstanceOf[Double]
//      }
//    }
//  }
//
//  override def withdraw(amount: Double): Double = {
//    transactions match {
//      case 0 => super.withdraw(amount)
//      case _ => {
//        transactions -= 1
//        balance -= amount
//        balance.asInstanceOf[Double]
//      }
//    }
//  }
//}
//
//val savings = new SavingsAccount(1000)
//
//savings.deposit(20)
//savings.deposit(20)
//savings.deposit(20)
//savings.deposit(20)
//savings.earnMonthlyInterest
//savings.deposit(20)

/* #3 **/
//class Employee(name: String, age: Int, salary: Double){}
//class Manager(name:String, age: Int, salary: Double, reports : List[Employee]) extends Employee(_, _, _){}

/* #4 **/

abstract class Item {
  def price = {}
  def description = {}
}

class SimpleItem(override val price : Double, override val description: String) extends Item {

}

class Bundle (prices: List[Item], ) extends Item {}