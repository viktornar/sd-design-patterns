package sd.design.patterns.all.examples.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
