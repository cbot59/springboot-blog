package com.hendisantika.springbootblog.service;

import com.hendisantika.springbootblog.model.Comment;

/**
 * Created by IntelliJ IDEA.
 * Project : sprinboot-blog
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-12
 * Time: 05:29
 */
public interface CommentService {

    Comment save(Comment comment);
}