package chapter13_Visitor;

import java.util.Iterator;

/** File과 Directory의 상위 클래스가 되는 추상 클래스 (Acceptor 인터페이스를 구현) */
public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
