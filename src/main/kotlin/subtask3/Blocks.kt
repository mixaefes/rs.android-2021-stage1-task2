package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
       // throw NotImplementedError("Not implemented")
        return when (blockB) {
            Int::class -> blockA.filterIsInstance<Int>().sum()
            String::class -> getStr(blockA)
            LocalDate::class -> getLastDate(blockA)
            else -> "nothing"
        }
    }

    private fun getLastDate(blockA: Array<*>): String {
        val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        return blockA.filterIsInstance<LocalDate>().max()!!.format(formatter)
    }

    private fun getStr(blockA: Array<*>): String {
        var str: String = ""
        for (s in blockA.filterIsInstance<String>()) {
            str += s
        }
        return str
    }
}
