var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100000",
        "ok": "38562",
        "ko": "61438"
    },
    "minResponseTime": {
        "total": "389",
        "ok": "437",
        "ko": "389"
    },
    "maxResponseTime": {
        "total": "72419",
        "ok": "67373",
        "ko": "72419"
    },
    "meanResponseTime": {
        "total": "27776",
        "ok": "18582",
        "ko": "33546"
    },
    "standardDeviation": {
        "total": "15667",
        "ok": "12369",
        "ko": "14737"
    },
    "percentiles1": {
        "total": "36576",
        "ok": "15638",
        "ko": "40006"
    },
    "percentiles2": {
        "total": "40016",
        "ok": "28430",
        "ko": "40080"
    },
    "percentiles3": {
        "total": "42329",
        "ok": "41235",
        "ko": "51206"
    },
    "percentiles4": {
        "total": "59999",
        "ok": "50078",
        "ko": "60001"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 1280,
    "percentage": 1
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 205,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 37077,
    "percentage": 37
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 61438,
    "percentage": 61
},
    "meanNumberOfRequestsPerSecond": {
        "total": "153.374",
        "ok": "59.144",
        "ko": "94.23"
    }
},
contents: {
"req_user-login-e1f42": {
        type: "REQUEST",
        name: "User login",
path: "User login",
pathFormatted: "req_user-login-e1f42",
stats: {
    "name": "User login",
    "numberOfRequests": {
        "total": "100000",
        "ok": "38562",
        "ko": "61438"
    },
    "minResponseTime": {
        "total": "389",
        "ok": "437",
        "ko": "389"
    },
    "maxResponseTime": {
        "total": "72419",
        "ok": "67373",
        "ko": "72419"
    },
    "meanResponseTime": {
        "total": "27776",
        "ok": "18582",
        "ko": "33546"
    },
    "standardDeviation": {
        "total": "15667",
        "ok": "12369",
        "ko": "14737"
    },
    "percentiles1": {
        "total": "36576",
        "ok": "15641",
        "ko": "40006"
    },
    "percentiles2": {
        "total": "40016",
        "ok": "28431",
        "ko": "40080"
    },
    "percentiles3": {
        "total": "42329",
        "ok": "41240",
        "ko": "51206"
    },
    "percentiles4": {
        "total": "59993",
        "ok": "50078",
        "ko": "60001"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 1280,
    "percentage": 1
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 205,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 37077,
    "percentage": 37
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 61438,
    "percentage": 61
},
    "meanNumberOfRequestsPerSecond": {
        "total": "153.374",
        "ok": "59.144",
        "ko": "94.23"
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
