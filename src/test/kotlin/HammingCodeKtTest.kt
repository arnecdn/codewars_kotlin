import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HammingCodeKtTest{
    @Test
    fun t1_encodeShortWord() {
        assertEquals("000111111000111000000000000111111000000111000111000111111111111000000111", encode("hey"))
    }
    @Test
    fun t2_encodeLongerWord() {
        assertEquals("000111000111000111000000000111111000111000000000000111111000000111000111000000111000000000000000000111000111000000111111000111111000000111000111000111111000111111111000000111111111000000111111000111111000000111000111000111111000111000000111000000111000000000000000000111111111000111000000000111111000111111111111000111111000111111000000000111111000000111000000000000111000000000000000000111111000111111000111000111111000000111000111000000111000000000000000000111111111000111000000000111111000111000000000000111111000000000000111000111111111000111000000000000111000000000000000000111111000111000000111000000111000000000000000000111111000000000111111000111111000000000000111000111111000111111111000000000111000000000000000000111111000000111000000000111111000111111111111000000111000000000000000000111111111000111000000000111111000111000000000000111111000111000000111000111111111000000111111000000111000000000000000000111111000111000111111000111111000000000000111000111111111000111000000000111111000000000000111", encode("The Sensei told me that i can do this kata"))
    }
    @Test
    fun t3_encodeWithNumbers() {
        assertEquals("000111000111000111000000000000111111000000111111000111111111000000111111000111111111000111000000", encode("T3st"))
    }
    @Test
    fun t4_encodeWithSpecialCharacters() {
        assertEquals("000111000111000111000000000000111111111111111111000111111111000000111111000111111111000111000000000000111000000000000111000000111000000111000111", encode("T?st!%"))
    }
    @Test
    fun t5_decodeShortWord() {
        assertEquals("hey", decode("100111111000111001000010000111111000000111001111000111110110111000010111"))
    }
    @Test
    fun t6_decodeLongerWord() {
        assertEquals("The Sensei told me that i can do this kata", decode("000111000111000111000100000111111000111000001000000111111000000111000111000100111000000000000000000111000111000000111111000111111000000111000111000111111000111111111000000111111111000000111111000110111000010111000111000111111000111001000111000000111000000000000000000111111111000111000000000111111000111111111111000111111000111111000000000111111000000111000001000000111000000000001000000111111000111111000111000111111000000111000111000000111000000000000000000111111111000111000000000111111000111000000000000111111000000010000111000111111111000111000000000100111000000000000000000111111000111000000111000000111000000000000000000111111000000000111111000111111000000000000111000111111000111111111000000000111000000000000010000111111000000111000000000111111000111111110111000000111000000000000000000111111111000111000000000111111000111000000000000111111000111000000111000111111111000000111111000000111000000000000000000111111000111000111111000111111000000000000111000111111111000111000000000111111000000000000111"))
    }
    @Test
    fun t7_decodeWithNumbers() {
        assertEquals("T3st", decode("000111000111000111000001000000111111000000111111000111111111000000111011000111111111000111000000"))
    }
    @Test
    fun t8_decodeWithSpecialCharacters() {
        assertEquals("T?st!%", decode("000111000111000111000010000000111111111111011111000111111111000000111111000111101111000111000000000000111000000000000111000000111000000111000111"))
    }
}