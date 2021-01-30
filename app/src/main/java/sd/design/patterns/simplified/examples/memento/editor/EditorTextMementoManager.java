package sd.design.patterns.simplified.examples.memento.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorTextMementoManager {
    private final Deque<String> mementos = new ArrayDeque<>();

    public void save(final EditorText text) {
        mementos.push(text.getValue());
    }
    public String restore() {
        return mementos.pop();
    }
}
