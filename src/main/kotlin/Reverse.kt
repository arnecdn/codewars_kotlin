object Reverse{
    fun reverseWords(str:String):String{
        return str.split(" ").reversed().joinToString(" ")
    }
}