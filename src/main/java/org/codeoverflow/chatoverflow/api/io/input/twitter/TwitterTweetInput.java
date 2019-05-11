package org.codeoverflow.chatoverflow.api.io.input.twitter;

import org.codeoverflow.chatoverflow.api.io.input.Input;

public interface TwitterTweetInput extends Input {
    String getTimeLine();
    Boolean sendTweet(String status);
}
