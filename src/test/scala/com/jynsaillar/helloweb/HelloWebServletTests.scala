package com.jynsaillar.helloweb

import org.scalatra.test.scalatest._

class HelloWebServletTests extends ScalatraFunSuite {

  addServlet(classOf[HelloWebServlet], "/*")

  test("GET / on HelloWebServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
