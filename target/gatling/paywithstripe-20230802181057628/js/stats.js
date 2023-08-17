var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100000",
        "ok": "469",
        "ko": "99531"
    },
    "minResponseTime": {
        "total": "392",
        "ok": "1697",
        "ko": "392"
    },
    "maxResponseTime": {
        "total": "67400",
        "ok": "59968",
        "ko": "67400"
    },
    "meanResponseTime": {
        "total": "22476",
        "ok": "36471",
        "ko": "22410"
    },
    "standardDeviation": {
        "total": "16904",
        "ok": "15871",
        "ko": "16881"
    },
    "percentiles1": {
        "total": "20013",
        "ok": "38571",
        "ko": "20010"
    },
    "percentiles2": {
        "total": "40005",
        "ok": "49764",
        "ko": "40005"
    },
    "percentiles3": {
        "total": "48938",
        "ok": "58203",
        "ko": "48616"
    },
    "percentiles4": {
        "total": "60001",
        "ok": "59458",
        "ko": "60001"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 469,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 99531,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "156.006",
        "ok": "0.732",
        "ko": "155.275"
    }
},
contents: {
"req_pay-with-stripe-2845f": {
        type: "REQUEST",
        name: "Pay with Stripe",
path: "Pay with Stripe",
pathFormatted: "req_pay-with-stripe-2845f",
stats: {
    "name": "Pay with Stripe",
    "numberOfRequests": {
        "total": "100000",
        "ok": "469",
        "ko": "99531"
    },
    "minResponseTime": {
        "total": "392",
        "ok": "1697",
        "ko": "392"
    },
    "maxResponseTime": {
        "total": "67400",
        "ok": "59968",
        "ko": "67400"
    },
    "meanResponseTime": {
        "total": "22476",
        "ok": "36471",
        "ko": "22410"
    },
    "standardDeviation": {
        "total": "16904",
        "ok": "15871",
        "ko": "16881"
    },
    "percentiles1": {
        "total": "20013",
        "ok": "38571",
        "ko": "20010"
    },
    "percentiles2": {
        "total": "40005",
        "ok": "49764",
        "ko": "40005"
    },
    "percentiles3": {
        "total": "48938",
        "ok": "58203",
        "ko": "48616"
    },
    "percentiles4": {
        "total": "60001",
        "ok": "59458",
        "ko": "60001"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 469,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 99531,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "156.006",
        "ok": "0.732",
        "ko": "155.275"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
