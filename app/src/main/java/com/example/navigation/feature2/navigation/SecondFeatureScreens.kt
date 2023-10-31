package com.example.navigation.feature2.navigation

import android.net.Uri
import com.example.navigation.feature2.data.TransferData
import com.google.gson.Gson

sealed class SecondFeatureScreens(val route: String) {

    object Courses : SecondFeatureScreens(COURSES_ROUTE)

    object IdScreen : SecondFeatureScreens(ID_ROUTE) {

        private const val ROUTE_FOR_ARGS = "ID"

        fun getRouteWithArgs(id: Int): String {
            return "$ROUTE_FOR_ARGS/${id}"
        }
    }

    object JsonScreen : SecondFeatureScreens(JSON_ROUTE) {

        private const val ROUTE_FOR_ARGS = "JSON"

        fun getRouteWithArgs(data: TransferData): String {
            val dataJson = Gson().toJson(data)
            return "$ROUTE_FOR_ARGS/${dataJson.encode()}"
        }
    }

    companion object {
        const val SECOND_FEATURE_ROUTE = "SECOND_FEATURE_ROUTE"
        const val ID_KEY = "id_key"
        const val JSON_KEY = "json_key"

        private const val COURSES_ROUTE = "COURSES"
        private const val ID_ROUTE = "ID/{$ID_KEY}"
        private const val JSON_ROUTE = "JSON/{$JSON_KEY}"
    }
}

private fun String.encode(): String {
    return Uri.encode(this)
}