package AlgoritmyLesson6;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;

public class Trees {

    public static void main(String[] args) {
        List<Tree> treeList = new LinkedList<>();
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 20; i++) {
            Tree tree = new Tree();
            for (int j = 0; j < 63 - random.nextInt(32); j++) {
                tree.insert(100 - random.nextInt(201));
            }
            treeList.add(tree);
        }

        int count = 0;
        for (int i = 0; i < treeList.size(); i++) {
            count += treeList.get(i).balance() ? 1 : 0;
        }

        System.out.println(String.format("%s %d", "Total trees count:", treeList.size()));
        System.out.println(String.format("%s %d%s", "Balanced:", count * 100 / treeList.size(), "%"));
    }
}
