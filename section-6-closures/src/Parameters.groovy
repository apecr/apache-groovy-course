// implicit param

def foo = {
    println it
}

foo('Alberto')

def noParams = { ->
    println "no params"
}

noParams()
// noParams(1) --> throws groovy.lang.MissingMethodException

def sayHello = { String first, String last ->
    println "Hello, $first $last"
}

sayHello("Alberto", "Eyo")

// default values for params

def greet = { name, greeting = "Howdy" ->
    println "$greeting, $name"
}

greet("Alberto", "Hello")
greet("Alberto")

// var-arg

def concat = { String... args ->
    args.join('; ')
}

println concat('ABC', 'DEF', 'Juan')

//

def someMethod(Closure c){
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = {int x, int y -> x + y}
someMethod someClosure
