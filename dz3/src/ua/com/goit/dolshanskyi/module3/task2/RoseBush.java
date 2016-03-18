package ua.com.goit.dolshanskyi.module3.task2;

import java.util.List;

public class RoseBush extends Flower{//куст роз не содержит в себе ни одной розы?

    private List<Rose> roses;

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }
}
