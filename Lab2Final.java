import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Iterator;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: Ahmed Guled
// Notes: The instructions are found in comments through the code starting with "Step n"
//        Please leave the comments and add your code just after the comment.
//        Use the examples in the book to complete the lab.

class Main {
    public static void main(String[] args) {
        Lab2 lab = new Lab2();
        // Comment/Uncomment the following 3 method calls as you work on each method.
        // No code should be added to the main method. All of your code will go into the
        // methods in Lab2.
        lab.linkedList();
        lab.queue();
        lab.stack();
    }
}

class Lab2 {
    public void linkedList() {
        // 1. Create a LinkedList<String> object called progLanguages
        LinkedList<String> progLanguage = new LinkedList<>();

        // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
        progLanguage.add("Java");
        progLanguage.add("Python");
        progLanguage.add("JavaScript");
        progLanguage.add("C++");

        // 3. Remove the element "C++" from the list using .remove()
        progLanguage.remove("C++");

        // 4. Add an element "HTML" at index 2.
        progLanguage.add(2, "HTML");

        // 5. Iterate over progLanguages and use println() to output each element. You
        // must create an Iterator<string> and use hasNext(), and next() similar to the
        // example in our book.
        Iterator<String> iterator = progLanguage.iterator();

        while (iterator.hasNext()) {
            String language = iterator.next();
            System.out.println(language); // Output each element
        }
    }

    public void queue() {
        // 6. Create a Queue<String> called q
        Queue<String> q = new LinkedList<>();

        // 7. Add 5 first names to q.
        q.add("Ahmed");
        q.add("Mohamed");
        q.add("Guled");
        q.add("Fidow");
        q.add("Hassan");

        // 8. Uncomment the following line
        System.out.println("Elements of queue: " + q);

        // 9. Remove the head of the queue and assign it to a String variable
        // removedElement.
        // Display the value of "Removed element: " + removedElement
        String removedElement = q.remove();
        System.out.println("Removed element: " + removedElement);

        // 10. View the head of the queue using peek(). Output it's value.
        System.out.println("Peeked element: " + q.peek());

        // 11. Using for(String element : q), output all of the values in the queue
        for (String element : q) {
            System.err.println(element);
        }
    }

    public void stack() {
        // 12. Create a Stack<String> called bookStack
        Stack<String> bookStack = new Stack<>();

        // 13. Push the following book titles onto bookStack: "Clean Code", "Design
        // Patterns", "Pragmatic Programmer"
        bookStack.push("Clean Code");
        bookStack.push("Design Patterns");
        bookStack.push("Pragmatic Programmer");

        // 14. pop() 1 book off the stack. Display it's value
        System.err.println("Popped value: " + bookStack.pop());

        // 15. Use the peek() method to view the top book on the stack
        System.err.println("Peeked value: " + bookStack.peek());

        // 16. push() "Web DB Technologies" onto the stack
        bookStack.push("Web DB Technologies");

        // 17. Use the peek() method to view the top book on the stack
        System.err.println("Peeked value: " + bookStack.peek());

        // 18. Search for "Design Patterns" in the stack. Display the results of the
        // search.
        int position = bookStack.search("Design Patterns");
        if (position != -1) {
            System.err.println("Found 'Design Patterns' at position: " + position);
        } else {
            System.err.println("'Design Patterns' not found in the stack.");
        }

        // 19. Call empty(). Output the results
        System.err.println("Stack empty: " + bookStack.isEmpty());

        // 20. Print the titles of all of the books on the stack
        for (String book : bookStack) {
            System.err.println(book);
        }
    }
}