List favNums = [2, 21, 44, 35, 8, 4]

favNums.each { println it }
favNums.eachWithIndex { int entry, int i -> println "$i: $entry" }

println favNums.findAll { it > 4 }

// findAll --> new list
List days = ["Sunday", "Monday", "Saturday"]
println days.findAll { it.startsWith("S") }

// collect
List nums = [1, 2, 2, 7, 2, 8, 2, 4, 6]
def mulTem = { 10 * it }
numsTen = nums.collect mulTem
numsTenOtherWay = nums.collect(mulTem)
println numsTen
println numsTenOtherWay
