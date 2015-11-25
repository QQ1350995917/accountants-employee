package org.maxwe.accountants.android.employee.message;

/**
 * Created by Pengwei Ding on 2015-11-25 11:05.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class MessageEntity {
    private String title;
    private String content;
    private int explore;
    private int join;

    public MessageEntity() {
        super();
    }

    public MessageEntity(String title, String content, int explore, int join) {
        this.title = title;
        this.content = content;
        this.explore = explore;
        this.join = join;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getExplore() {
        return explore;
    }

    public void setExplore(int explore) {
        this.explore = explore;
    }

    public int getJoin() {
        return join;
    }

    public void setJoin(int join) {
        this.join = join;
    }
}
