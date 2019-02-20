/**import java.io.File
import java.io.IOException

fun produkti(inputName: String, query: String): String {
    val result = StringBuilder()
    val task = query.split(" ")
    try {
        for (line in File(inputName).readLines()) {
            if (!Regex("""\d{6} - [а-я]+, \d+ р, \d+ [а-я]+""").matches(line)) throw IllegalArgumentException()
            val parts = line.split(" ")
            val name = parts[2]
            if (parts[0] == task[0] || task[0] == "*") {
                result.append("$name ")
                if (parts[5] >= task[1]) result.append("достаточно, ")
                else result.append("недостаточно, ")
                val value = parts[5].toInt() * parts[3].toInt()
                result.append("общая стоимость $value р")
                result.append("\n")
            }
        }

    } catch (e: IOException) {
        throw IOException()
    }
    return result.trim().toString()
}

fun main(args: Array<String>) {
    println(produkti("123", "009724 15"))
}

fun myFun(inputName: String, range: String): Int {
    val column: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val rangeSplit = range.split(":")
    val firstCh = rangeSplit[0].split("")[0]
    val secondCh = rangeSplit[1].split("")[0]
    val firstNm = rangeSplit[0].split("")[1].toInt()
    val secondNm = rangeSplit[1].split("")[1]
    var result = 0
    val array = arrayOf<List<String>>()
    try {
        for (line in File(inputName).readLines()) {
            if (Regex("""(-?\d\.\d\, ){0,26}""").matches(line)) throw IllegalArgumentException()
            val parts = line.split(", ")
            parts[firstNm - 1].toInt()
        }
        column(firstCh)


        }


    }
}






package zadachi

import java.lang.IllegalArgumentException

fun myFun(size: Int, figure: String, row: Int, column: Int): Int {
if (!Regex("""Queen|King|Bishop|Rook|Knight""").matches(figure)) throw IllegalArgumentException()
var count = 0
when {
(figure == "Rook") -> count = size - 1


(figure == "King") -> {
when {
(size - column >= 1) && (size - row >= 1) -> count = 8
(size - column >= 1 && size - row == 0) || (size - row >= 1 && size - column == 0) -> count = 5
else -> count = 3

}

}
(figure == "Bishop") -> {


}
(figure == "Queen") -> {


}
else ->{
when{
size - column >= 3 && size - row >= 3 &&
}
}

}

}

fun foo(inputName: String, query: String): Any {
val queryType = when {
query.matches(Regex("""([А-Яа-я]+) (Мобильный|Домашний|Служебный)""")) -> 1
query.matches(Regex("""([А-Яа-я]+) [*]""")) -> 2
query.matches(Regex("""([А-Яа-я]+) ([0-9]+)""")) -> 3
else -> throw IllegalArgumentException()
}
val queryParts = query.split(" ")
var result = listOf<String>()
try {
for (line in File(inputName).readLines()) {
if (line.contains(queryParts[0])) {
result = line.replace(";", "").split(" ")
}
}
} catch (e: IOException) {
println("Невозможно прочесть файл")
}
val resultList = mutableListOf<String>()
when (queryType) {
1 -> {
for (i in 1 until result.size step 2) {
if (result[i] == queryParts[1]) {
return result[i + 1]
}
}
}
2 -> {
for (i in 2 until result.size step 2) {
resultList.add(result[i])
}
return resultList.joinToString(separator = ", ")
}
3 -> {
for (i in 2 until result.size step 2) {
if (result[i].contains(queryParts[1])) {
resultList.add(result[i])
}
}
return resultList.joinToString(separator = ", ")
}
}
return result
}




fun myFun(inputName: String, days: String): Int {
val inputType = when {
days.matches(Regex("""[А-Яа-я]+ [0-9]{1,2}\.\.[0-9]{1,2}""")) -> 1
days.matches(Regex("""[А-Яа-я]+ [0-9]{1,2}\.\.[А-Яа-я]+ [0-9]{1,2}""")) -> 2
else -> throw IllegalArgumentException()
}
var fText = listOf<String>()
var sText = listOf<String>()
try {
when (inputType) {
1 -> {
val data = days.replace("..", " ").split(" ")
val month = data[0]
val firstDate = data[1].toInt()
val lastDate = data[2].toInt()
for (line in File(inputName).readLines()) {
if (line.contains(month)) {
fText = line.split(" ").subList(firstDate, lastDate + 1)
}
}
return fText.map { it.toInt() }.max() ?: 0
}
2 -> {
val data = days.replace("..", " ").split(" ")
val firsMonth = data[0]
val lastMonth = data[2]
val firstDate = data[1].toInt()
val lastDate = data[3].toInt()
for (line in File(inputName).readLines()) {
if (line.contains(firsMonth)) {
fText = line.split(" ")
} else if (line.contains(lastMonth)) {
sText = line.split(" ")
}
}
return (fText.subList(firstDate, fText.size) + sText.subList(1, lastDate + 1))
.map { it.toInt() }.max() ?: 0
}
}
} catch (e: IOException) {
println("Невозможно прочесть файл")
}

return 0
}








 */