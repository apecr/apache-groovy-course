// Enums

enum DaysOfTheWeek {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}


// Ranges

Range allDays = DaysOfTheWeek.Monday..DaysOfTheWeek.Sunday

assert allDays.size() == 7
assert allDays.contains(DaysOfTheWeek.Wednesday)

assert allDays.from == DaysOfTheWeek.Monday
assert allDays.to == DaysOfTheWeek.Sunday


// Lists

def days = [DaysOfTheWeek.Sunday, DaysOfTheWeek.Monday, DaysOfTheWeek.Tuesday, DaysOfTheWeek.Wednesday, DaysOfTheWeek.Saturday]
println days
assert days.size() == 5
days.remove(DaysOfTheWeek.Saturday)
println days
days << DaysOfTheWeek.Saturday
println days
println days[3]

// Maps

def mapDays = [
        1: DaysOfTheWeek.Monday,
        2: DaysOfTheWeek.Tuesday,
        3: DaysOfTheWeek.Wednesday,
        4: DaysOfTheWeek.Thursday,
        5: DaysOfTheWeek.Friday,
        6: DaysOfTheWeek.Saturday,
        7: DaysOfTheWeek.Sunday
]

println mapDays
println mapDays.getClass().name
assert mapDays.size() == 7

mapDays.forEach((key, day) -> println "$key: $day")

println mapDays.values()
