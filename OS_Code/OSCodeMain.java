//import java.io.*;
//import java.lang.ProcessBuilder;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            // Create a new process
//            ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
//            Process process = processBuilder.start();
//
//            System.out.println("Parent PID: " + ProcessHandle.current().pid());
//            System.out.println("Child PID: " + process.pid());
//
//            // Wait for the child process to exit
//            process.waitFor();
//        } catch (IOException | InterruptedException e) {
//            System.err.println("Process creation failed!");
//        }
//    }
//}


//import java.io.*;
//import java.nio.file.*;
//
//public class Main {
//    public static void main(String[] args) {
//        String fileName = "example.txt";
//
//        try {
//            // Create or open file
//            File file = new File(fileName);
//            if (file.createNewFile()) {
//                System.out.println("File created successfully!");
//            } else {
//                System.out.println("File already exists!");
//            }
//
//            // Write to file
//            String data = "Hello, Windows File Handling!";
//            try (FileWriter writer = new FileWriter(file)) {
//                writer.write(data);
//                System.out.println("Written to file: " + data);
//            }
//
//            // Read from file
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                String content = reader.readLine();
//                System.out.println("Read from file: " + content);
//            }
//
//            // Get file size
//            System.out.println("File size: " + file.length() + " bytes");
//
//        } catch (IOException e) {
//            System.err.println("Error: " + e.getMessage());
//        }
//    }
//}



//import java.io.*;
//import java.nio.file.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Path dirPath = Paths.get("test_dir");
//        Path filePath = dirPath.resolve("test_file.txt");
//        Path hardLinkPath = dirPath.resolve("hardlink.txt");
//
//        try {
//            // Create directory
//            Files.createDirectories(dirPath);
//            System.out.println("Directory created.");
//
//            // Create file inside directory
//            Files.createFile(filePath);
//            System.out.println("File created inside directory.");
//
//            // Create hard link
//            Files.createLink(hardLinkPath, filePath);
//            System.out.println("Hard link created.");
//
//            // Delete hard link
//            Files.delete(hardLinkPath);
//            System.out.println("Hard link removed.");
//
//            // Remove directory
//            Files.delete(filePath);
//            Files.delete(dirPath);
//            System.out.println("Directory removed.");
//
//        } catch (IOException e) {
//            System.err.println("Error: " + e.getMessage());
//        }
//    }
//}

//import java.util.concurrent.Semaphore;
//
//class ReaderWriter {
//    private int readCount = 0;
//    private final Semaphore mutex = new Semaphore(1);
//    private final Semaphore writeLock = new Semaphore(1);
//
//    public void read() throws InterruptedException {
//        mutex.acquire();
//        readCount++;
//        if (readCount == 1) writeLock.acquire(); // First reader locks writers
//        mutex.release();
//
//        System.out.println(Thread.currentThread().getName() + " is reading...");
//        Thread.sleep(500);
//
//        mutex.acquire();
//        readCount--;
//        if (readCount == 0) writeLock.release(); // Last reader unlocks writer
//        mutex.release();
//    }
//
//    public void write() throws InterruptedException {
//        writeLock.acquire();
//        System.out.println(Thread.currentThread().getName() + " is writing...");
//        Thread.sleep(1000);
//        writeLock.release();
//    }
//}
//
//class Reader extends Thread {
//    private final ReaderWriter rw;
//
//    public Reader(ReaderWriter rw) {
//        this.rw = rw;
//    }
//
//    public void run() {
//        try {
//            rw.read();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class Writer extends Thread {
//    private final ReaderWriter rw;
//
//    public Writer(ReaderWriter rw) {
//        this.rw = rw;
//    }
//
//    public void run() {
//        try {
//            rw.write();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        ReaderWriter rw = new ReaderWriter();
//        for (int i = 0; i < 3; i++) new Reader(rw).start();
//        for (int i = 0; i < 2; i++) new Writer(rw).start();
//    }
//}
//

import java.util.concurrent.Semaphore;

class DiningPhilosophers {
    private final Semaphore[] forks = new Semaphore[5];

    public DiningPhilosophers() {
        for (int i = 0; i < 5; i++) forks[i] = new Semaphore(1);
    }

    public void dine(int philosopher) throws InterruptedException {
        int leftFork = philosopher;
        int rightFork = (philosopher + 1) % 5;

        if (philosopher % 2 == 0) { // Avoid deadlock by asymmetric fork picking
            forks[leftFork].acquire();
            forks[rightFork].acquire();
        } else {
            forks[rightFork].acquire();
            forks[leftFork].acquire();
        }

        System.out.println("Philosopher " + philosopher + " is eating...");
        Thread.sleep(1000);

        forks[leftFork].release();
        forks[rightFork].release();

        System.out.println("Philosopher " + philosopher + " finished eating.");
    }
}

class Philosopher extends Thread {
    private final int id;
    private final DiningPhilosophers table;

    public Philosopher(int id, DiningPhilosophers table) {
        this.id = id;
        this.table = table;
    }

    public void run() {
        try {
            while (true) {
                System.out.println("Philosopher " + id + " is thinking...");
                Thread.sleep(500);
                table.dine(id);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class OSCodeMain {
    public static void main(String[] args) {
        DiningPhilosophers table = new DiningPhilosophers();
        for (int i = 0; i < 5; i++) new Philosopher(i, table).start();
    }
}
