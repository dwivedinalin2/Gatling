package api

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Notes extends Simulation{
  //protocol
  val httpProtocol= http.baseUrl("https://api.landau.app/")

  //scenario
  val scn1=scenario("Notes")
    .exec(
      http("Notes")
        .get("/v1/course/science-for-year-2-3/notes")
        .header("content-type","application/json").asJson
        .header("cookie","www._km_id=Si6SeZiAMgCxTeWzpt5bcXsvGTpResoZ; www._km_user_name=Ecstatic Salmon; www._km_lead_collection=false; _ga=GA1.1.948438684.1681706158; _gcl_au=1.1.374296669.1681906644; test._km_id=e4FJPXRbaOjqBjVWHjlVPaK6X4QTrpN2; test._km_user_name=Brainy Tuna; test._km_lead_collection=false; mp_dd869d175e080d94bf7c4a6219ccefea_mixpanel=%7B%22distinct_id%22%3A%20%22dwivedi.nalin2%40gmail.com%22%2C%22%24device_id%22%3A%20%2218718734cc26ac-0e969afaca2be4-1e525634-1ea000-18718734cc3d69%22%2C%22%24initial_referrer%22%3A%20%22https%3A%2F%2Fwww.linkedin.com%2F%22%2C%22%24initial_referring_domain%22%3A%20%22www.linkedin.com%22%2C%22%24user_id%22%3A%20%22dwivedi.nalin2%40gmail.com%22%7D; _fbp=fb.1.1683120324900.325171266; i18n_redirected=en; mp_dd869d175e080d94bf7c4a6219ccefea2_mixpanel=%7B%22distinct_id%22%3A%20%22dwivedi.nalin2%2Btest2%40gmail.com%22%2C%22%24device_id%22%3A%20%22187b350574fda6-02615f9be820cf-1d525634-1ea000-187b35057501190%22%2C%22%24initial_referrer%22%3A%20%22%24direct%22%2C%22%24initial_referring_domain%22%3A%20%22%24direct%22%2C%22%24user_id%22%3A%20%22dwivedi.nalin2%2Btest2%40gmail.com%22%7D; _km_id-5abf3e0316b8328fdb643b3beb5e5724=XbfqqjuJ3P1t4YVz1M30x6dLbT1JaZYE; _km_user_name-5abf3e0316b8328fdb643b3beb5e5724=Friendly Dolphin; _km_lead_collection-5abf3e0316b8328fdb643b3beb5e5724=false; accessToken=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMTQ2OSwic2Vzc2lvbiI6NjA0ODQ5MDU4LCJzaWciOiI2ZTU4OTk1MDU1NDYwZjBlOTIyYWYwMDRlMjgxN2EzY2Q0ZjNiNWQxIiwiaWF0IjoxNjg0ODYwNjY5LCJleHAiOjE3NzEyNjA2Njl9.JFTHii3g7xChHTPHYwcamOv-ulju9sjGrCducYlCQHCJrQ0CNqp2cBn8P4_pL5s-KwikIoHojdjlfJbup9jOOqCOAgDlh59iM3LB50SDqCRedtCoelGuTJBAh90K1X7aGQ27DL-3LCx89A9W5MOJTUxx1OmOCSCOFH2g7ObMiEANNbPUrHIrIi_VwZwcsFWH91Wl3TLHokEIuJYnd0FBsVZqrkanj0I6u9Z-Xxn8v8e9M9XZt_BRCdggqea-6wk98d_88UsnO0b9TNm35MFfFl_zI8tXXRqkbFZBnxtdMsf-ayaTsGWPnqAd7DnDo-Rbjwu-Lg7BGJ2qAHVde885IQ; _ga_SF65EQ14ZG=GS1.1.1684859823.81.1.1684860670.0.0.0; _ga_022BJ5VN28=GS1.1.1684860038.26.1.1684860670.0.0.0; Country=IN; mp_cfc651cb17485ac59e319857cd62d40a_mixpanel=%7B%22distinct_id%22%3A%20%22dwivedi.nalin2%2Bcancel1%40gmail.com%22%2C%22%24device_id%22%3A%20%221876ab3701410a5-05bc6d59b3a014-1d525634-1ea000-1876ab37015f0a%22%2C%22%24initial_referrer%22%3A%20%22%24direct%22%2C%22%24initial_referring_domain%22%3A%20%22%24direct%22%2C%22%24user_id%22%3A%20%22dwivedi.nalin2%2Bcancel1%40gmail.com%22%7D; activeProfile=8493").asJson
        .header("Landau-Token","gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
        .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMTQ2OSwic2Vzc2lvbiI6OTc4NDQ3ODcsInNpZyI6ImU4YTJhMTMwNTdjODY4ZmNhY2I1MzQ1MDI1NmI2ZjhlY2Y3OWYwY2QiLCJpYXQiOjE2OTA5OTM5NTcsImV4cCI6MTc3NzM5Mzk1N30.WFIyi3fIDVP6K1GVfDndnoVsJ1SXU9calZF9NaLnhI8aC4qU1QrYghPeaCrwUWMoogesX8OkkbcUkj3zKLNIBcmBB5XM4WpnFZORAG-BVGGBs11yUQY65wWJF60TPdr2uamjlODInROaQ4l97Y7_gMGnCR5UD-A5On4LSv1AXfGPwQeBriG8USQc_7MjlgfuwsDflcl6esJscQR5d6dAjFKZi1iwBl1PWTBu68u60LO8GA3ez2bDDGvEs5GvwNwHRgM3K_ehHOR--0AwkYsypa28u41klrFCHVdwo-a43HUfot0xVHHpaqBYN_LHIHO1yjxZX9MfgQjl_IXmBTqT8g")
        .check(
          status is 200,
          jsonPath("$.status") is "success"
        )
    )

  //setup
  setUp(
    scn1.inject(rampUsers(100000).during(600))
      .protocols(httpProtocol)
  )
}
