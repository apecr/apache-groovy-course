def writer = {
    append 'Dan'
    append 'lives in Cleveland'
}

// writer() // --> groovy.lang.MissingMethodException: No signature of method: Delegates.append()


//def append(String s){
//    println "append() called with argumen of $s"
//}

StringBuffer sb = new StringBuffer()

writer.delegate = sb

println writer()