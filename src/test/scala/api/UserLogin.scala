package api

import io.gatling.core.Predef._
import io.gatling.http.Predef._


class UserLogin extends Simulation {
  //protocol
  val httpProtocol = http.baseUrl("https://api.landau.app")

  //scenario
  val scn1 = scenario("User login")
    .exec(http("User login")
      .post("/v1/user/login")
      .header("content-type", "application/json").asJson
      .header("Landau-Token", "gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
      .header("CF_IPCOUNTRY", "AZ").asJson
      .body(RawFileBody("src/test/resources/userlogin.json")).asJson
      .check(status is 200)
      //.check(jsonPath("body.access_token").saveAs(key="login_token"))
    )



  //setup
  setUp(
    scn1.inject(rampUsers(100000).during(600))
      .protocols(httpProtocol))
}
