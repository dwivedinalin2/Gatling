package api

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._


class ProfileCreate extends Simulation{

  //protocol
  val httpProtocol= http.baseUrl("https://api.landau.app")

  //scenario
  val scn1=scenario("User login")
    .exec(
      http("User login")
        .post("/v1/profile")
        .header("content-type","application/json").asJson
        .header("Landau-Token","gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
        .body(RawFileBody("src/test/resources/userlogin.json")).asJson
        .check(
          status is 200
        )
    )


  //setup
  setUp(
    scn1.inject(rampUsers(100).during(100))
      .protocols(httpProtocol)
  )
}
