package repository;
import domain.Issue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IssueRepository {
    private List<Issue> items = new ArrayList<>();

    public List<Issue> getAll() {
        return items;
    }

    public Issue getById(int id) {
        for (Issue item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public boolean add(Issue item) {
        //
        return items.add(item);
        //
    }

    public boolean remove(Issue item) {
        //
        return items.remove(item);
        //
    }

    public boolean addAll(Collection<? extends Issue> items) {
        return this.items.addAll(items);
    }

    public boolean removeAll(Collection<? extends Issue> items) {
        return this.items.removeAll(items);
    }
}
