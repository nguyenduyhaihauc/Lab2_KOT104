package duyndph34554.fpoly.lab2_kot104

fun main(args: Array<String>) {
    while (true) {
        println("Mời nhập tháng: ")
        var month: Int?= readLine()?.toInt()

        when(month) {
            1, 2, 3 -> println("Tháng $month thuộc quý 1")
            4, 5, 6 -> println("Tháng $month thuộc quý 2")
            7, 8, 9 -> println("Tháng $month thuộc quý 3")
            10, 11, 12 -> println("Tháng $month thuộc quý 4")
            else -> println("Tháng $month không hợp lệ")
        }

        println("Bạn có muốn nhập tiếp không(Y/N): ")
        var s: String? = readLine().toString()
        if (s == "n" || s == "N") {
            return
        }
    }

}