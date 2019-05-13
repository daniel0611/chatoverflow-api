package org.codeoverflow.chatoverflow.api.io.dto.chat;

/**
 * A generic channel in which messages are exchanged
 */
public class Channel {
    private final String name;

    public Channel(String name) {
        this.name = name;
    }

    /**
     * @return the name of the channel
     */
    public String getName() {
        return name;
    }
}
