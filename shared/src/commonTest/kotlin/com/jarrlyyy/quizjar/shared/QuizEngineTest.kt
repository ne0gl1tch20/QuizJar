package com.jarrlyyy.quizjar.shared

import kotlin.test.Test
import kotlin.test.assertEquals

class QuizEngineTest {
    @Test
    fun correctAnswersAwardPoints() {
        assertEquals(100, QuizEngine().score(true))
    }

    @Test
    fun wrongAnswersAwardNoPoints() {
        assertEquals(0, QuizEngine().score(false))
    }
}
