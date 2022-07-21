package ru.shvec.composition.domain.usecases

import ru.shvec.composition.domain.entity.GameSettings
import ru.shvec.composition.domain.entity.Level
import ru.shvec.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}