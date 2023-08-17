var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100000",
        "ok": "685",
        "ko": "99315"
    },
    "minResponseTime": {
        "total": "388",
        "ok": "1171",
        "ko": "388"
    },
    "maxResponseTime": {
        "total": "82899",
        "ok": "59997",
        "ko": "82899"
    },
    "meanResponseTime": {
        "total": "19323",
        "ok": "36184",
        "ko": "19206"
    },
    "standardDeviation": {
        "total": "16945",
        "ok": "17665",
        "ko": "16882"
    },
    "percentiles1": {
        "total": "20002",
        "ok": "38273",
        "ko": "20002"
    },
    "percentiles2": {
        "total": "23900",
        "ok": "52650",
        "ko": "23741"
    },
    "percentiles3": {
        "total": "59171",
        "ok": "58748",
        "ko": "59194"
    },
    "percentiles4": {
        "total": "61196",
        "ok": "59767",
        "ko": "61228"
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
    "count": 1,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 684,
    "percentage": 1
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 99315,
    "percentage": 99
},
    "meanNumberOfRequestsPerSecond": {
        "total": "151.515",
        "ok": "1.038",
        "ko": "150.477"
    }
},
contents: {
"req_get-courses-ee0d4": {
        type: "REQUEST",
        name: "Get courses",
path: "Get courses",
pathFormatted: "req_get-courses-ee0d4",
stats: {
    "name": "Get courses",
    "numberOfRequests": {
        "total": "100000",
        "ok": "685",
        "ko": "99315"
    },
    "minResponseTime": {
        "total": "388",
        "ok": "1171",
        "ko": "388"
    },
    "maxResponseTime": {
        "total": "82899",
        "ok": "59997",
        "ko": "82899"
    },
    "meanResponseTime": {
        "total": "19323",
        "ok": "36184",
        "ko": "19206"
    },
    "standardDeviation": {
        "total": "16945",
        "ok": "17665",
        "ko": "16882"
    },
    "percentiles1": {
        "total": "20002",
        "ok": "38273",
        "ko": "20002"
    },
    "percentiles2": {
        "total": "23900",
        "ok": "52650",
        "ko": "23741"
    },
    "percentiles3": {
        "total": "59171",
        "ok": "58748",
        "ko": "59174"
    },
    "percentiles4": {
        "total": "61196",
        "ok": "59767",
        "ko": "61227"
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
    "count": 1,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 684,
    "percentage": 1
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 99315,
    "percentage": 99
},
    "meanNumberOfRequestsPerSecond": {
        "total": "151.515",
        "ok": "1.038",
        "ko": "150.477"
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
