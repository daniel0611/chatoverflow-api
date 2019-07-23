package org.codeoverflow.chatoverflow.api.io.output.twitter;


import org.codeoverflow.chatoverflow.api.IsRequirement;
import org.codeoverflow.chatoverflow.api.io.output.Output;

@IsRequirement(requires = "twitter chat bot")
public interface TwitterTweetOutput extends Output {

    boolean sendTweet(String status);

}
