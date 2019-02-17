public class CommandLine {
    public enum Command {
        push, pop, top, empty, size;
    }

    public Command command;
    public int value;

    public CommandLine(String string) {
        String[] strings = string.split(" ");
        if (strings[0].equals("push")) {
            command = Command.push;
            value = Integer.parseInt(strings[1]);
        }
        else if (strings[0].equals("pop")) {
            command = Command.pop;
        }
        else if (strings[0].equals("top")) {
            command = Command.top;
        }
        else if (strings[0].equals("empty")) {
            command = Command.empty;
        }
        else if (strings[0].equals("size")) {
            command = Command.size;
        }
    }
}
