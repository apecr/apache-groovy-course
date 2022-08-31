def map = [:]

println map
println map.getClass().name

def person = [first: "Alberto", second: "Eyo", email: "alberto.eyo@gmail.com"]
println person
println person.first

person.twitter = "@apecr"
println person

def emailKey = "Email Address"
def twitter = [username: "@apecr", (emailKey): "alberto.eyo@gmail.com"]
println twitter

println person.size()
println person.sort()

for (entry in person){
    println entry
    println entry.key
    println entry.value
}

for (key in person.keySet()){
    println "${key}: ${person[key]}"
}
