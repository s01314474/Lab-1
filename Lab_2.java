import java.util.*;

public class Main {
    
    public static void linkedList() {
        // Step 1: Create a LinkedList<String> object called progLanguages
        LinkedList<String> progLanguages = new LinkedList<>();

        // Step 2: Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
        progLanguages.add("Java");
        progLanguages.add("Python");
        progLanguages.add("JavaScript");
        progLanguages.add("C++");

        // Step 3: Remove the element "C++" from the list using .remove()
        progLanguages.remove("C++");

        // Step 4: Add an element "HTML" at index 2
        progLanguages.add(2, "HTML");

        // Step 5: Iterate over progLanguages using an Iterator<String>
        Iterator<String> iterator = progLanguages.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void queue() {
        // Step 6: Create a Queue<String> called q
        Queue<String> q = new LinkedList<>();

        // Step 7: Add 5 first names to q
        q.add("Akshay");
        q.add("Bunny");
        q.add("Chakri");
        q.add("Danesh");
        q.add("Maneesh");

        // Step 8: Uncommented
        System.out.println("Elements of queue: " + q);

        // Step 9: Remove the head of the queue and assign it to removedElement
        String removedElement = q.poll();
        System.out.println("Removed element: " + removedElement);

        // Step 10: View the head of the queue using peek()
        System.out.println("Head of queue: " + q.peek());

        // Step 11: Using for(String element : q) to output all of the values in the queue
        for (String element : q) {
            System.out.println(element);
        }
    }

    public static void stack() {
        // Step 13: Create a Stack<String> called bookStack
        Stack<String> bookStack = new Stack<>();

        // Step 14: Push book titles onto bookStack
        bookStack.push("Clean Code");
        bookStack.push("Design Patterns");
        bookStack.push("Pragmatic Programmer");

        // Step 15: Pop 1 book off the stack
        String poppedBook = bookStack.pop();
        System.out.println("Popped book: " + poppedBook);

        // Step 16: View the top book on the stack using peek()
        System.out.println("Top book: " + bookStack.peek());

        // Step 17: Push "Web DB Technologies" onto the stack
        bookStack.push("Web DB Technologies");

        // Step 18: View the top book on the stack using peek()
        System.out.println("Top book: " + bookStack.peek());

        // Step 19: Search for "Design Patterns" in the stack
        int position = bookStack.search("Design Patterns");
        System.out.println("Position of 'Design Patterns': " + position);

        // Step 20: Call empty() and output the result
        System.out.println("Is the stack empty? " + bookStack.empty());

        // Step 21: Print all the titles of the books on the stack
        for (String book : bookStack) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        linkedList();
        queue();
        stack();
    }
}
