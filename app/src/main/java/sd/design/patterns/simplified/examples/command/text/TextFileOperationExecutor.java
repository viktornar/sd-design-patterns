package sd.design.patterns.simplified.examples.command.text;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {
    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    void addCommand(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
    }

    void execute() {
        textFileOperations.forEach(t -> System.out.println(t.execute()));
    }
}
