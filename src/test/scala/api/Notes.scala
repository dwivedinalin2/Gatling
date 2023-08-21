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
        .header("cookie","_ga=GA1.1.948438684.1681706158; mp_dd869d175e080d94bf7c4a6219ccefea_mixpanel=%7B%22distinct_id%22%3A%20%22dwivedi.nalin2%40gmail.com%22%2C%22%24device_id%22%3A%20%2218718734cc26ac-0e969afaca2be4-1e525634-1ea000-18718734cc3d69%22%2C%22%24initial_referrer%22%3A%20%22https%3A%2F%2Fwww.linkedin.com%2F%22%2C%22%24initial_referring_domain%22%3A%20%22www.linkedin.com%22%2C%22%24user_id%22%3A%20%22dwivedi.nalin2%40gmail.com%22%7D; _km_id-5abf3e0316b8328fdb643b3beb5e5724=XbfqqjuJ3P1t4YVz1M30x6dLbT1JaZYE; _km_user_name-5abf3e0316b8328fdb643b3beb5e5724=Friendly Dolphin; _km_lead_collection-5abf3e0316b8328fdb643b3beb5e5724=false; i18n_redirected=en; mp_dd869d175e080d94bf7c4a6219ccefea2_mixpanel=%7B%22distinct_id%22%3A%20%22dwivedi.nalin2%2Btest2%40gmail.com%22%2C%22%24device_id%22%3A%20%22187b350574fda6-02615f9be820cf-1d525634-1ea000-187b35057501190%22%2C%22%24initial_referrer%22%3A%20%22%24direct%22%2C%22%24initial_referring_domain%22%3A%20%22%24direct%22%2C%22%24user_id%22%3A%20%22dwivedi.nalin2%2Btest2%40gmail.com%22%7D; _gcl_au=1.1.1569248642.1689685404; push30._km_id-5abf3e0316b8328fdb643b3beb5e5724=866cs6q5v8SEvFY7Ab1qIUAjr0e4BcOT; push30._km_user_name-5abf3e0316b8328fdb643b3beb5e5724=Witty Cod; push30._km_lead_collection-5abf3e0316b8328fdb643b3beb5e5724=false; amp_6e403e=x3Jt34BkWM7tLw3j0B1veQ...1h6p46k74.1h6p46k74.0.0.0; _ga_022BJ5VN28=GS1.1.1691001771.47.0.1691001771.0.0.0; Country=IN; intended=%2F; Partner=landau.app; mp_cfc651cb17485ac59e319857cd62d40a_mixpanel=%7B%22distinct_id%22%3A%20%22dwivedi.nalin2%2Bb5%40gmail.com%22%2C%22%24device_id%22%3A%20%221876ab3701410a5-05bc6d59b3a014-1d525634-1ea000-1876ab37015f0a%22%2C%22%24initial_referrer%22%3A%20%22%24direct%22%2C%22%24initial_referring_domain%22%3A%20%22%24direct%22%2C%22%24user_id%22%3A%20%22dwivedi.nalin2%2Bb5%40gmail.com%22%7D; _ga_SF65EQ14ZG=GS1.1.1692638092.193.0.1692638092.0.0.0").asJson
        .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMTQ2OSwic2Vzc2lvbiI6MjA0NTc3MTY1Miwic2lnIjoiZDEwZTdlMzgxZTYxMjk2YjhhOGFiNjFmZGZlYmJiZWYwZTI5ZjFmYSIsImlhdCI6MTY5MjYzMjcxOSwiZXhwIjoxNzc5MDMyNzE5fQ.5VwrGgrbqLxKNWu5zLVcIRe_ajpVq7Q0vVYgALwtE07GvbTj99lSOWPV8eiIcibGTZD8ePxrs6w78E0InKxf0Au3fXBFAAqbs-xvb10F2CHZeVoM53kAEjHcLIc4ABKYPapp6zeVXToq4ccvMN77rofIPSeBKusH0KD5YCDy0_1zAyl85MzF3Sxg2bLvHu3BZfFHbHP_cXn9pT4yG_-M9R76lYIXmcIJceedGIE6xvomxjAIwVQSjlCHHswENDLoHV0ea-CKX24SsHTmQ5yqoLgAmTaciNBYnodcba3Be4xDQoExMHjRPGVYP2eWZBpAaiUMkB1BRjvMV3LYT-NJVA").asJson
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
