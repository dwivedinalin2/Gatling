//package api
//
//import io.gatling.core.Predef._
//import io.gatling.http.Predef._
//
//
//class Signup extends Simulation{
//  //protocol
//  val httpProtocol= http.baseUrl("https://api.landau.app/")
//
//  //scenario
//  val scn1=scenario("Sign Up")
//    .exec(http("User login")
//      .post("/v1/user/login")
//      .header("content-type","application/json").asJson
//      .header("Landau-Token","gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
//      .header("CF_IPCOUNTRY","AZ").asJson
//      .body(RawFileBody("src/test/resources/userlogin.json")).asJson
//      .check(jsonPath("$body.accesstoken").saveAs("token"))
//
//    .exec(http("Sign Up")
//      .post("/v1/api/user")
//      .header("content-type","application/json").asJson
//      .header("Landau-Token","gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
//      .header("authorization","Bearer"+"{token}")
//
//      )
//
//  )
//
//  //setup
//  setUp(
//    scn1.inject(rampUsers(100).during(100))
//      .protocols(httpProtocol)
//  )
//
//}
