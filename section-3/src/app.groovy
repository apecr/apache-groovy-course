Developer d = new Developer()
d.first = "Dan"
d.setLast "Vega"

// assign some languages
println d.languages.getClass().getName()
println d.languages.class.name

d.languages << 'Python'
d.languages << 'Groovy'

println d.languages

d.work()