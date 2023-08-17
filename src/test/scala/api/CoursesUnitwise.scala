package api

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._


class CoursesUnitwise extends Simulation{


  //protocol
  val httpProtocol= http.baseUrl("https://www.landau.app")

  //scenario
  val scn1=scenario("Course Unit wise")
    .exec(
      http("Course Unit wise")
        .get("/api/course/maths-for-year-2-1/unitsV2")
        .header("content-type","application/json").asJson
        .header("Accept","application/json").asJson
        .header("Landau-Token","gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
        .header("cookie","_ga=GA1.1.948438684.1681706158; _gcl_au=1.1.374296669.1681906644; mp_dd869d175e080d94bf7c4a6219ccefea_mixpanel=%7B%22distinct_id%22%3A%20%22dwivedi.nalin2%40gmail.com%22%2C%22%24device_id%22%3A%20%2218718734cc26ac-0e969afaca2be4-1e525634-1ea000-18718734cc3d69%22%2C%22%24initial_referrer%22%3A%20%22https%3A%2F%2Fwww.linkedin.com%2F%22%2C%22%24initial_referring_domain%22%3A%20%22www.linkedin.com%22%2C%22%24user_id%22%3A%20%22dwivedi.nalin2%40gmail.com%22%7D; _fbp=fb.1.1683120324900.325171266; _km_id-5abf3e0316b8328fdb643b3beb5e5724=XbfqqjuJ3P1t4YVz1M30x6dLbT1JaZYE; _km_user_name-5abf3e0316b8328fdb643b3beb5e5724=Friendly Dolphin; _km_lead_collection-5abf3e0316b8328fdb643b3beb5e5724=false; test._km_id-5abf3e0316b8328fdb643b3beb5e5724=e4FJPXRbaOjqBjVWHjlVPaK6X4QTrpN2; test._km_user_name-5abf3e0316b8328fdb643b3beb5e5724=Brainy Tuna; test._km_lead_collection-5abf3e0316b8328fdb643b3beb5e5724=false; push30._km_id-5abf3e0316b8328fdb643b3beb5e5724=YMzzlpO1D3qECgV8W8G03BH8pDJjc5DH; push30._km_user_name-5abf3e0316b8328fdb643b3beb5e5724=Reliable Tuna; push30._km_lead_collection-5abf3e0316b8328fdb643b3beb5e5724=false; i18n_redirected=en; mp_dd869d175e080d94bf7c4a6219ccefea2_mixpanel=%7B%22distinct_id%22%3A%20%22dwivedinalin2%40gmail.com%22%2C%22%24device_id%22%3A%20%22187b350574fda6-02615f9be820cf-1d525634-1ea000-187b35057501190%22%2C%22%24initial_referrer%22%3A%20%22%24direct%22%2C%22%24initial_referring_domain%22%3A%20%22%24direct%22%2C%22%24user_id%22%3A%20%22dwivedinalin2%40gmail.com%22%7D; _ga_022BJ5VN28=GS1.1.1687588200.41.1.1687588422.0.0.0; Country=IN; Partner=landau.app; accessToken=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMTQ2OSwic2Vzc2lvbiI6ODUxODgzMSwic2lnIjoiMTNlYTgwOTRkYjk2ODU2ZTU3ODRkNzg2OGQyZDA0YzAxMzlkYzU3MyIsImlhdCI6MTY4Nzg1Njk2MCwiZXhwIjoxNzc0MjU2OTYwfQ.NVwTM2hrstY5k1jZqZLKu9HeRBSmFwTbz77mZmNKsiLuQKMeIW7UAnxU4kqNL4jdnCTaPsnGUEErWSyCBHBqE8PCFA9C7-OFxo2dEkEKWW2ztUEdJKxO7LmBW5IANeP__UT3ZBkkzGVERlnhf-Bgy25uV8rei_cMlQJhjSX72Cdluqg6ooKQolWPcGg7uIM1s9EBMukxkJ-CZIFj7Q01oKouJ4nRhi_UrUmSdk1hwCcZE7pSkZ3E0zFayQRp-vhdDcD3q0WPsBl-xHdrsBHc5sd094IelGbJymOb0Qm8FmFZt4XIBcOSmPplssK1FPz4Dg-G6LXgxUPvNgjYOqidKw; _ga_SF65EQ14ZG=GS1.1.1687856464.134.1.1687856960.0.0.0; mp_cfc651cb17485ac59e319857cd62d40a_mixpanel=%7B%22distinct_id%22%3A%20%22dwivedi.nalin2%40gmail.com%22%2C%22%24device_id%22%3A%20%221876ab3701410a5-05bc6d59b3a014-1d525634-1ea000-1876ab37015f0a%22%2C%22%24initial_referrer%22%3A%20%22%24direct%22%2C%22%24initial_referring_domain%22%3A%20%22%24direct%22%2C%22%24user_id%22%3A%20%22dwivedi.nalin2%40gmail.com%22%7D; activeProfile=8493").asJson
        .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMTQ2OSwic2Vzc2lvbiI6MTA2MDI1NTkxMywic2lnIjoiNGJlNGYzODhkZTA3YjBjN2VkNWY5M2E1NDg1ZjJlYTI1ZTkzNjJhZCIsImlhdCI6MTY4Nzg1Njc5NSwiZXhwIjoxNzc0MjU2Nzk1fQ.5Un-VXkQY-5WRrrsHK32aoiSN8y_ZUzLO7BZAHIw1Vc10KBjqhhrIKh6QANo-2m75tRSvJEfI4kCKX8GxQIu9lbEuUiKmKXpXayL-X6BmeIFjSvzvFQHqbL9oLYtoOeCKwxx1hZc3ElWBmcJW9gG2KrmbGXn0eSNGNk3Nt3n1nvcBsNq0poJyxlxKP0B4Hobvh7E-r93TMpbV8UrCh9kPOX3kvJvQ9tzugHjTwewjYQj7_8MwMxt6plsclvxptslR9Aae2pe0FvlB7tcXIRittbT22wC9-AGOQdJSoe5aJumNd9W1u8jJ-Pu9pw6ohQesU4ejE6wlZivLjZCk0UffQ").asJson
        .check(
          status is 200
        )
    )

  //setup
  setUp(
    scn1.inject(rampUsers(50000).during(500))
      .protocols(httpProtocol)
  )

}
