package manager;

import domain.Issue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.IssueRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IssueManagerTest {
    IssueRepository issueRepository = new IssueRepository();
    IssueManager issueManager = new IssueManager(issueRepository);
    Issue issue1 = new Issue(3432, "teg1", "Gromov", "Petrova", "label1", "Scar", "milestone1", true);
    Issue issue2 = new Issue(3522, "teg2", "Gromov", "Konov", "label2", "Nascar", "milestone2", true);
    Issue issue4 = new Issue(3978, "teg4", "Popov", "Rogov", "label3", "Screen", "milestone3", false);
    Issue issue5 = new Issue(542, "teg5", "Leonov", "Nefedov", "label4", "People", "milestone4", false);
    Issue issue6 = new Issue(9432, "teg6", "Leonova", "Nefedova", "label5", "People", "milestone4", false);

    @BeforeEach
    public void SetUp() {
        issueManager.add(issue1);
        issueManager.add(issue2);
        issueManager.add(issue4);
        issueManager.add(issue5);
        issueManager.add(issue6);
    }

    @Test
    void add() {
    }

    @Test
    void findOpen() {
    }

    @Test
    void findClosed() {
    }

    @Test
    void filterByAuthor() {
    }

    @Test
    void filterByLabel() {
    }

    @Test
    void filterByAssignee() {
    }
}