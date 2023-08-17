var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100000",
        "ok": "25136",
        "ko": "74864"
    },
    "minResponseTime": {
        "total": "393",
        "ok": "443",
        "ko": "393"
    },
    "maxResponseTime": {
        "total": "63256",
        "ok": "59625",
        "ko": "63256"
    },
    "meanResponseTime": {
        "total": "25284",
        "ok": "13531",
        "ko": "29230"
    },
    "standardDeviation": {
        "total": "16841",
        "ok": "11364",
        "ko": "16539"
    },
    "percentiles1": {
        "total": "30582",
        "ok": "10614",
        "ko": "40005"
    },
    "percentiles2": {
        "total": "40008",
        "ok": "21486",
        "ko": "40049"
    },
    "percentiles3": {
        "total": "41234",
        "ok": "34960",
        "ko": "44082"
    },
    "percentiles4": {
        "total": "59133",
        "ok": "41205",
        "ko": "59862"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 2173,
    "percentage": 2
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 450,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 22513,
    "percentage": 23
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 74864,
    "percentage": 75
},
    "meanNumberOfRequestsPerSecond": {
        "total": "155.763",
        "ok": "39.153",
        "ko": "116.611"
    }
},
contents: {
"req_notes-f4c6f": {
        type: "REQUEST",
        name: "Notes",
path: "Notes",
pathFormatted: "req_notes-f4c6f",
stats: {
    "name": "Notes",
    "numberOfRequests": {
        "total": "100000",
        "ok": "25136",
        "ko": "74864"
    },
    "minResponseTime": {
        "total": "393",
        "ok": "443",
        "ko": "393"
    },
    "maxResponseTime": {
        "total": "63256",
        "ok": "59625",
        "ko": "63256"
    },
    "meanResponseTime": {
        "total": "25284",
        "ok": "13531",
        "ko": "29230"
    },
    "standardDeviation": {
        "total": "16841",
        "ok": "11364",
        "ko": "16539"
    },
    "percentiles1": {
        "total": "30582",
        "ok": "10611",
        "ko": "40005"
    },
    "percentiles2": {
        "total": "40008",
        "ok": "21486",
        "ko": "40049"
    },
    "percentiles3": {
        "total": "41234",
        "ok": "34960",
        "ko": "44082"
    },
    "percentiles4": {
        "total": "59133",
        "ok": "41205",
        "ko": "59862"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 2173,
    "percentage": 2
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 450,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 22513,
    "percentage": 23
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 74864,
    "percentage": 75
},
    "meanNumberOfRequestsPerSecond": {
        "total": "155.763",
        "ok": "39.153",
        "ko": "116.611"
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
