package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
       // throw NotImplementedError("Not implemented")
        var subStr: String = ""
        for (i in a.indices){
            if (b.contains(a[i].toUpperCase())) subStr+=a[i] else continue
        }
        return if(subStr.toUpperCase() == b) "YES" else "NO"
    }
}
