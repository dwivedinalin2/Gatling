package api

import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Userdata extends Simulation{
  //protocol
  val httpProtocol= http.baseUrl("https://api.landau.app/")

  //scenario
  val scn1=scenario("Get user")
    .exec(
      http("Get user")
        .get("/v1/user")
        .header("content-type","application/json").asJson
        .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMTQ2OSwic2Vzc2lvbiI6MTQwODk2ODE0OCwic2lnIjoiNzkxNDc0ZmUwNjJlODUzNTFjNjIwMDYzMmYxZDI3ODU3YjMzZDcxMCIsImlhdCI6MTY4NDg2MjE3MSwiZXhwIjoxNzcxMjYyMTcxfQ.t06q46ySAMmRKLMNjrzonskuv75ZfO0ecsD8kBwPRES_SS4jcujOE2atBH71l9dkJ1h_xYkPZRuAxQNwhLv4uv8Gge1ibLQ_aLovhyI-YJQH8XO_jAvLAoRzGTkpA3ncvyi21KFkvXduTx_-DQXZjXzJ50ICDIIp8tAU0dV8UuOjFTRGaURKaudP3xoXeqJxMLxXfTdj1IY11aPZDXSN3S2_OHQ-bsG_fIQ2cTVxGZDY11rTEHCe-S2yC_3tEMK-awLmxd6yZLh0AD-OeziwnBprRNzzAaBWvrrDmSt_E2RrrKgc0JiVcihjVEZCowDbSG9VL7plT6rIHux8WNCBPA").asJson
        .header("cookie","www._km_id=Si6SeZiAMgCxTeWzpt5bcXsvGTpResoZ; www._km_user_name=Ecstatic Salmon; www._km_lead_collection=false; _ga=GA1.1.948438684.1681706158; _gcl_au=1.1.374296669.1681906644; test._km_id=e4FJPXRbaOjqBjVWHjlVPaK6X4QTrpN2; test._km_user_name=Brainy Tuna; test._km_lead_collection=false; mp_dd869d175e080d94bf7c4a6219ccefea2_mixpanel={\"distinct_id\": \"dwivedinalin2@gmail.com\",\"$device_id\": \"187b350574fda6-02615f9be820cf-1d525634-1ea000-187b35057501190\",\"$initial_referrer\": \"$direct\",\"$initial_referring_domain\": \"$direct\",\"$user_id\": \"dwivedinalin2@gmail.com\"}; mp_dd869d175e080d94bf7c4a6219ccefea_mixpanel={\"distinct_id\": \"dwivedi.nalin2@gmail.com\",\"$device_id\": \"18718734cc26ac-0e969afaca2be4-1e525634-1ea000-18718734cc3d69\",\"$initial_referrer\": \"https://www.linkedin.com/\",\"$initial_referring_domain\": \"www.linkedin.com\",\"$user_id\": \"dwivedi.nalin2@gmail.com\"}; i18n_redirected=en; _km_id=XbfqqjuJ3P1t4YVz1M30x6dLbT1JaZYE; _km_user_name=Friendly Dolphin; _km_lead_collection=false; Country=IN; _ga_022BJ5VN28=GS1.1.1682830136.9.0.1682830136.0.0.0; accessToken=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMTQ2OSwic2Vzc2lvbiI6MTY2NTk2NjY2Nywic2lnIjoiOTkyNGYxMDliMGViZDFiYWYyZDhhMGNjZmVkOTNlYWQwMTUzMjUyZiIsImlhdCI6MTY4MjgzMTUwNCwiZXhwIjoxNzY5MjMxNTA0fQ.e9PcI3jHxAxJDuOihnFgNfrxHsvX6XzY5Y7PwlRRIgvw8sBjmX4NRQEr7JZ-U9ZSRy70bqqFmomSti26uVTe5HPH3kf4PcMyHaC3Z-ApC7ZLKlgVhE13gOAf2Az-LnApAFs4YQntSJI4Ybe5CjM-KGPTqPSTjVM6QA8NzQxNlDqZDztqREO4tr4kimFCm-1iWWD-2y4Wrw9CSMTgPkTj_gJlAqj-CRSZK8AmTTRr_Quvdx08z-93jEiLNGr0T7hI9UAhN7oAcNEhipGzw6-WnqXkU6dXLqfeZxNIBmKvBJVApI3gz7OGTcVFAU5put6Uzf42MBCnegF6pAMZCausLA; _ga_SF65EQ14ZG=GS1.1.1682830130.38.1.1682831505.0.0.0; mp_cfc651cb17485ac59e319857cd62d40a_mixpanel={\"distinct_id\": \"dwivedi.nalin2+b5@gmail.com\",\"$device_id\": \"1876ab3701410a5-05bc6d59b3a014-1d525634-1ea000-1876ab37015f0a\",\"$initial_referrer\": \"$direct\",\"$initial_referring_domain\": \"$direct\",\"$user_id\": \"dwivedi.nalin2+b5@gmail.com\"}").asJson
        .header("Landau-Token","gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
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
