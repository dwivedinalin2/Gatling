
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class AmazonTest2 extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://m.media-amazon.com")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*\.svg""", """.*detectportal\.firefox\.com.*"""))
  
  private val headers_16 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"device-memory" -> "8",
  		"downlink" -> "10",
  		"dpr" -> "2",
  		"ect" -> "4g",
  		"origin" -> "https://www.amazon.in",
  		"rtt" -> "50",
  		"sec-ch-device-memory" -> "8",
  		"sec-ch-dpr" -> "2",
  		"sec-ch-ua" -> """Google Chrome";v="111", "Not(A:Brand";v="8", "Chromium";v="111""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-ch-ua-platform-version" -> "13.2.1",
  		"sec-ch-viewport-width" -> "1792",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36",
  		"viewport-width" -> "1792",
  		"x-requested-with" -> "XMLHttpRequest"
  )
  
  private val headers_17 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"device-memory" -> "8",
  		"downlink" -> "10",
  		"dpr" -> "2",
  		"ect" -> "4g",
  		"rtt" -> "50",
  		"sec-ch-device-memory" -> "8",
  		"sec-ch-dpr" -> "2",
  		"sec-ch-ua" -> """Google Chrome";v="111", "Not(A:Brand";v="8", "Chromium";v="111""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-ch-ua-platform-version" -> "13.2.1",
  		"sec-ch-viewport-width" -> "1792",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "same-origin",
  		"sec-fetch-user" -> "?1",
  		"upgrade-insecure-requests" -> "1",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36",
  		"viewport-width" -> "1792"
  )
  
  private val headers_18 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"device-memory" -> "8",
  		"downlink" -> "10",
  		"dpr" -> "2",
  		"ect" -> "4g",
  		"rtt" -> "50",
  		"sec-ch-device-memory" -> "8",
  		"sec-ch-dpr" -> "2",
  		"sec-ch-ua" -> """Google Chrome";v="111", "Not(A:Brand";v="8", "Chromium";v="111""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS",
  		"sec-ch-ua-platform-version" -> "13.2.1",
  		"sec-ch-viewport-width" -> "1792",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36",
  		"viewport-width" -> "1792"
  )
  
  private val headers_25 = Map(
  		"Accept" -> "*/*",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"Origin" -> "https://www.amazon.in",
  		"Sec-Fetch-Dest" -> "empty",
  		"Sec-Fetch-Mode" -> "cors",
  		"Sec-Fetch-Site" -> "same-site",
  		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36",
  		"sec-ch-ua" -> """Google Chrome";v="111", "Not(A:Brand";v="8", "Chromium";v="111""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS"
  )
  
  private val headers_26 = Map(
  		"Accept" -> "*/*",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,mr;q=0.6,hi;q=0.5",
  		"Sec-Fetch-Dest" -> "script",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "cross-site",
  		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36",
  		"sec-ch-ua" -> """Google Chrome";v="111", "Not(A:Brand";v="8", "Chromium";v="111""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "macOS"
  )
  
  private val uri1 = "https://www.amazon.in"
  
  private val uri3 = "https://aax-eu.amazon.in/e/xsp/getAdj"
  
  private val uri4 = "https://images-eu.ssl-images-amazon.com/images"
  
  private val uri5 = "https://origin-completion.amazon.in/api/2017/suggestions"

  private val scn = scenario("AmazonTest2")
    .exec(
      http("request_0")
        .get("/images/I/11EIQ5IGqaL._RC%7C01ZTHTZObnL.css,41tGz3DNCrL.css,31ufSReDtSL.css,013z33uKh2L.css,017DsKjNQJL.css,0131vqwP5UL.css,41EWOOlBJ9L.css,11TIuySqr6L.css,01ElnPiDxWL.css,11fJbvhE5HL.css,01Dm5eKVxwL.css,01IdKcBuAdL.css,01y-XAlI+2L.css,21P6CS3L9LL.css,01oDR3IULNL.css,41Axm2+z87L.css,01XPHJk60-L.css,01S0vRENeAL.css,21IbH+SoKSL.css,11MrAKjcAKL.css,21fecG8pUzL.css,11a5wZbuKrL.css,01CFUgsA-YL.css,31C80IiXalL.css,11qour3ND0L.css,116t+WD27UL.css,11gKCCKQV+L.css,11061HxnEvL.css,11oHt2HYxnL.css,01j2JE3j7aL.css,11JQtnL-6eL.css,21KA2rMsZML.css,11jtXRmppwL.css,0114z6bAEoL.css,21uwtfqr5aL.css,11QyqG8yiqL.css,11K24eOJg4L.css,11F2+OBzLyL.css,01890+Vwk8L.css,11Y05DTEL6L.css,01cbS3UK11L.css,21F85am0yFL.css,01giMEP+djL.css_.css?AUIClients/AmazonUI&HhSLiqVJ")
        .resources(
          http("request_1")
            .get(uri4 + "/I/41H4XraWzVL._RC%7C71HWFfRdLgL.css,41VtAmDG4YL.css,11OsNOdrK6L.css,31yYV8flaYL.css,313Ydl5aIRL.css,21MKjoYL8wL.css,41yQj5y2obL.css,01yCq3WXEcL.css,110Nj+wUGYL.css,31OvHRW+XiL.css,01R53xsjpjL.css,11iUHDm4--L.css,41yKpEQVJkL.css,01YWmXMYw8L.css_.css?AUIClients/NavDesktopUberAsset&K24FpliC"),
          http("request_2")
            .get(uri4 + "/I/4171sdbgqbL.css?AUIClients/AmazonGatewayAuiAssets"),
          http("request_3")
            .get("/images/I/61ZS63EQSsL.js?AUIClients/AmazonUIjQuery"),
          http("request_4")
            .get(uri4 + "/I/01rGP6HIADL.js?AUIClients/GenericObservableJS"),
          http("request_5")
            .get(uri4 + "/I/11y85pohsPL._RC%7C41jWkdimWrL.js_.js?AUIClients/AmazonGatewayAuiAssets"),
          http("request_6")
            .get(uri4 + "/I/31YI0nnbQAL.js?AUIClients/AmazonGatewayHerotatorJS"),
          http("request_7")
            .get(uri4 + "/S/apesafeframe/ape/sf/desktop/DAsf-1.50.c6027d1.js?csm_attribution=APE-SafeFrame"),
          http("request_8")
            .get(uri4 + "/S/apesafeframe/ape/sf/whitelisted/desktop/sf-1.50.c6027d1.html"),
          http("request_9")
            .get(uri4 + "/I/412HK5CgpXL._RC%7C715gJL4znLL.js,01CMfWXyHeL.js,01phmzCOwJL.js,01eOvPdxG7L.js,71yRGR0uBKL.js,41gNKoK0s7L.js,115pV8Rl02L.js,01+pnQJuQ0L.js,21+aV0AEB8L.js,11k47yUMOjL.js,41rU9l+NGKL.js,51t-JTxfnwL.js,317BC63dC8L.js,11lEMI5MhIL.js,31c7Fn9h9gL.js,01LEzWzrPZL.js,01AqeWA7PKL.js_.js?AUIClients/NavDesktopUberAsset&OATCHt9P"),
          http("request_10")
            .get(uri4 + "/I/11n+6Al2-WL.js?xcp"),
          http("request_11")
            .get(uri4 + "/I/41pO9n54vSL.js?xcp"),
          http("request_12")
            .get(uri4 + "/I/215ieazFO0L.js?xcp"),
          http("request_13")
            .get(uri4 + "/I/01mBlWDp3NL.js?xcp"),
          http("request_14")
            .get("/images/I/51EIwpasq4L.js?AUIClients/CardJsRuntimeBuzzCopyBuild"),
          http("request_15")
            .get("/images/I/11Y+5x+kkTL._RC%7C51Am7NcREVL.js,11yKORv-GTL.js,11GgN1+C7hL.js,01+z+uIeJ-L.js,01VRMV3FBdL.js,21SDJtBU-PL.js,012FVc3131L.js,11rRjDLdAVL.js,516j7qaWchL.js,11kWu3cNjYL.js,11wr1I7-WYL.js,11OREnu1epL.js,11Wm6BwZ+6L.js,21ssiLNIZvL.js,0190vxtlzcL.js,51+N26vFcBL.js,01JYHc2oIlL.js,31nfKXylf6L.js,01ezj5Rkz1L.js,11bEz2VIYrL.js,31o2NGTXThL.js,01rpauTep4L.js,01XC3MnuvfL.js_.js?AUIClients/AmazonUI&MFdCk5El"),
          http("request_16")
            .post(uri1 + "/ah/ajax/counter?ctr=desktop_ajax_atf&exp=1680796484833&rId=D708X5673QTQ8S6CEX2K&mkId=A21TJRUUN4KGV&h=9503b45497c64df0bded043f4a98f6f2590a23e52b810752a0578551d40f3b6b")
            .headers(headers_16),
          http("request_17")
            .get(uri1 + "/ref=nav_logo")
            .headers(headers_17),
          http("request_18")
            .get(uri1 + "/af/feedback-link?pl=%7B%22adPlacementMetaData%22%3A%7B%22pageUrl%22%3A%22aHR0cHM6Ly93d3cuYW1hem9uLmluL3JlZj1uYXZfbG9nbz8%3D%22%2C%22adElementId%22%3A%22ape_Gateway_right-2_desktop_placement%22%2C%22pageType%22%3A%22Gateway%22%2C%22slotName%22%3A%22right-2%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adProgramId%22%3A%221027%22%2C%22adCreativeId%22%3A%220%22%2C%22adNetwork%22%3A%22cs%22%7D%7D")
            .headers(headers_18),
          http("request_19")
            .get(uri4 + "/I/11GosR48e3L.js?xcp"),
          http("request_20")
            .get(uri4 + "/I/01qqGFb4mKL.js?xcp"),
          http("request_21")
            .get(uri4 + "/S/apesafeframe/ape/sf/whitelisted/desktop/sf-1.50.c6027d1.html"),
          http("request_22")
            .get(uri1 + "/af/feedback-link?pl=%7B%22adPlacementMetaData%22%3A%7B%22pageUrl%22%3A%22aHR0cHM6Ly93d3cuYW1hem9uLmluL3JlZj1uYXZfbG9nbz8%3D%22%2C%22adElementId%22%3A%22ape_Gateway_desktop-ad-center-1_desktop_placement%22%2C%22pageType%22%3A%22Gateway%22%2C%22slotName%22%3A%22desktop-ad-center-1%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adProgramId%22%3A%221027%22%2C%22adCreativeId%22%3A%220%22%2C%22adNetwork%22%3A%22cs%22%7D%7D")
            .headers(headers_18),
          http("request_23")
            .get(uri4 + "/I/113mXmMm69L.css?xcp"),
          http("request_24")
            .get(uri4 + "/I/11oFnIMXIiL.css?xcp"),
          http("request_25")
            .head(uri5)
            .headers(headers_25),
          http("request_26")
            .get(uri3 + "?placementId=e44985f6-46f4-4231-90aa-f5c16f7c50aa&src=511&slot=desktop-ad-center-1&rid=0101c00ce28b5294999d2259925c9d0dc53a762519aa0fd5c2299455197e85c10707&rj=%7B%22shouldRenderAbpAcceptableCreative%22%3Atrue%7D&callback=aax_xsp_render_ad")
            .headers(headers_26),
          http("request_27")
            .get(uri3 + "?placementId=589e332a-17d0-4382-b320-05e6f4ddc521&src=511&slot=right-2&rid=0101c00ce28b5294999d2259925c9d0dc53a762519aa0fd5c2299455197e85c10707&rj=%7B%22shouldRenderAbpAcceptableCreative%22%3Atrue%7D&callback=aax_xsp_render_ad")
            .headers(headers_26)
        )
    )

	setUp(scn.inject(rampUsers(10).during(10))).protocols(httpProtocol)
}
