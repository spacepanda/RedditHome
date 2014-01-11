package com.example.reddithome.Api;

import android.net.Uri;

/**
 * Created by Logan on 1/10/14.
 */
public class ApiHelper {

    class Param {
        String type;
        String query;
        public Param (String mType, String mQuery) {
            type = mType;
            query = mQuery;
        }
    }
    private final static String SCHEME = "HTTP://";
    private final static String SECURE_SCHEME = "HTTPS://";
    private final static String REDDIT = "reddit.com/";
    private final static String SSL_REDDIT = "ssl.reddit.com";
    private final static String OAUTH_REDDIT = "https://oauth.reddit.com";
    private final static String API_TYPE = "api_type";
    private final static String JSON = "json";

    //Account Strings
    private final static String clear_sessions = "/api/clear_sessions";
    private final static String delete_user = "/api/delete_user";
    private final static String LOGIN = "/api/login";
    private final static String me_json = "/api/me.json";
    private final static String register = "/api/register";
    private final static String update = "/api/update";
    private final static String me_v1 = "/api/v1/me";

    //Captcha
    private final static String needs_captcha = "/api/needs_captcha.json";
    private final static String new_captcha = "/api/new_captcha";
    private final static String captcha_iden = "/captcha/iden";

    //flair
    private final static String clearflair = "/api/clearflairtemplates";
    private final static String deleteflair = "/api/deleteflair";
    private final static String deleteflairtemplate = "/api/deleteflairtemplate";
    private final static String flair = "/api/flair";
    private final static String flairconfig = "/api/flairconfig";
    private final static String flaircsv = "/api/flaircsv";
    private final static String flairlist = "/api/flairlist";
    private final static String flairtemplate = "/api/flairtemplate";
    private final static String selectflair = "/api/selectflair";
    private final static String setflairenabled = "/api/setflairenabled";

    //links & comments
    private final static String comment = "/api/comment";
    private final static String delete = "/api/del";
    private final static String editusertext = "/api/editusertext";
    private final static String hide = "/api/hide";
    private final static String info = "/api/info";
    private final static String marknsfw = "/api/marknsfw";
    private final static String morechildren = "/api/morechildren";
    private final static String report = "/api/report";
    private final static String save = "/api/save";
    private final static String set_content_mode = "/api/set_contest_mode";
    private final static String set_subreddit_sticky = "/api/set_subreddit_sticky";
    private final static String submit = "/api/submit";
    private final static String unhide = "/api/unhide";
    private final static String unmarknsfw = "/api/unmarknsfw";
    private final static String unsave = "/api/unsave";
    private final static String vote = "/api/vote";

    //listings
    private final static String names_by_id = "/by_id/names";
    private final static String comments_article = "/comments/article";
    private final static String CONTROVERSIAL = "/controversial";
    private final static String HOT = "/hot";
    private final static String NEW = "/new";
    private final static String RANDOM = "/random";
    private final static String TOP = "/top";
    private final static String SORT = "/sort";

    //private messages
    private final static String BLOCK = " /api/block";
    private final static String COMPOSE = "/api/compose";
    private final static String READ_MESSAGE = "/api/read_message";
    private final static String UNREAD_MESSAGE = "/api/unread_message";
    private final static String INBOX = "/message/inbox";
    private final static String SENT = " /message/sent";
    private final static String UNREAD = "/message/unread";
    private final static String WHERE = "/message/where";

    //search
    private final static String SEARCH = "/search";

    //subreddits (more to be implemented
    private final static String SUBSCRIBE = "/api/subscribe";

    //Need to implement a few more.

    public boolean login (String user, String pass) {
        String path = LOGIN + "/" + user;
        Param [] params = new Param [] {
                new Param("user", user),
                new Param("passwd", pass),
                new Param(API_TYPE, JSON)};
        Uri mUri = buildUri(SECURE_SCHEME, REDDIT, path, params);

        return false;
    }


    public Uri buildUri(String scheme, String authority, String path, Param [] params) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(scheme);
        builder.authority(authority);
        builder.appendPath(path);
        for(Param param: params ) {
            builder.appendQueryParameter(param.type, param.query);
        }
        return builder.build();
    }














}
