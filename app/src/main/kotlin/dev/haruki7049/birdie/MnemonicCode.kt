package dev.haruki7049.birdie;

enum class MnemonicCode(val id: Int) {
    NOP(0),
    ACONST_NULL(1),
    ICONST_M1(2);

    companion object {
        fun fromAddress(id: Int): MnemonicCode? = entries.firstOrNull { it.id == id }
    }
}
