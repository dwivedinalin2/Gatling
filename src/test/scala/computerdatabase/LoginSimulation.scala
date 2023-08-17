package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class LoginSimulation extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://api.mixpanel.com")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*"""))
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")
  
  private val headers_0 = Map(
  		"accept" -> "application/json",
  		"authorization" -> "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMDk4NCwic2Vzc2lvbiI6MTUxMzQzNjU0LCJzaWciOiI1ZTA1NWU1ODNhMGQ3MWVmN2FjNTg1OTlkMzBlODI3MzY1NDMzYTQ2IiwiaWF0IjoxNjgxMTMzNDYwLCJleHAiOjE3Njc1MzM0NjB9.Vlai3mb90onI1UwbygopKZYg2Q7WBU3V_1t1zJu1HfpVtzju4aKf-weUCEFHffcNOAWQzZIy9GQHF4tFweGMxVLyolp_9H-oxT2ZIvShgWj9uHzxa4IdyVpTt-eeknt0zCgCn3CA30hKDyVowQZlKLtzcombiFGy8LPMU97VfzH6vbHDcEXD8Gf6Jxn8uSfrzy9yWC_nkRrnaE3aC3S9rzaYJtMjd-OhVmOWUzL4KfOCQXFFYwafxFugEUQNw-AlvflmvY7UjziH44UAKMXvXqqTtCjlbYnrncnsWI1ZTs52-3YmEb3zIOI4bnvn9Wx1BNZeRFdhfNWPvPlImFx9sw",
  		"content-type" -> "application/json;charset=UTF-8",
  		"country" -> "IN",
  		"language" -> "en",
  		"origin" -> "https://www.landau.app",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_1 = Map(
  		"accept" -> "application/json",
  		"origin" -> "https://www.landau.app",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site",
  		"x-client-data" -> "CIm2yQEIprbJAQjEtskBCKmdygEIi/rKAQiWocsBCJr+zAEI5JfNAQiGoM0BCL2izQEY1J3NAQ==",
  		"x-goog-api-key" -> "AIzaSyCxXWr92TmSlqlLhqCT1E5NVbjyAu72SP8"
  )
  
  private val headers_2 = Map(
  		"content-type" -> "application/csp-report",
  		"origin" -> "https://www.landau.app",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "report",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "cross-site"
  )
  
  private val headers_3 = Map(
  		"content-type" -> "text/plain;charset=UTF-8",
  		"origin" -> "https://www.landau.app",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site"
  )
  
  private val headers_4 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "same-origin",
  		"sec-fetch-user" -> "?1",
  		"upgrade-insecure-requests" -> "1"
  )
  
  private val headers_5 = Map(
  		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "image",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "same-site"
  )
  
  private val headers_7 = Map(
  		"accept" -> "application/json",
  		"authorization" -> "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMDk4NCwic2Vzc2lvbiI6NDgzOTQzNjcsInNpZyI6IjdmMGI0YjVhNmYxMWExNDI2YzdmYjhkMjNmNmZhMDJjNmUyNTZiOWMiLCJpYXQiOjE2ODExMzM1MDEsImV4cCI6MTc2NzUzMzUwMX0.A36IxcK2DtAhOuFt4CKbQZGhbfH_k7AKnRx2c3hEXf553V08EvmB0l23NUG6t8vvls34dNEfUsnmMES438YV-eUd4CcNhA334TiyU0TLHhKdYQo1rjEd4FA5tRGoay7r9tjgpIafVBYbXe2z_R0Pp0uji8a1gRlpx8fSuMxRzEQxVTEe-q6EMueJyCunRCCvKyCSSY8aSn1B18bVVrqUpdsfCKAlPobqSiUER5FnOKYDksIiQMANvMbz-bK_7R33RyVkAOHjLkDHU2Rve0guNGRXN8bIkXc3IDtwFgOuTJKHywmXYDtbr1G7X0LinTY-xkitmGcr5BHGbI1mzAbMPw",
  		"country" -> "IN",
  		"language" -> "en",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_8 = Map(
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "manifest",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin"
  )
  
  private val headers_10 = Map(
  		"origin" -> "https://www.landau.app",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site"
  )
  
  private val uri1 = "https://o506973.ingest.sentry.io/api/5598097"
  
  private val uri2 = "https://static.landau.app/content/profile/default.png"
  
  private val uri3 = "https://firebase.googleapis.com/v1alpha/projects/-/apps/1:750436022736:web:897ec10df54631661c61d5/webConfig"
  
  private val uri5 = "https://www.landau.app"

  private val scn = scenario("LoginSimulation")
    .exec(
      http("request_0")
        .post(uri5 + "/api/user/login")
        .headers(headers_0)
        .body(RawFileBody("computerdatabase/loginsimulation/0000_request.json"))
        .resources(
          http("request_1")
            .get(uri3)
            .headers(headers_1),
          http("request_2")
            .post(uri1 + "/security/?sentry_key=6cdcc07a2a0a4961951744d95912159c")
            .headers(headers_2)
            .body(RawFileBody("computerdatabase/loginsimulation/0002_request.bin")),
          http("request_3")
            .post(uri1 + "/store/?sentry_key=6cdcc07a2a0a4961951744d95912159c&sentry_version=7")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/loginsimulation/0003_request.json")),
          http("request_4")
            .get(uri5 + "/profile/list")
            .headers(headers_4),
          http("request_5")
            .get(uri2 + "?st=udseItfluWRV_3MRvWT4vQ&expires=1681133802")
            .headers(headers_5),
          http("request_6")
            .post(uri1 + "/store/?sentry_key=6cdcc07a2a0a4961951744d95912159c&sentry_version=7")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/loginsimulation/0006_request.json")),
          http("request_7")
            .get(uri5 + "/api/user")
            .headers(headers_7),
          http("request_8")
            .get(uri5 + "/site.webmanifest")
            .headers(headers_8),
          http("request_9")
            .get(uri2 + "?st=kWet3lsAWYwatcgsKhSoFg&expires=1681133803")
            .headers(headers_5)
        )
    )
    .pause(9)
    .exec(
      http("request_10")
        .post("/track/?verbose=1&ip=1&_=1681133512746")
        .headers(headers_10)
        .formParam("data", """[
          {"event": "SIGN_IN","properties": {"$os": "Mac OS X","$browser": "Chrome","$referrer": "https://www.landau.app/courses/english-for-year-2-2?tab=content","$referring_domain": "www.landau.app","$current_url": "https://www.landau.app/#","$browser_version": 112,"$screen_height": 1120,"$screen_width": 1792,"mp_lib": "web","$lib_version": "2.45.0","$insert_id": "tm5me3vslm2sdsx8","time": 1681133501.812,"distinct_id": "dwivedi.nalin2+b2@gmail.com","$device_id": "1876ab3701410a5-05bc6d59b3a014-1d525634-1ea000-1876ab37015f0a","$initial_referrer": "$direct","$initial_referring_domain": "$direct","$user_id": "dwivedi.nalin2+b2@gmail.com","TYPE": "SIGN_NORMAL","token": "cfc651cb17485ac59e319857cd62d40a"}}
      ]""")
    )

	setUp(scn.inject(rampUsers(10000).during(100))).protocols(httpProtocol)
}
