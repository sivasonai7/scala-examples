package com.scexamples.inheritance

/**
  * Created by Admin on 06-05-2018.
  */
object CaseInheritance {

  abstract class Person {
    def name: String
    def age: Int

    def getName(): String = {
      return name
    }
  }


  case class PersonA(val name: String, val age:Int, val salary: Int) extends Person

  def main(args:Array[String]): Unit ={
      val p = PersonA("Senthil", 10,42)
      println(p.getName)
  }


}
