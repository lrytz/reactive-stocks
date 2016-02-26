package bdd.example

import cucumber.api.scala.{EN, ScalaDsl}

class ExampleSteps extends ScalaDsl with EN {
  var cukes: Int = _ // scalastyle:ignore var.field

  Given("""^there are (\d+) cucumbers$""") { (n: Int) =>
    cukes = n
  }

  When("""^I eat (\d+) cucumbers$""") { (n: Int) =>
    cukes -= n
  }

  Then("""^there are (\d+) cucumbers left$""") { (n: Int) =>
    if (cukes != n)
      throw new AssertionError(s"expected $n cukes, but got $cukes")
  }
}
