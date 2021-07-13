package com.abdul.bajajfinserv.data

import com.abdul.bajajfinserv.R
import com.abdul.bajajfinserv.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.aff1),
            Affirmation(R.string.aff2),
            Affirmation(R.string.aff3),
            Affirmation(R.string.aff4),
            Affirmation(R.string.aff5),
            Affirmation(R.string.aff6),
            )
    }
}