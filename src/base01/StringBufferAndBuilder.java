package base01;

public class StringBufferAndBuilder {
    // StringBuffer & StringBuilder
    private StringBuffer stringBuffer = new StringBuffer();
    private StringBuilder stringBuilder = new StringBuilder();
    public void bufferAppend (String content) {
        this.stringBuffer.append(content);
    }
    public void bufferInsert (int start, String content) {
        stringBuffer.insert(1, content);
    }
    public void builderAppend (String content) {
        stringBuilder.append(content);
    }
    public void builderDelete (int start, int end) {
        stringBuilder.delete(start, end);
    }
    public StringBuffer getStringBuffer () {
        return this.stringBuffer;
    }
    public StringBuilder getStringBuilder () {
        return this.stringBuilder;
    }
}
