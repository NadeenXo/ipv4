
fun test(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}



fun main() {
    // Valid IP
    test(
        name = "192.168.1.1 - valid",
        result = isValidIP("192.168.1.1"),
        correctResult = true
    )

    // Valid IP - min
    test(
        name = "0.0.0.0 - valid",
        result = isValidIP("0.0.0.0"),
        correctResult = true
    )

    // Valid IP - max
    test(
        name = "255.255.255.255 - valid",
        result = isValidIP("255.255.255.255"),
        correctResult = true
    )

    // Invalid IP - out of range (256)
    test(
        name = "256.100.50.25 - invalid",
        result = isValidIP("256.100.50.25"),
        correctResult = false
    )

    // Invalid IP - leading zero
    test(
        name = "192.168.01.1 - invalid",
        result = isValidIP("192.168.01.1"),
        correctResult = false
    )

    // Invalid IP -  3 parts
    test(
        name = "192.168.1 - invalid",
        result = isValidIP("192.168.1"),
        correctResult = false
    )

    // Invalid IP - 5 parts
    test(
        name = "192.168.1.1.5 - invalid ",
        result = isValidIP("192.168.1.1.5"),
        correctResult = false
    )

    // Invalid IP - chars
    test(
        name = "abc.def.ghi.jkl - invalid ",
        result = isValidIP("abc.def.ghi.jkl"),
        correctResult = false
    )
    // Invalid IP - chars
    test(
        name = "abc.def.ghi.222 - invalid ",
        result = isValidIP("abc.def.ghi.222"),
        correctResult = false
    )
    // Invalid IP - string
    test(
        name = "abcdefg - invalid ",
        result = isValidIP("abc"),
        correctResult = false
    )

    // Invalid IP
    test(
        name = "-192.168.1.1.5 - invalid ",
        result = isValidIP("-192.168.1.1.5"),
        correctResult = false
    )
    test(
        name = "172.16.1.0 - valid ",
        result = isValidIP("172.16.1.0 "),
        correctResult = false
    )
}
