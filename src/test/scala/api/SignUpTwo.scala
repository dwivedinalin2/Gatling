package api

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._


class SignUpTwo extends Simulation {


  //protocol
  val httpProtocol = http.baseUrl("https://api.landau.app/")

  val scn1 = scenario("Sign Up")
    .exec(http("Login access token")
      .post("/v1/user/login")
      .header("content-type", "application/json").asJson
      .header("Landau-Token", "gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
      .header("CF_IPCOUNTRY", "AZ").asJson
      .body(RawFileBody("src/test/resources/userlogin.json")).asJson
      .check(jsonPath("$.body.access_token").saveAs("token")))

//    .exec(http("Sign Up")
//      .post("https://landau.app/api/user")
//      .header("content-type", "application/json").asJson
//      .header("Landau-Token", "gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
//      .header("authorization", "Bearer #{token}")
//      .body(RawFileBody("src/test/resources/signup.json")).asJson
//      .check(status.is(201)))


    .exec(http("Sign Up2")
        .post("https://landau.app/api/user")
      .header("content-type", "application/json").asJson
      .header("Landau-Token", "gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
      .header("authorization", "Bearer #{token}")
        .body(StringBody(
          """
            |{
            |  "email":"""+"#{token}"+"""@getairmail.com" ,
            |  "password":"app@12345",
            |  "password_confirmation": "app@12345"
            |}
            |""".stripMargin)).asJson
        .check(status is 201)
    )

 //setup
  setUp(
    scn1.inject(atOnceUsers(1))
  ).protocols(httpProtocol)

}