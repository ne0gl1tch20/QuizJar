package com.jarrlyyy.quizjar.shared

/** Authoritative quiz rules shared by all frontends. */
class QuizEngine {
    fun score(isCorrect: Boolean, basePoints: Int = 100): Int =
        if (isCorrect) basePoints.coerceAtLeast(0) else 0
}
