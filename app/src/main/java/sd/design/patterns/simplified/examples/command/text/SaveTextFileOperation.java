package sd.design.patterns.simplified.examples.command.text;

public class SaveTextFileOperation implements TextFileOperation {
    private final TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
