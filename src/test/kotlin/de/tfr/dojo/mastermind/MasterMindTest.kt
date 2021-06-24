package de.tfr.dojo.mastermind

import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.hamcrest.CoreMatchers.`is` as Is

internal class MasterMindTest {

    @Test
    fun `Test game name`() {
        assertEquals("Master Mind", MasterMind().game())
        assertThat(MindMaster().gameName(), Is("Master Mind"))
    }
}