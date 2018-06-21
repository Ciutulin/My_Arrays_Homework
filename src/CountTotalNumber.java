public class CountTotalNumber {
    
    public static void main(String args[]){
        String test = "Ana are mere si alune. Alina are si ea ananas si portocale";
        char letter = 'a';
        count(test);
        
        
    }

    private static void count(String test1) {
        char[] ch = test1.toCharArray();
        int letter = 0;
        for(int i=0; i<test1.length(); i++){
            letter++;
            if(Character.isLetter(ch[i])) {
                //System.out.println("Ana are mere si alune. Alina are si ea ananas si portocale");
                System.out.println("letter: " + letter);
            }
        }
    }
}
