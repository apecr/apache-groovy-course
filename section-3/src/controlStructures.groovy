def control(){
    if (false)
        return "value is false"
    if (true)
        return "value is true"
}

assert control() == "value is true"


def list2 = [1, 2, 3, 4]
list2.each { println it }
