/**
 * After completing the instructional videos, implement an IPv4 address checker function that determines whether a given string is a valid IPv4 address.
 * An IPv4 address is valid if it consists of four numeric segments, separated by dots (.), where:
- Each segment must be a number between 0 and 255, inclusive.
- Leading zeros in any segment (e.g., "01" or "001") are not allowed, except for the digit "0" itself.
- The address must contain exactly three dots and no extra characters.
- The function should return a Boolean value only—true if the input is a valid IPv4 address, and false otherwise.
 *You must follow a Test-Driven Development (TDD) approach while building this function:

- Create a check function, follow the tutorial structure, and write comprehensive test cases first without implementing any logic in the checker function. Initially, the function should always return false.
- Share your written test cases with your mentor during the daily meeting for review and feedback.
Once approved, begin implementing the logic of the IPv4 checker function step by step, ensuring that each test passes.
- Upon successful implementation, design a complete flowchart to represent the decision-making logic of the function using draw.io.
 */

fun isValidIP(ip: String): Boolean {
    val parts = ip.split(".")
    if (parts.size != 4) return false

    for (part in parts) {
        when {
            part.isEmpty() -> return false
            !part.all { it.isDigit() } -> return false
            part.toIntOrNull() == null -> return false
            part.toInt() !in 0..255 -> return false
            part.length > 1 && part.startsWith("0") -> return false
        }
    }

    return true
}
