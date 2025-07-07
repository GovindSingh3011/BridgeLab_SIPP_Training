import java.util.ArrayList;

public class Q7_SocialMediaFriendConnections {
    private Node head;

    public Q7_SocialMediaFriendConnections() {
        head = null;
    }

    public static void main(String[] args) {
        Q7_SocialMediaFriendConnections network = new Q7_SocialMediaFriendConnections();
        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 30);
        network.addUser(3, "Charlie", 28);
        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.displayFriends(1);
        network.findMutualFriends(1, 2);
        network.countFriends(1);
        network.searchByName("Bob");
        network.removeFriendConnection(1, 2);
        network.displayFriends(1);
    }

    // Add user
    public void addUser(int userId, String name, int age) {
        Node newNode = new Node(userId, name, age);
        newNode.next = head;
        head = newNode;
    }

    // Add friend connection
    public void addFriendConnection(int userId1, int userId2) {
        Node user1 = findUser(userId1);
        Node user2 = findUser(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.add(userId2);
            user2.friendIds.add(userId1);
            System.out.println("Friend connection added between " + userId1 + " and " + userId2);
        } else {
            System.out.println("One or both users not found");
        }
    }

    // Remove friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        Node user1 = findUser(userId1);
        Node user2 = findUser(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
            System.out.println("Friend connection removed between " + userId1 + " and " + userId2);
        } else {
            System.out.println("One or both users not found");
        }
    }

    // Find mutual friends
    public void findMutualFriends(int userId1, int userId2) {
        Node user1 = findUser(userId1);
        Node user2 = findUser(userId2);
        if (user1 != null && user2 != null) {
            System.out.println("Mutual friends between " + userId1 + " and " + userId2 + ":");
            for (int friendId : user1.friendIds) {
                if (user2.friendIds.contains(friendId)) {
                    Node mutual = findUser(friendId);
                    System.out.println(mutual.userId + ", " + mutual.name);
                }
            }
        } else {
            System.out.println("One or both users not found");
        }
    }

    // Display friends
    public void displayFriends(int userId) {
        Node user = findUser(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ":");
            for (int friendId : user.friendIds) {
                Node friend = findUser(friendId);
                System.out.println(friend.userId + ", " + friend.name);
            }
        } else {
            System.out.println("User not found");
        }
    }

    // Search by user ID
    public void searchByUserId(int userId) {
        Node user = findUser(userId);
        if (user != null) {
            System.out.println(user.userId + ", " + user.name + ", " + user.age);
        } else {
            System.out.println("User ID not found");
        }
    }

    // Search by name
    public void searchByName(String name) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                System.out.println(current.userId + ", " + current.name + ", " + current.age);
            }
            current = current.next;
        }
    }

    // Count friends
    public void countFriends(int userId) {
        Node user = findUser(userId);
        if (user != null) {
            System.out.println("Number of friends for " + user.name + ": " + user.friendIds.size());
        } else {
            System.out.println("User not found");
        }
    }

    private Node findUser(int userId) {
        Node current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    class Node {
        int userId;
        String name;
        int age;
        ArrayList<Integer> friendIds;
        Node next;

        Node(int userId, String name, int age) {
            this.userId = userId;
            this.name = name;
            this.age = age;
            this.friendIds = new ArrayList<>();
            this.next = null;
        }
    }
}