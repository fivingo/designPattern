package chapter11_Composite;

/** File과 Directory를 동일시하는 추상 클래스 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
