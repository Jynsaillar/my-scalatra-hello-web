package com.jynsaillar.helloweb

import org.scalatra._

class HelloWebServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
