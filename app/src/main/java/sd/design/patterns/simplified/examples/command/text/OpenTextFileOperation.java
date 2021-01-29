package sd.design.patterns.simplified.examples.command.text;

public class OpenTextFileOperation implements TextFileOperation {

    private final TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
