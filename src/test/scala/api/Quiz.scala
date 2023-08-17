package api

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Quiz extends Simulation{

  //protocol
  val httpProtocol= http.baseUrl("https://api.landau.app/")

  //scenario
  val scn1=scenario("Quiz")
    .exec(
      http("Quiz")
        .post("/v1/course/science-for-year-2-3/lesson/plants-and-animals-in-hot-countries-1690069068")
        .header("content-type","application/json").asJson
        .header("cookie","i18n_redirected=en; Country=IN; _gcl_au=1.1.1160205854.1682955116; _ga=GA1.1.1858560967.1682955116; _fbp=fb.1.1682955116232.1337886061; _km_id=Zkqev3synEJ04Vxkvggkcba4I5XG9wLq; _km_user_name=Inventive Shellfish; _km_lead_collection=false; accessToken=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMTQ2OSwic2Vzc2lvbiI6MTgyNjAzNzE4MSwic2lnIjoiYWJkNjZlYzdkMjY3NzI1ODEzYTg0MTc3ODA3M2EzYjY1OWIxYTA3OCIsImlhdCI6MTY4Mjk1NTEzMiwiZXhwIjoxNzY5MzU1MTMyfQ.2jfPSA76c2TUfVQIb6ZNaH1YUI7-jJZVqduscR0SeDzUSaYeamvOO1IAq8HpfVfiJFeSyxUpzV_uWTUdRPqasSb3rvhRhY81dM8Th_INxm96tM7Pm6dZ4RbvrJ9ZkcX02ToWMzYgTX633BJogn3j0Yww3X0eP2bZ0SNq_jipRBEaDhFi0cCH2ejjDWwx8E5ofC7btJbU1-JdHXxa_cE_J6hzIB62BAauOYJhGJ2BPyYcad5YNZBdePMuRCrXVKxmbwpbPEJJVgts2hEsg887kQS0WQpwJMta15kNC2xSRO11gSGDdkT3fksRAZODBVk9yLei21sMXQi2Ew6_6ah4cQ; activeProfile=8493; mp_cfc651cb17485ac59e319857cd62d40a_mixpanel={\"distinct_id\": \"dwivedi.nalin2+b5@gmail.com\",\"$device_id\": \"187d7f11bef4d5-0d114b760cde51-1d525634-1ea000-187d7f11bf0450\",\"$initial_referrer\": \"$direct\",\"$initial_referring_domain\": \"$direct\",\"$user_id\": \"dwivedi.nalin2+b5@gmail.com\"}; _ga_SF65EQ14ZG=GS1.1.1682955115.1.1.1682955148.0.0.0").asJson
        .header("Landau-Token","gSgCzdAQuvcfd9jDkD4XAdznzhte3AtVR3fh6A6uuPPvZGun7c").asJson
        .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJMQU5EQVUgTGVhcm5pbmcgQXBwIiwic3ViIjoxMTQ2OSwic2Vzc2lvbiI6MTgyNjAzNzE4MSwic2lnIjoiYWJkNjZlYzdkMjY3NzI1ODEzYTg0MTc3ODA3M2EzYjY1OWIxYTA3OCIsImlhdCI6MTY4Mjk1NTEzMiwiZXhwIjoxNzY5MzU1MTMyfQ.2jfPSA76c2TUfVQIb6ZNaH1YUI7-jJZVqduscR0SeDzUSaYeamvOO1IAq8HpfVfiJFeSyxUpzV_uWTUdRPqasSb3rvhRhY81dM8Th_INxm96tM7Pm6dZ4RbvrJ9ZkcX02ToWMzYgTX633BJogn3j0Yww3X0eP2bZ0SNq_jipRBEaDhFi0cCH2ejjDWwx8E5ofC7btJbU1-JdHXxa_cE_J6hzIB62BAauOYJhGJ2BPyYcad5YNZBdePMuRCrXVKxmbwpbPEJJVgts2hEsg887kQS0WQpwJMta15kNC2xSRO11gSGDdkT3fksRAZODBVk9yLei21sMXQi2Ew6_6ah4cQ")
        .check(
          status is 200,
          jsonPath("$.status") is "success"
        )
    )

  //setup
  setUp(
    scn1.inject(rampUsers(200000).during(600))
      .protocols(httpProtocol)
  )

}
