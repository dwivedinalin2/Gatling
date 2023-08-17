package api

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Login extends Simulation{

  //protocol
  val httpProtocol= http.baseUrl("https://www.landau.app")

  //scenario
  val scn1=scenario("User login")
    .exec(
      http("User login")
        .post("/v1/user")
        .header("content-type","application/json").asJson
        .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMjYyNSwic2Vzc2lvbiI6MTczMzEzNTIwNSwic2lnIjoiZGE2NDdmYzQ5YzViNTAwMjFiNDU4Y2ZiMzY3MmViYWIwYzJkODIwYiIsImlhdCI6MTY4NzcwOTA5NCwiZXhwIjoxNzc0MTA5MDk0fQ.LDuDBbnZE-lQo_ksf6xqBbSq1nXFpeHQQcy6moozWIRUyPFS3gdoaA7pC4PJPXfBwWaNRhJ24TQh_pL_t6CS04a8YmAqT0GjlMKcy3yJrzWSO2zQ-hEecsubprtP3ed7B3b4A6aIwxDix8eG2pGllZoXP_zeS4xt_wdkt99R7nhaCe-4WazJCMJHU-AFHVlLoqK_YDpkG6x_cIL5qk7FIrEQvMMcWTY0dc-j5s_ofK-8OvBDWykn7MLorNJbOfibYrq45EGy6gAfffJ1Y5_dduOUq4-dQbbZV9kH7CK2-V8FgBhlCvWhdooMl8C76B8W3hJTKGOx378meTKuvXRYUg")
        .body(RawFileBody("src/test/resources/login.json")).asJson
        .check(
          status is 200
        )
    )

  //setup
  setUp(
    scn1.inject(rampUsers(100000).during(600))
      .protocols(httpProtocol)
  )

}
