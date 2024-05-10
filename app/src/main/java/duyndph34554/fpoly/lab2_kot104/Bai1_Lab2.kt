package duyndph34554.fpoly.lab2_kot104

fun main(args: Array<String>) {

    while (true) {
        println("Mời nhập gia trị a: ")
        var a: Double? = readLine()?.toDouble()
        if (a == null) return
        println("Mời nhập giá trị b: ")
        var b: Double? = readLine()?.toDouble()
        if (b == null) return

        if (a == 0.0 && b == 0.0){
            println("Phương trình vô số nghiệm")
        } else if (a == 0.0 && b != 0.0) {
            println("Phương trình vô nghiệm")
        } else {
            println("Phuong trình có nghiệm x = ${-b/a}")
        }

        println("Bạn có muon nhập tiếp không(Y/N): ")
        var s:String?= readLine()
        if (s == "n" || s == "N") {
            return
        }
    }

}