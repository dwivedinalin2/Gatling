package api

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class GetCategoryDetails extends Simulation{

  //protocol
  val httpProtocol= http.baseUrl("https://www.landau.app")

  //scenario
  val scn1=scenario("Get category details")
    .exec(
      http("Get category details")
        .get("/api/category/maths")
        .header("content-type","application/json")
        .asJson
        .check(
          status is 200,
          jsonPath("$.status") is "success"
        )
    )

  //setup
  setUp(
    scn1.inject(rampUsers(100).during(10))
      .protocols(httpProtocol)
  )

}
