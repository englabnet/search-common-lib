package net.englab.common.search.models.search;

import net.englab.common.search.models.subtitles.SubtitleEntry;

import java.util.List;

/**
 * Represents a specific fragment of a video.
 *
 * @param youtubeVideoId        the YouTube video ID
 * @param subtitleEntryIndex    the index representing the position of
 *                              this fragment within the list of subtitle entries
 * @param subtitles the list of subtitle entries associated with the video
 */
public record VideoFragment(
        String youtubeVideoId,
        Integer subtitleEntryIndex,
        List<SubtitleEntry> subtitles
) {
}
