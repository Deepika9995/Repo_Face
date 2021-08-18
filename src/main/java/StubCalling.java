public class StubCalling {

    public String callDisplay(String data){
        Stub s = new Stub();
        s.printString(data);
        return data;
    }

}
