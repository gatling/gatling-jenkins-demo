package io.gatling.jenkins.demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class SimpleSimulation extends Simulation {

  val httpProtocol =
    http.baseURL("http://computer-database.gatling.io")

  val scn = scenario("Simple")
    .exec(
      http("Home").get("/"))

  setUp(
    scn.inject(
      atOnceUsers(1)))
    .protocols(httpProtocol)
}
