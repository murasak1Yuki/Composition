package ru.shvec.composition.domain.repository

import ru.shvec.composition.domain.entity.GameSettings
import ru.shvec.composition.domain.entity.Level
import ru.shvec.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
         maxSumValue: Int,
         countOfOptions: Int,
    ) : Question

    fun getGameSettings(level: Level) : GameSettings
}