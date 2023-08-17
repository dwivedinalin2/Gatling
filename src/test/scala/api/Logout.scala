package api

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Logout extends Simulation{

  //protocol
  val httpProtocol = http.baseUrl("https://api.landau.app/")

  val scn1 = scenario("Logout")
    .exec(http("Login access token")
      .post("/v1/user/login")
      .header("content-type", "application/json").asJson
      .header("Landau-Token", "gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
      .header("CF_IPCOUNTRY", "AZ").asJson
      .body(RawFileBody("src/test/resources/userlogin.json")).asJson
      .check(jsonPath("$.body.access_token").saveAs("token")))


    .exec(http("Logout")
      .post("/v1/user/logout")
      .header("content-type", "application/json").asJson
      .header("Landau-Token", "gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
      .header("authorization", "Bearer #{token}")
      .body(RawFileBody("src/test/resources/logout.json")).asJson
      .check(status.is(200)))



  //setup
  setUp(
    scn1.inject(rampUsers(1).during(6))
      .protocols(httpProtocol))

}
