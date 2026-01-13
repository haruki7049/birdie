package dev.haruki7049.birdie

fun main() {
    val code: MnemonicCode = MnemonicCode.ACONST_NULL
    println(MnemonicCode.fromAddress(1) == MnemonicCode.ACONST_NULL)
}
