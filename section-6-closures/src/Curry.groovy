def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(), "First debug statement...")

def logDebug = log.curry("DEBUG")

logDebug(new Date(), "Second debug statement from logDebug..")
logDebug(new Date(), "Third debug statement from logDebug..")

def todayDebugLog = log.curry("DEBUG", new Date())

todayDebugLog("Logs from today")
todayDebugLog("Logs from today 2")
todayDebugLog("Logs from today 3")

// right curry

def crazyPersonLog = log.rcurry("Why am I logging this way")
crazyPersonLog("ERROR", new Date())

// index based currying
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("WARN", "This is a log from typeMsgLog")
