package memento_pattern.caretaker;

import memento_pattern.originator.Editor;
import memento_pattern.originator.Editor.EditorMemento;

import java.util.Stack;

public class History {

    private Editor editor = new Editor();
    private Stack<EditorMemento> history = new Stack<>();

    public void save(String newText) {
        editor.type(newText);
        history.push(editor.save());
    }

    public void undo(){
        history.pop();

        if (history.isEmpty()) {
            editor.restore(new EditorMemento(""));
            return;
        }

        editor.restore(history.peek());
    }

    public void printText(){
        System.out.println(editor.getText());
    }
}
