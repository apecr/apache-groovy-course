Range r = 1..<10
println r
println r.class.name
println r.to
println r.from

assert (0..10).contains(10)
assert (0..10).contains(0)
assert !(0..10).contains(-1)
assert !(0..10).contains(11)
assert (0..<10).contains(0)
assert !(0..<10).contains(10)

Date today = new Date()
Date oneWeekAway = today + 7

println today
println oneWeekAway

Range days = today..oneWeekAway
days.each {it -> println it}

Range letters = 'a'..'z'
letters.each {it -> println it}

