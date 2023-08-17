var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "100000",
        "ok": "23604",
        "ko": "76396"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "436",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "61255",
        "ok": "59796",
        "ko": "61255"
    },
    "meanResponseTime": {
        "total": "21415",
        "ok": "11147",
        "ko": "24587"
    },
    "standardDeviation": {
        "total": "15751",
        "ok": "10018",
        "ko": "15846"
    },
    "percentiles1": {
        "total": "20034",
        "ok": "7591",
        "ko": "22014"
    },
    "percentiles2": {
        "total": "40004",
        "ok": "15473",
        "ko": "40006"
    },
    "percentiles3": {
        "total": "41268",
        "ok": "33044",
        "ko": "43340"
    },
    "percentiles4": {
        "total": "60002",
        "ok": "38148",
        "ko": "60002"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 2716,
    "percentage": 3
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 408,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 20480,
    "percentage": 20
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 76396,
    "percentage": 76
},
    "meanNumberOfRequestsPerSecond": {
        "total": "151.515",
        "ok": "35.764",
        "ko": "115.752"
    }
},
contents: {
"req_search-keyword-c2109": {
        type: "REQUEST",
        name: "Search keyword",
path: "Search keyword",
pathFormatted: "req_search-keyword-c2109",
stats: {
    "name": "Search keyword",
    "numberOfRequests": {
        "total": "100000",
        "ok": "23604",
        "ko": "76396"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "436",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "61255",
        "ok": "59796",
        "ko": "61255"
    },
    "meanResponseTime": {
        "total": "21415",
        "ok": "11147",
        "ko": "24587"
    },
    "standardDeviation": {
        "total": "15751",
        "ok": "10018",
        "ko": "15846"
    },
    "percentiles1": {
        "total": "20030",
        "ok": "7591",
        "ko": "22014"
    },
    "percentiles2": {
        "total": "40005",
        "ok": "15473",
        "ko": "40006"
    },
    "percentiles3": {
        "total": "41326",
        "ok": "33044",
        "ko": "43340"
    },
    "percentiles4": {
        "total": "60002",
        "ok": "38148",
        "ko": "60002"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 2716,
    "percentage": 3
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 408,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 20480,
    "percentage": 20
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 76396,
    "percentage": 76
},
    "meanNumberOfRequestsPerSecond": {
        "total": "151.515",
        "ok": "35.764",
        "ko": "115.752"
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
