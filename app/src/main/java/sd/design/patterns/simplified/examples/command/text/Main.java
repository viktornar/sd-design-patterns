package sd.design.patterns.simplified.examples.command.text;

public class Main {
    public static void main(String... args) {
        TextFile file = new TextFile("Test.xml");
        TextFileOperation open = new OpenTextFileOperation(file);
        TextFileOperation save = new SaveTextFileOperation(file);
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        textFileOperationExecutor.addCommand(open);
        textFileOperationExecutor.addCommand(save);

        textFileOperationExecutor.execute();
    }
}
