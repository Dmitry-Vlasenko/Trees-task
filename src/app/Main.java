package app;

import app.models.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            int randomNumber = random.nextInt(101);
            list.add(randomNumber);
        }
        BinaryTree tree = new BinaryTree();
        list.forEach(tree::insert);
        tree.inorderTraversal(tree.root);
        System.out.println();
        tree.preorderTraversal(tree.root);
        System.out.println();
        tree.postorderTraversal(tree.root);
        System.out.println();
    }
}