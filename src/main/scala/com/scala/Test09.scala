package com.scala

import scala.collection.mutable.ListBuffer


object Test09 {
  def main(args: Array[String]): Unit = {
    println(test2())
  }

  def test(): String = {
    val list = Array(10, 20, 30)
    if (list.length < 0) {
      return "list无数据"
    }
    if (list.length > 2) {
      return "list数据大于2"
    }
    "未知情况"
  }

  def test2(): (String, Array[AnyRef]) = {
    val sql = ListBuffer[String](
      """
        |select * from
        | tableName
        |""".stripMargin
    )
    val args = ListBuffer[AnyRef]("25+%")
    args.toArray.foreach(println)
    sql.mkString -> args.toArray
  }
}
