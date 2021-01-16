package sd.design.patterns.simplified.examples.memento.editor;

public class EditorText {
    private String value = "";

    public void addText(final String textToAdd) {
        value += textToAdd;
    }

    public String getValue() {
        return value;
    }

    public void undo(final EditorTextMementoManager memento) {
        value = memento.restore();
    }
}
