package com.example.swanset

interface Platform {
  val name: String
}

expect fun getPlatform(): Platform