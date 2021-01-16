package sd.design.patterns.simplified.examples.memento.editor;

public class Main {
    public static void main(String[] args) {
        final EditorText editorText = new EditorText();
        final EditorTextMementoManager mementoManager = new EditorTextMementoManager();

        editorText.addText("This is first line");
        mementoManager.save(editorText);

        editorText.addText("\nThis is second line");
        mementoManager.save(editorText);

        editorText.addText("\nThis is third line");

        System.out.println(editorText.getValue());

        System.out.println("-----Text after undo--------");
        editorText.undo(mementoManager);
        System.out.println(editorText.getValue());
        System.out.println("-----Text after undo--------");
        editorText.undo(mementoManager);
        System.out.println(editorText.getValue());
    }
}
