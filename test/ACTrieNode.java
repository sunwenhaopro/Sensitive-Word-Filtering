package test;



import java.util.HashMap;
import java.util.Map;

/**
 * Created by berg on 2023/6/18.
 */

public class ACTrieNode {

    // 子节点
    private Map<Character, ACTrieNode> children = new HashMap<>();

    // 匹配过程中，如果模式串不匹配，模式串指针会回退到failover继续进行匹配
    private ACTrieNode failover = null;

    private int depth;

    public Map<Character, ACTrieNode> children() {
        return children;
    }

    public void setChildren(Map<Character, ACTrieNode> children) {
        this.children = children;
    }

    public ACTrieNode failover() {
        return failover;
    }

    public void setFailover(ACTrieNode failover) {
        this.failover = failover;
    }

    public int depth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    private boolean isLeaf = false;

    public void addChildrenIfAbsent(char c) {
        children.computeIfAbsent(c, (key) -> new ACTrieNode());
    }

    public ACTrieNode childOf(char c) {
        return children.get(c);
    }

    public boolean hasChild(char c) {
        return children.containsKey(c);
    }

    @Override
    public String toString() {
        return "ACTrieNode{" +
                "failover=" + failover +
                ", depth=" + depth +
                ", isLeaf=" + isLeaf +
                '}';
    }
}
