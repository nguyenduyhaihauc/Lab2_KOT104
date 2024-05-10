package duyndph34554.fpoly.lab2_kot104

fun main(args: Array<String>) {
    while (true) {
        println("Mời nhập năm: ")
        var year: Int? = readLine()?.toInt()
        if (year == null) return
        if (year <= 0) {
            println("Năm phải lơn hon 0")
            return
        }

        if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        println("Bạn có muốn nhập tiếp không(Y/N): ")
        var s: String? = readLine()
        if (s == "n" || s == "N") {
            return
        }
    }
}