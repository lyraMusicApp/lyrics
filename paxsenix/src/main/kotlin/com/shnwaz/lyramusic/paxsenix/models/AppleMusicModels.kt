/*
 * Lyra Music Project (2026)
 * © Shnwaz — github.com/shnwazdeveloper
 * GPL-3.0 License | Contributors: see git history
 * Do not remove or alter this notice. - Per GPL-3.0 Section 4 & Section 5
 */
package com.shnwaz.lyramusic.paxsenix.models

import kotlinx.serialization.Serializable

@Serializable
data class AppleMusicLyricsResponse(
    val type: String? = null,
    val content: List<AppleMusicLine> = emptyList(),
)

@Serializable
data class AppleMusicLine(
    val timestamp: Long = 0,
    val text: List<AppleMusicWord> = emptyList(),
)

@Serializable
data class AppleMusicWord(
    val text: String,
    val timestamp: Long? = null,
)
