package domain;

import java.awt.*;

public class Issue implements Comparable<Issue>{
    private int id;
    private String teg;
    private String assignee;
    private String author;
    private String label;
    private String project;
    private String milestone;
    private boolean open;



    public Issue() {

    };

    public Issue(int id, String teg, String assignee, String author, String label, String project, String milestone, boolean open) {
        this.id = id;
        this.teg = teg;
        this.assignee = assignee;
        this.author = author;
        this.label = label;
        this.project = project;
        this.milestone = milestone;
        this.open = open;
    }

    public int getId() {
        return id;
    }

    public String getTeg() {
        return teg;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getAuthor() {
        return author;
    }

    public String getLabel() {
        return label;
    }

    public String getProject() {
        return project;
    }

    public String getMilestone() {
        return milestone;
    }

    public boolean isOpen() {
        return open;
    }

    @Override
    public int compareTo(Issue o) {
        return 0;
    }
}
