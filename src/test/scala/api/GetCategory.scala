package api


import io.gatling.core.Predef._
import io.gatling.http.Predef._

class GetCategory extends Simulation {

  //protocol
  val httpProtocol= http.baseUrl("https://www.landau.app")

  //scenario
  val scn1=scenario("Get all category")
    .exec(
      http("create req ")
        .get("/api/category")
        .header("content-type","application/json")
        .asJson
        .check(
          status is 200,
          jsonPath("$.status") is "success"
        )
    )

  //setup
  setUp(
    scn1.inject(rampUsers(100000).during(600))
      .protocols(httpProtocol)
  )
}
