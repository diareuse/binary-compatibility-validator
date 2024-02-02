/*
 * Copyright 2016-2024 JetBrains s.r.o.
 * Use of this source code is governed by the Apache 2.0 License that can be found in the LICENSE.txt file.
 */

package foo

data class Incremental(val id: Any) {
    fun integer() = 42
}

fun sum(vararg integers: Int) = integers.sum()

val id: Any = 42