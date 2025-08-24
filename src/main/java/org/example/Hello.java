public class Hello
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Navin");
        sb.append("Reddy");  //  appending the name reddy to the navin string object in the heap memeory

        sb.insert(5," java ");        //insert java string
        sb.setLength(30);          // set length to 30 fill in future
        sb.ensureCapacity(100);          // change capacity
        sb.deleteCharAt(3);        // delete character
        System.out.println(sb.capacity());// capacity of the string
        System.out.println(sb);
        System.out.println("wtf is happening , oh i think i get it now ");
    }
}