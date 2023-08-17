var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100000",
        "ok": "4296",
        "ko": "95704"
    },
    "minResponseTime": {
        "total": "5",
        "ok": "1270",
        "ko": "5"
    },
    "maxResponseTime": {
        "total": "71365",
        "ok": "66613",
        "ko": "71365"
    },
    "meanResponseTime": {
        "total": "21476",
        "ok": "34746",
        "ko": "20880"
    },
    "standardDeviation": {
        "total": "18640",
        "ok": "14062",
        "ko": "18599"
    },
    "percentiles1": {
        "total": "14392",
        "ok": "35091",
        "ko": "13963"
    },
    "percentiles2": {
        "total": "23926",
        "ok": "46024",
        "ko": "22418"
    },
    "percentiles3": {
        "total": "60001",
        "ok": "56749",
        "ko": "60001"
    },
    "percentiles4": {
        "total": "60002",
        "ok": "59478",
        "ko": "60002"
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
    "count": 4296,
    "percentage": 4
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 95704,
    "percentage": 96
},
    "meanNumberOfRequestsPerSecond": {
        "total": "151.515",
        "ok": "6.509",
        "ko": "145.006"
    }
},
contents: {
"req_watch-lesson-vi-fa146": {
        type: "REQUEST",
        name: "Watch Lesson Video",
path: "Watch Lesson Video",
pathFormatted: "req_watch-lesson-vi-fa146",
stats: {
    "name": "Watch Lesson Video",
    "numberOfRequests": {
        "total": "100000",
        "ok": "4296",
        "ko": "95704"
    },
    "minResponseTime": {
        "total": "5",
        "ok": "1270",
        "ko": "5"
    },
    "maxResponseTime": {
        "total": "71365",
        "ok": "66613",
        "ko": "71365"
    },
    "meanResponseTime": {
        "total": "21476",
        "ok": "34746",
        "ko": "20880"
    },
    "standardDeviation": {
        "total": "18640",
        "ok": "14062",
        "ko": "18599"
    },
    "percentiles1": {
        "total": "14392",
        "ok": "35091",
        "ko": "13963"
    },
    "percentiles2": {
        "total": "23926",
        "ok": "46024",
        "ko": "22418"
    },
    "percentiles3": {
        "total": "60001",
        "ok": "56749",
        "ko": "60001"
    },
    "percentiles4": {
        "total": "60002",
        "ok": "59478",
        "ko": "60002"
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
    "count": 4296,
    "percentage": 4
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 95704,
    "percentage": 96
},
    "meanNumberOfRequestsPerSecond": {
        "total": "151.515",
        "ok": "6.509",
        "ko": "145.006"
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