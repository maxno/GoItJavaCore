package ua.com.goit.dolshanskyi.module3.task2;
import java.util.List;
public class Bouquet {
    private List<Flower> flowers;
    private List<Tulip> tulips;
    private List<RoseBush> roseBushs;
    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Tulip> getTulips() {
        return tulips;
    }

    public void setTulips(List<Tulip> tulips) {
        this.tulips = tulips;
    }

    public List<RoseBush> getRoseBushs() {
        return roseBushs;
    }

    public void setRoseBushs(List<RoseBush> roseBushs) {
        this.roseBushs = roseBushs;
    }
}
