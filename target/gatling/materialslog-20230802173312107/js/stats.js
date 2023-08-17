var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100000",
        "ok": "25862",
        "ko": "74138"
    },
    "minResponseTime": {
        "total": "385",
        "ok": "451",
        "ko": "385"
    },
    "maxResponseTime": {
        "total": "82581",
        "ok": "82581",
        "ko": "67079"
    },
    "meanResponseTime": {
        "total": "23661",
        "ok": "18316",
        "ko": "25526"
    },
    "standardDeviation": {
        "total": "15315",
        "ok": "12246",
        "ko": "15831"
    },
    "percentiles1": {
        "total": "20023",
        "ok": "14180",
        "ko": "20424"
    },
    "percentiles2": {
        "total": "40005",
        "ok": "25839",
        "ko": "40007"
    },
    "percentiles3": {
        "total": "42231",
        "ok": "41991",
        "ko": "43373"
    },
    "percentiles4": {
        "total": "60001",
        "ok": "50855",
        "ko": "60002"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 205,
    "percentage": 0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 128,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 25529,
    "percentage": 26
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 74138,
    "percentage": 74
},
    "meanNumberOfRequestsPerSecond": {
        "total": "161.29",
        "ok": "41.713",
        "ko": "119.577"
    }
},
contents: {
"req_materials-log-79c1c": {
        type: "REQUEST",
        name: "Materials Log",
path: "Materials Log",
pathFormatted: "req_materials-log-79c1c",
stats: {
    "name": "Materials Log",
    "numberOfRequests": {
        "total": "100000",
        "ok": "25862",
        "ko": "74138"
    },
    "minResponseTime": {
        "total": "385",
        "ok": "451",
        "ko": "385"
    },
    "maxResponseTime": {
        "total": "82581",
        "ok": "82581",
        "ko": "67079"
    },
    "meanResponseTime": {
        "total": "23661",
        "ok": "18316",
        "ko": "25526"
    },
    "standardDeviation": {
        "total": "15315",
        "ok": "12246",
        "ko": "15831"
    },
    "percentiles1": {
        "total": "20023",
        "ok": "14180",
        "ko": "20424"
    },
    "percentiles2": {
        "total": "40005",
        "ok": "25839",
        "ko": "40007"
    },
    "percentiles3": {
        "total": "42231",
        "ok": "41991",
        "ko": "43373"
    },
    "percentiles4": {
        "total": "60001",
        "ok": "50855",
        "ko": "60002"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 205,
    "percentage": 0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 128,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 25529,
    "percentage": 26
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 74138,
    "percentage": 74
},
    "meanNumberOfRequestsPerSecond": {
        "total": "161.29",
        "ok": "41.713",
        "ko": "119.577"
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
