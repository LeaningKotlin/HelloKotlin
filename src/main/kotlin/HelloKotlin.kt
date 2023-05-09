import com.example.edu.Person as User

fun main() {
    println("Hello Kotlin!!")

    val person1 = User("JangPill", 19)
    val person2 = Person(19, "Janpill", "Student")

    println(person1)
    println(person1.name)
    println(person1.age)
}

class Person (val no: Int, val name: String, val jobTitle: String)