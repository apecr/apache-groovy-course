class Person {
    String first
    String last

    public Person(String first, String second) {
        this.first = first
        this.last = second
    }

    public String toString(){
        "Person: $first $last"
    }
}