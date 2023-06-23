package SymbolTable;

import classes.DataType;

public class MyIdentifier {
    private String name;
    private DataType type;
    private int lineNumber;
    private Object  initialValue;

    public MyIdentifier(String name, DataType  type,Object initialValue, int lineNumber) {
        this.name = name;
        this.type = type;
        this.initialValue=initialValue;
        this.lineNumber = lineNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType  getType() {
        return type;
    }

    public void setType(DataType  type) {
        this.type = type;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Object getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(Object initialValue) {
        this.initialValue = initialValue;
    }

    @Override
    public String toString() {
        return name + " (" + type.getString() + ") at line " + lineNumber + " initial value = " + initialValue;
    }
}
