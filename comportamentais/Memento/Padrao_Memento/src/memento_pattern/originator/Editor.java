package memento_pattern.originator;

import memento_pattern.memento.EditorMemento;

public class Editor {
    private String text = "";

    public void type(String newText) {
        this.text = newText;
    }

    public String getText() {
        return this.text;
    }

    public EditorMemento save() {
        return new EditorMemento(this.text);
    }

    public void restore(EditorMemento memento) {
        this.text = memento.getSavedText();
    }

    public static class EditorMemento {
        private final String text;

        public EditorMemento(String text) {
            this.text = text;
        }

        public String getSavedText() {
            return text;
        }
    }
}
