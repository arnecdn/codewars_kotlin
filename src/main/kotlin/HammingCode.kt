fun encode(text: String): String = text.chars().toArray().map { Integer.toBinaryString(it).padStart(8, '0') }
        .map { it -> it.toCharArray().map { it.toString().repeat(3) } }
        .flatten()
        .joinToString(separator = "")

fun decode(bits: String): String = bits.chunked(3)
        .map { it.groupingBy { it }.eachCount() }
        .map { it.entries.sortedBy { it.value }.last().key }
        .chunked(8)
        .map { it.joinToString(separator = "") }
        .map { it.toByte(2) }
        .map { it.toChar() }
        .joinToString(separator = "")
