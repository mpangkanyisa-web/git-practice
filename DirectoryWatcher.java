import java.nio.file.*;

public class DirectoryWatcher {
    public static void main(String[] args) throws Exception {
        
        // 1. Create the WatchService (the "guard")
        WatchService watcher = FileSystems.getDefault().newWatchService();
        
        // 2. Get the path of the folder you want to monitor
        Path dir = Path.of("C:/myFolder");
        
        // 3. Register the folder with the guard, telling it what to look for
        dir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, 
                              StandardWatchEventKinds.ENTRY_MODIFY, 
                              StandardWatchEventKinds.ENTRY_DELETE);
        
        System.out.println("Watching folder for changes...");
        
        // 4. Loop forever, waiting for the OS to report an event
        while (true) {
            // This blocks (pauses the code) until a file change actually happens
            WatchKey key = watcher.take(); 
            
            for (WatchEvent<?> event : key.pollEvents()) {
                // Get the type of change (Create, Modify, or Delete)
                WatchEvent.Kind<?> kind = event.kind();
                
                // Get the name of the file that triggered it
                Path fileName = (Path) event.context();
                
                System.out.println("Event detected: " + kind.name() + " on file: " + fileName);
            }
            
            // Reset the key so it can keep listening for future events
            key.reset();
        }
    }
}
