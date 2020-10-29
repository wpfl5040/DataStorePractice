package com.wpfl5.datastorepractice

import android.content.Context
import androidx.datastore.DataStore
import androidx.datastore.preferences.Preferences
import androidx.datastore.preferences.createDataStore
import androidx.datastore.preferences.edit
import androidx.datastore.preferences.preferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PreferenceDataStore(private val context: Context) {
    //create preferenceDataStore
    private val dataStore: DataStore<Preferences> = context.createDataStore("preferences")
    val counter: Preferences.Key<Int> = preferencesKey<Int>("counter")  // Key은 example_counter이고, Int형 값임

    fun readPrefDataStore() : Flow<Int> =
        dataStore.data
            .map { prefs ->
                prefs[counter] ?: 0
            }


    suspend fun plusCounter(){
        dataStore.edit {
            val currentCount = it[counter] ?: 0
            it[counter] = currentCount+1
        }
    }


}