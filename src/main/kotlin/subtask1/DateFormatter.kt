package subtask1

import java.time.DateTimeException
import java.time.LocalDate

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
       // throw NotImplementedError("Not implemented")
        try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val mounths  = arrayListOf<String>("января","февраля","марта","авреля","мая",
                "июня","июля","августа","сентября","октября","ноября","декабря")
            return when (date.dayOfWeek.value) {
                1 -> "$day ${mounths[month.toInt() - 1]}, понедельник"
                2 -> "$day ${mounths[month.toInt() - 1]}, вторник"
                3 -> "$day ${mounths[month.toInt() - 1]}, среда"
                4 -> "$day ${mounths[month.toInt() - 1]}, четверг"
                5 -> "$day ${mounths[month.toInt() - 1]}, пятница"
                6 -> "$day ${mounths[month.toInt() - 1]}, суббота"
                7 -> "$day ${mounths[month.toInt() - 1]}, воскресенье"
                else -> "такого дня не существует"
            }
        }catch (dte: DateTimeException){
            return "Такого дня не существует"
        }
    }
}
