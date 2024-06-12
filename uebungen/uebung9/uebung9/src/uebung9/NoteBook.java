package uebung9;

public class NoteBook {

	private NoteBookGUI view;
	private NoteBookData data;
	
	public NoteBook() {
		view = new NoteBookGUI(data);
		data = new NoteBookData();	
	}
	public static void main(String[] args) {
		NoteBook notebook = new NoteBook();
		notebook.view.setVisible(true);
	}
}
