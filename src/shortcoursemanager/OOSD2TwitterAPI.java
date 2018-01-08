/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shortcoursemanager;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
/**
 * @author Harshan Madhuranga Wimalasiri
 * @version 0.0.01
 * @date 2017-June-13
 * @UWEID 15028422
 * @Degree Software Engineering Level 2
 */
public class OOSD2TwitterAPI {
    private TwitterFactory tf;
    private Twitter twitter;

    //The token and key below are based on the following twitter developer's account
    // oosd2twitter@gmail.com
    public void setupTwitterApp() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthAccessToken("4914189304-KkLnlmjghnHB44qFtMehjnlJ94rMbXFO4eLfJev");
        cb.setOAuthAccessTokenSecret("DYUfjAphHAyteVtRukgyFys157nmwbnona08aW0LDoZvH");
        cb.setOAuthConsumerKey("RAZCNBEoFWRKGwiZCdPw2HCfu");
        cb.setOAuthConsumerSecret("7SecQzkwx57t6VuudyAmQVeM0S6xs8Eddtol8LxomLbR5ek3Ue");

//        TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();
        tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();
    }
    
    public String searchTwitter(String searchterm) throws TwitterException {

        Query query = new Query(searchterm);
//        query.setSince("2016-04-6");
        query.setCount(20);//set the number of tweets to retrieve
        
        QueryResult result = twitter.search(query);
        int retweetCount = 0;
        String res = "";
        for (Status status : result.getTweets()) {

            res += "@" + status.getUser().getScreenName() + ":" + status.getText() + "\n";
//            System.out.println(status.getPlace() + "\n\n");
            retweetCount += status.getRetweetCount();
//            System.out.println("This has been retweeted " + status.getRetweetCount() + " times\n\n");
//            System.out.println("This has favourite  " + status.getFavoriteCount() + " times\n\n");

//            System.out.println("created at: " + status.getCreatedAt().toString());
//            System.out.println("THe place is " + status.getGeoLocation());
        }
        res += "Total number of retweets are: " + retweetCount + "\n";
        return res;
    }
}
