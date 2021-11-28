package manager;

import domain.Issue;
import repository.IssueRepository;

import java.util.Arrays;

public class IssueManager {
    private IssueRepository repository;

    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }

    public void add(Issue issue) {
        repository.add(issue);
    }

    public Issue[] findOpen(boolean open) {
        Issue[] result = new Issue[0];
        for (Issue issue : repository.getAll()) {
            if (matches(issue, true)) {
                Issue[] tmp = new Issue[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = issue;
                result = tmp;
                Arrays.sort(result);
            }

        }
        return result;

    }

    public boolean matches(Issue issue, boolean open) {
        if (issue.isOpen() == open) {
            return true;
        }
        return false;
    }

    public Issue[] findClosed(boolean open) {
        Issue[] result = new Issue[0];
        for (Issue issue : repository.getAll()) {
            if (matches(issue, false)) {
                Issue[] tmp = new Issue[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = issue;
                result = tmp;
                Arrays.sort(result);
            }

        }
        return result;

    }


    public Issue[] filterByAuthor(String author) {
        Issue[] result = new Issue[0];
        for (Issue issue : repository.getAll()) {
            if (matchesByAuthor(issue, author)) {
                Issue[] tmp = new Issue[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = issue;
                result = tmp;
                Arrays.sort(result);
            }

        }
        return result;

    }

    public boolean matchesByAuthor(Issue issue, String author) {
        if (issue.getAuthor().contains(author)) {
            return true;
        }
        return false;
    }

    public Issue[] filterByLabel(String label) {
        Issue[] result = new Issue[0];
        for (Issue issue : repository.getAll()) {
            if (matchesByLabel(issue, label)) {
                Issue[] tmp = new Issue[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = issue;
                result = tmp;
                Arrays.sort(result);
            }

        }
        return result;

    }

    public boolean matchesByLabel(Issue issue, String label) {
        if (issue.getLabel().contains(label)) {
            return true;
        }
        return false;
    }

    public Issue[] filterByAssignee(String assignee) {
        Issue[] result = new Issue[0];
        for (Issue issue : repository.getAll()) {
            if (matchesByLabel(issue, assignee)) {
                Issue[] tmp = new Issue[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = issue;
                result = tmp;
                Arrays.sort(result);
            }

        }
        return result;

    }

    public boolean matchesByAssignee(Issue issue, String assignee) {
        if (issue.getAssignee().contains(assignee)) {
            return true;
        }
        return false;
    }


}

