package org.maxwe.accountants.android.employee.information;

/**
 * Created by Pengwei Ding on 2015-11-25 12:59.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class InformationEntity {
    private String title;
    private int icon;
    private String type;

    public InformationEntity() {
        super();
    }

    public InformationEntity(String title, int icon, String type) {
        this.title = title;
        this.icon = icon;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
