package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Chemistry extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://www.landau.app")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*"""))
  
  private val headers_0 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "same-origin",
  		"sec-fetch-user" -> "?1",
  		"upgrade-insecure-requests" -> "1",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36"
  )
  
  private val headers_2 = Map(
  		"accept" -> "application/json",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"authorization" -> "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMDk4NCwic2Vzc2lvbiI6Mzk4MDIyOTc3LCJzaWciOiJhNTI5MDU3MDI5MGFhNjdkZGY4YjQ1NzM4NTIwYzZjMzY5YmE2MWUwIiwiaWF0IjoxNjgxMTI0NDM0LCJleHAiOjE3Njc1MjQ0MzR9.UCOnRAe_IgpxR815w3ZB-2cAfACgzQidY4q54t91Ol8022UNZZLPmg316tysfiftJlNq1349RLrwrFgzmnLjEihr3jlWy7oRYGvT2DL6vfNOUNNSi5dlFjDbyEpl8X0SYQIQp1a8GMvn-W3atQZ2R0MxNvoijPHga1gj24PSgNvMPn1zNrjWhbRjQL6vOEcNxkpNkSaSxRC6Szs1Wqe45b9e2C7i_q5hz-ypwMZqB7UysiMZx1WgA2NHMnZUztlAMU1LD1nTSn3VLBrj4-lNBUSuFJAppg4bQ9ZI_By3h1GFq9K1aOtMcWBGedDlCvLhfLDknRq6emJVnTCJ-A-wIA",
  		"country" -> "IN",
  		"language" -> "en",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36"
  )
  
  private val headers_3 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"content-type" -> "text/plain;charset=UTF-8",
  		"origin" -> "https://www.landau.app",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36"
  )
  
  private val headers_4 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "manifest",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36"
  )
  
  private val headers_7 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"origin" -> "https://www.landau.app",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36"
  )
  
  private val headers_10 = Map(
  		"accept" -> "application/json",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"authorization" -> "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMDk4NCwic2Vzc2lvbiI6Mzk4MDIyOTc3LCJzaWciOiJhNTI5MDU3MDI5MGFhNjdkZGY4YjQ1NzM4NTIwYzZjMzY5YmE2MWUwIiwiaWF0IjoxNjgxMTI0NDM0LCJleHAiOjE3Njc1MjQ0MzR9.UCOnRAe_IgpxR815w3ZB-2cAfACgzQidY4q54t91Ol8022UNZZLPmg316tysfiftJlNq1349RLrwrFgzmnLjEihr3jlWy7oRYGvT2DL6vfNOUNNSi5dlFjDbyEpl8X0SYQIQp1a8GMvn-W3atQZ2R0MxNvoijPHga1gj24PSgNvMPn1zNrjWhbRjQL6vOEcNxkpNkSaSxRC6Szs1Wqe45b9e2C7i_q5hz-ypwMZqB7UysiMZx1WgA2NHMnZUztlAMU1LD1nTSn3VLBrj4-lNBUSuFJAppg4bQ9ZI_By3h1GFq9K1aOtMcWBGedDlCvLhfLDknRq6emJVnTCJ-A-wIA",
  		"country" -> "IN",
  		"language" -> "en",
  		"origin" -> "https://www.landau.app",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36"
  )
  
  private val headers_19 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "script",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
  		"x-client-data" -> "CIm2yQEIprbJAQjEtskBCKmdygEIi/rKAQiWocsBCJr+zAEI5JfNAQiGoM0BCL2izQEY1J3NAQ=="
  )
  
  private val headers_21 = Map(
  		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "image",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36"
  )
  
  private val headers_22 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"origin" -> "null",
  		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36"
  )
  
  private val uri1 = "https://o506973.ingest.sentry.io/api/5598097/store"
  
  private val uri2 = "https://static.landau.app/thumbnail/course/FE03B860-F6CA-463B-95F9-F89BBC20912F.jpg"
  
  private val uri3 = "https://api.mixpanel.com/track"
  
  private val uri4 = "https://videos-cloudfront.jwpsrv.com/6434b04b_c787046ddbb3b57c1017bd3d9c9ad97eb7341ae8/content/conversions/3w6L0UeF/videos"
  
  private val uri5 = "https://cdn.jwplayer.com"
  
  private val uri7 = "https://assets-jpcust.jwpsrv.com/tracks/0tJIYiQ7.vtt"
  
  private val uri8 = "https://prd.jwpltx.com/v1/jwplayer6/ping.gif"
  
  private val uri9 = "https://www.gstatic.com/cv/js/sender/v1/cast_sender.js"

  private val scn = scenario("RecordedSimulation")
    .exec(
      http("request_0")
        .get("/courses/science-for-year-2-3?tab=content")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get(uri2 + "?st=I3CQ3ZKKDLEzd8PWtB4Sfw&expires=1657488123"),
          http("request_2")
            .get("/api/course/science-for-year-2-3/unitsV2")
            .headers(headers_2),
          http("request_3")
            .post(uri1 + "/?sentry_key=6cdcc07a2a0a4961951744d95912159c&sentry_version=7")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/recordedsimulation/0003_request.json")),
          http("request_4")
            .get("/site.webmanifest")
            .headers(headers_4)
        )
    )
    .pause(2)
    .exec(
      http("request_5")
        .get("/api/chapter/1071/lessons")
        .headers(headers_2)
        .resources(
          http("request_6")
            .get("/api/chapter/1071/lessons")
            .headers(headers_2),
          http("request_7")
            .post(uri3 + "/?verbose=1&ip=1&_=1681131398713")
            .headers(headers_7)
            .formParam("data", """[
              {"event": "COURSE_OPENED","properties": {"$os": "Mac OS X","$browser": "Chrome","$referrer": "https://www.landau.app/learn","$referring_domain": "www.landau.app","$current_url": "https://www.landau.app/courses/science-for-year-2-3?tab=content","$browser_version": 112,"$screen_height": 1120,"$screen_width": 1792,"mp_lib": "web","$lib_version": "2.45.0","$insert_id": "6ho1wmyb2695dgn9","time": 1681131393.804,"distinct_id": "dwivedi.nalin2+b2@gmail.com","$device_id": "1876ab3701410a5-05bc6d59b3a014-1d525634-1ea000-1876ab37015f0a","$initial_referrer": "$direct","$initial_referring_domain": "$direct","$user_id": "dwivedi.nalin2+b2@gmail.com","NAME": "Science For Year 2","token": "cfc651cb17485ac59e319857cd62d40a"}}
          ]"""),
          http("request_8")
            .get("/api/chapter/1071/lessons")
            .headers(headers_2),
          http("request_9")
            .get("/api/lesson/plants-and-animals-in-hot-countries-1690069068/getCaptions")
            .headers(headers_2),
          http("request_10")
            .patch("/api/course/science-for-year-2-3")
            .headers(headers_10),
          http("request_11")
            .get("/api/course/science-for-year-2-3/lesson/plants-and-animals-in-hot-countries-1690069068")
            .headers(headers_2),
          http("request_12")
            .get("/api/course/science-for-year-2-3/notes")
            .headers(headers_2),
          http("request_13")
            .get("/api/chapter/undefined/lessons")
            .headers(headers_2)
            .check(status.is(500)),
          http("request_14")
            .post(uri1 + "/?sentry_key=6cdcc07a2a0a4961951744d95912159c&sentry_version=7")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/recordedsimulation/0014_request.json")),
          http("request_15")
            .get("/api/course/science-for-year-2-3/lesson/plants-and-animals-in-hot-countries-1690069068/notes")
            .headers(headers_2),
          http("request_16")
            .get("/api/lesson/plants-and-animals-in-hot-countries-1690069068/games")
            .headers(headers_2),
          http("request_17")
            .get("/api/course/science-for-year-2-3/lesson/plants-and-animals-in-hot-countries-1690069068/tests")
            .headers(headers_2),
          http("request_18")
            .get(uri5 + "/tracks/0tJIYiQ7.vtt")
            .headers(headers_7),
          http("request_19")
            .get(uri9 + "?loadCastFramework=1")
            .headers(headers_19),
          http("request_20")
            .get(uri5 + "/manifests/TTIBKfQ2.m3u8")
            .headers(headers_7),
          http("request_21")
            .get(uri8 + "?h=1883425813&e=pa&n=2523795964565325&aid=tK3Q1FmxEeuM18Jgw6Rjlg&amp=0&at=1&c=-1&ccp=0&cp=0&d=2&eb=1&ed=6&emi=m0i5al44ykco&i=0&id=TTIBKfQ2&lid=11nro9wbaj39&lsa=read&mt=0&pbd=1&pbr=1&pgi=15nn1xzoay65&ph=1&pid=6yxMz0m1&pii=0&pl=369&plc=1&pli=9ajiwq1yo06q&pp=hlsjs&prc=1&ps=4&pss=1&pt=Science%20For%20Year%202%20%7C%20Landau%20School&pu=https%3A%2F%2Fwww.landau.app%2Fcourses%2Fscience-for-year-2-3%3Ftab%3Dcontent%26lesson%3Dplants-and-animals-in-hot-countries-1690069068&pv=8.26.9&pyc=0&s=0&sdk=0&stc=1&stpe=0&tv=3.42.1&vb=1&vi=1&vl=90&wd=655&ab=0&bwe=16718&cme=0&flc=0&mu=https%3A%2F%2Fcdn.jwplayer.com%2Fmanifests%2FTTIBKfQ2.m3u8&pd=2&pdr=https%3A%2F%2Fwww.landau.app%2Flearn&plng=en-IN&pni=0&pogt=Start%20Learning%20with%20Landau&pr=7&tb=0&vd=0&sa=1681131402764")
            .headers(headers_21),
          http("request_22")
            .get(uri7)
            .headers(headers_22),
          http("request_23")
            .get(uri4 + "/TTIBKfQ2-33683005.mp4.m3u8")
            .headers(headers_7),
          http("request_24")
            .get(uri4 + "/TTIBKfQ2-33683005.mp4-1.ts")
            .headers(headers_7),
          http("request_25")
            .post(uri3 + "/?verbose=1&ip=1&_=1681131404052")
            .headers(headers_7)
            .formParam("data", """[
              {"event": "LESSON","properties": {"$os": "Mac OS X","$browser": "Chrome","$referrer": "https://www.landau.app/learn","$referring_domain": "www.landau.app","$current_url": "https://www.landau.app/courses/science-for-year-2-3?tab=content&lesson=plants-and-animals-in-hot-countries-1690069068","$browser_version": 112,"$screen_height": 1120,"$screen_width": 1792,"mp_lib": "web","$lib_version": "2.45.0","$insert_id": "8gp13hlo4vtl6j4a","time": 1681131401.173,"distinct_id": "dwivedi.nalin2+b2@gmail.com","$device_id": "1876ab3701410a5-05bc6d59b3a014-1d525634-1ea000-1876ab37015f0a","$initial_referrer": "$direct","$initial_referring_domain": "$direct","$user_id": "dwivedi.nalin2+b2@gmail.com","NAME": "Plants and animals in hot countries","token": "cfc651cb17485ac59e319857cd62d40a"}}
          ]"""),
          http("request_26")
            .get(uri4 + "/TTIBKfQ2-33683005.mp4-2.ts")
            .headers(headers_7),
          http("request_27")
            .get(uri8 + "?h=-2006871653&e=s&n=3507325222872306&aid=tK3Q1FmxEeuM18Jgw6Rjlg&amp=0&at=1&c=-1&ccp=0&cp=0&d=2&eb=1&ed=6&emi=m0i5al44ykco&i=0&id=TTIBKfQ2&lid=11nro9wbaj39&lsa=read&mt=0&pbd=1&pbr=1&pgi=15nn1xzoay65&ph=1&pid=6yxMz0m1&pii=0&pl=369&plc=1&pli=9ajiwq1yo06q&pp=hlsjs&ppm=VOD&prc=1&ps=4&pss=1&pt=Science%20For%20Year%202%20%7C%20Landau%20School&pu=https%3A%2F%2Fwww.landau.app%2Fcourses%2Fscience-for-year-2-3%3Ftab%3Dcontent%26lesson%3Dplants-and-animals-in-hot-countries-1690069068&pv=8.26.9&pyc=1&s=0&sdk=0&stc=1&stpe=0&tv=3.42.1&vb=1&vi=1&vl=90&wd=655&abm=1&bwe=16718&cae=0&cct=1&ch=2&cdid=player&drm=0&ff=1390&fsm=0&l=3&mk=hls&mu=https%3A%2F%2Fcdn.jwplayer.com%2Fmanifests%2FTTIBKfQ2.m3u8&pcp=0&pd=2&pdr=https%3A%2F%2Fwww.landau.app%2Flearn&plng=en-IN&pni=0&pr=7&q=32&qcr=initial%20choice&sbr=440&sp=0&strt=1400&tb=4&tt=0&vd=487&vh=720&vs=5&vw=1280&sa=1681131404164")
            .headers(headers_21),
          http("request_28")
            .get(uri4 + "/TTIBKfQ2-33683005.mp4-3.ts")
            .headers(headers_7),
          http("request_29")
            .get(uri4 + "/TTIBKfQ2-33683005.mp4-4.ts")
            .headers(headers_7),
          http("request_30")
            .get(uri4 + "/TTIBKfQ2-33683005.mp4-5.ts")
            .headers(headers_7),
          http("request_31")
            .get(uri4 + "/TTIBKfQ2-33683005.mp4-6.ts")
            .headers(headers_7),
          http("request_32")
            .get(uri4 + "/TTIBKfQ2-33683005.mp4-7.ts")
            .headers(headers_7),
          http("request_33")
            .get("/api/chapter/1071/lessons")
            .headers(headers_2)
        )
    )
    .pause(1)
    .exec(
      http("request_34")
        .get("/api/chapter/1073/lessons")
        .headers(headers_2)
        .resources(
          http("request_35")
            .get("/api/course/science-for-year-2-3/lesson/what-are-rocks-2034342321")
            .headers(headers_2)
            .check(status.is(403)),
          http("request_36")
            .post(uri1 + "/?sentry_key=6cdcc07a2a0a4961951744d95912159c&sentry_version=7")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/recordedsimulation/0036_request.json"))
        )
    )
    .pause(10)
    .exec(
      http("request_37")
        .get(uri4 + "/TTIBKfQ2-33683005.mp4-8.ts")
        .headers(headers_7)
    )

	setUp(scn.inject(rampUsers(800).during(100))).protocols(httpProtocol)
}
