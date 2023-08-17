package api

import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class GetCourseDetails extends Simulation{

  //protocol
  val httpProtocol= http.baseUrl("https://api.landau.app")

  //scenario
  val scn1=scenario("Get Course Details")
    .exec(
      http("Get  Course Details")
        .get("/v1/course/math-for-year-2")
        .header("content-type","application/json").asJson
        .header("Landau-Token","gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
        .header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMDk4Mywic2Vzc2lvbiI6MTg4MzY3NjIxOCwic2lnIjoiNWE4ZjJmZTEyYjQxZjU3ZjJlNzllN2FmOGUwM2QwMzM0YjkyMDBlYiIsImlhdCI6MTY4MjU5NDI4OCwiZXhwIjoxNzY4OTk0Mjg4fQ.W6gVFsW80McHIgneHVSgiKm85nS1U5XQa7Itj5OHx9IQQUAslI6xf_gHb0r6SsvQLZy8xGHRSzSpfkZbXkpbzR769s7O5QVM9k4dd_fdsKfKKNDObNZFm06ALE6-eh41y9sJNAlsepgOToOOj247NToyaVxx0O05SbCUBIR2pHoKGIFfQ6YoHTzzxFhXfGe2Y4yb6UXYhyDSNm3GKm2cnML3VLFckaP_0HrEflMaSoa23_RZCYuBp4sH8D-EAvXMXZqivcZU1hyo8UO_uSCngbJ7BoSzKlt5BrrYHfpdIjbL-wvY_vWz5Puq7VXO0rcLBe0jI1s4ll7Vsmprk5bydQ").asJson
        .check(
          status is 200,
          jsonPath("$.status") is "success"
        )
    )

  //setup
  setUp(
    scn1.inject(rampUsers(1000).during(300))
      .protocols(httpProtocol)
  )

}
