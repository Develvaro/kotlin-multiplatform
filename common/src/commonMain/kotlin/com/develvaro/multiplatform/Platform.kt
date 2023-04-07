package com.develvaro.multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform