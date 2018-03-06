/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    val sample1: Byte = 0x3A
    var sample2: Byte = 58
    var heartRate: Int = 85
    var deposits: Double = 135002796.0
    val acceleration: Float = 9.800f
    var mass: Float = 14.6f
    var distance: Double = 129.763001
    var lost : Boolean = true
    var expensive: Boolean = true
    var choice: Int = 2
    val integral = '\u222B'
    val greeting: String = "Hello"
    var name: String = "Karen"
    
    if(sample1 == sample2) {
        print("The samples are equal.\n")
    } else {
        print("The samples are not equal.\n")
    }
    
    if(heartRate >= 40 && heartRate <= 80) {
        print("Heart rate is normal.\n")
    } else {
        print("Heart rate is not normal.\n")
    }
    
    if(deposits >= 100000000) {
        print("You are exceedingly wealthy.\n")
    } else {
        print("Sorry you are so poor.\n")
    }
    
    var force: Float = mass * acceleration
    print("force = $force\n")
    
    print("$distance is the distance.\n")
    
    if(lost && expensive) {
        print("I am really sorry! I will get the manager.\n")
    } else if(lost && !expensive) {
        print("Here is a coupon for 10% off.\n")
    }
    
    when(choice) {
        1 -> print("You chose 1.\n")
        2 -> print("You chose 2.\n")
        3 -> print("You chose 3.\n")
        else -> print("You made an unknown choice.\n")
    }
    
    print("$integral is an integral.\n")
    
    for(i in 5..10) {
        print("i = $i\n")
    }
    
    var age: Int = 0
    while(age < 6) {
        print("age = $age\n")
        age++
    }
    
    print("$greeting $name")
}