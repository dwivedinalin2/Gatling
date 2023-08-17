package api

import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class GetCompetitionDetails  extends Simulation{

  //protocol
  val httpProtocol= http.baseUrl("https://api.landau.app")

  //scenario
  val scn1=scenario("Get Competition Details")
    .exec(
      http("Get Competition Details")
        .get("/v1/competition")
        .header("content-type","application/json").asJson
        .header("Landau-Token","gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
        .header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjo3MDIsInNlc3Npb24iOjI1MTM2OTc2NCwic2lnIjoiZDc5MGMzM2MxZTEzZTc1NDc3OTc5OGJlZWMyZjUxY2RmMjNmMzQzOSIsImlhdCI6MTY4MTYyNzYxMywiZXhwIjoxNzY4MDI3NjEzfQ.J2KcxZrYWfZxL8hc66-3h51Tc6rSXH46F9D6wopfIpWzE3Oc9BPL9Wd6EFE_uBnn_3tVcJjJ0To1hejMMt4Lz-G928gC-c3wiH__Z7PsQ4ULi-PuzxBBW1IZJMdMx8_8IZwxsYmoUZDfHEEAdcDfGjLM56ycfnQ15Ms7WXDMvqtbOEWgCEiLg_6DDJiTsEhF_ThMr6GCOy4o-o79qoXB7BBMcFhl8ktRD4lGzy9oljGAe2nGzfXz1TJZKb9dgPXIlPmEuiFvqws6FjnfPrTpb4otT3cWSB7bImfF-3XE3htkJvH2QKoQJRjAStFscq5j3WI-dXvqzti0Y1s9I_j_MQ").asJson
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
