package com.thinkcode.spacex_tracker.data.model

data class LaunchesUpcomingModel(
    val auto_update: Boolean,
    val capsules: List<Any>,
    val crew: List<Any>,
    val date_local: String,
    val date_precision: String,
    val date_unix: Int,
    val date_utc: String,
    val details: Any,
    val failures: List<Any>,
    val flight_number: Int,
    val id: String,
    val launchpad: String,
    val links: Links,
    val name: String,
    val rocket: String,
    val success: Any,
    val upcoming: Boolean,

)