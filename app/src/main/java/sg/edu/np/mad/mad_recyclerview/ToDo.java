package sg.edu.np.mad.mad_recyclerview;

public class ToDo {

    private String toDoText;
    private boolean status;

    public ToDo(String toDoText) {
        this.toDoText = toDoText;
        this.status = false;
    }

    public String getToDoText() {
        return toDoText;
    }

    public void setToDoText(String ttoDoText) {
        this.toDoText = toDoText;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
