package com.scala


import java.io.{File, PrintWriter}

import scala.io.Source

/**
 * 文件输入输出
 *
 * @author xys
 * @version 1.0.0
 */
object Test_FileIO {
  def main(args: Array[String]): Unit = {
    //从文件读取数据
    val source = Source.fromFile("src/main/resources/test.txt")
    val str = source.toList.mkString("")
    //关闭源
    source.close()
    //把源数据转为list集合
    val list = List(str)
    //往集合内添加新数据
    val newList: List[String] = list :+ "1"
    //打印新集合
    newList.foreach(println)
    //写入数据到文件
    val writer = new PrintWriter(new File("src/main/resources/test.txt"))
    writer.write("java io hello")
    writer.close()
  }

}
