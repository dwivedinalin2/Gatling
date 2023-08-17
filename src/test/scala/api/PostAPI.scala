package api

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class PostAPI extends Simulation {

  //protocol
  val httpProtocol= http.baseUrl("https://reqres.in/api")

  //scenario
  val scn1=scenario("Create User")
    .exec(
      http("create req ")
        .post("/users")
        .header("content-type","application/json")
        .asJson
        .body(RawFileBody("src/test/resources/user.json")).asJson
        .check(
          status is 201,
          jsonPath("$.name") is "John"

        )
    )

  //setup
  setUp(
    scn1.inject(rampUsers(1000000).during(10000))
      .protocols(httpProtocol)
  )
}
