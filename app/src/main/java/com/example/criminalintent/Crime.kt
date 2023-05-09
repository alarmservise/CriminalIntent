package com.example.criminalintent

import java.sql.Date
import java.util.UUID

data class Crime (val id: UUID = UUID.randomUUID(),
                  var title: String = "",
                  var date: Date = Date(2018,10,14),
                  var isSolved: Boolean = false)
