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
    source.foreach(println)
    source.close()
    //写入数据到文件
    val writer = new PrintWriter(new File("src/main/resources/test.txt"))
    writer.write("java io hello")
    writer.close()
  }

}
