class Solution {
    public String interpret(String command) {
        String str=command.replace("()","o");
        String str1=str.replace("(al)","al");
        return str1;
    }
}