package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.input.SampleInput;
import org.codeoverflow.chatoverflow.api.io.input.chat.MockUpChatInput;
import org.codeoverflow.chatoverflow.api.io.input.chat.TwitchChatInput;
import org.codeoverflow.chatoverflow.api.io.input.stat.TwitchStatInput;
import org.codeoverflow.chatoverflow.api.io.input.twitter.TwitterTweetInput;

public class Input {

    private final Requirements requirements;

    Input(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     * Requires a twitch chat login that has to be created by the user.
     */
    public Requirement<TwitchChatInput> twitchChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, TwitchChatInput.class);
    }

    public Requirement<TwitchStatInput> twitchStats(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, TwitchStatInput.class);
    }

    public Requirement<MockUpChatInput> mockupChat(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, MockUpChatInput.class);
    }

    public Requirement<SampleInput> sampelInput(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, SampleInput.class);
    }

    public Requirement<TwitterTweetInput> twitterStream(String uniqueRequirementId, String displayName, boolean isOptional) {
        return requirements.requireInput(uniqueRequirementId, displayName, isOptional, TwitterTweetInput.class);
    }

    // Add more inputs here

}
