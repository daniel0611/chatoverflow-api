package org.codeoverflow.chatoverflow.api.plugin.configuration;

import org.codeoverflow.chatoverflow.api.io.output.chat.TwitchChatOutput;

public class Output {

    private final Requirements requirements;

    Output(Requirements requirements) {
        this.requirements = requirements;
    }

    /**
     * Requires a twitch chat login that has to be created by the user.
     */
    public Requirement<TwitchChatOutput> twitchChat(String uniqueRequirementId, String name, boolean isOptional) {
        return requirements.getOraddAndReturn(uniqueRequirementId, name, isOptional, TwitchChatOutput.class);
    }

    // Add more outputs here

}
