package org.maxwe.accountants.android.employee.workspace;

/**
 * Created by Pengwei Ding on 2015-11-25 12:10.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class WorkspaceEntity {
    private String title;
    private String content;
    private String timer;

    public WorkspaceEntity() {
        super();
    }

    public WorkspaceEntity(String title, String content, String timer) {
        this.title = title;
        this.content = content;
        this.timer = timer;
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

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }
}
