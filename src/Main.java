
/**
 * Tester class.
 *
 * @author Mohammed Alfarra, 6368950, U02
 */
public class Main
{
    public static void main(String[] args)
    {
        new Main();
    }

    public Main()
    {
        System.out.println("Test starts\n");

        //declares and instantiates a hash table object
        HashTable ht = new HashTable(19);

        //defines array with Java keywords
        String[] keywords =
                {
                        "abstract", "continue", "for", "new", "switch",
                        "assert", "default", "goto", "package", "synchronized",
                        "boolean", "do", "if", "private", "this", "break", "double",
                        "implements", "protected", "throw", "byte", "else", "import",
                        "public", "throws", "case", "enum", "instanceof", "return",
                        "transient", "catch", "extends", "int", "short", "try", "char",
                        "final", "interface", "static", "void", "class", "finally",
                        "long", "strictfp", "volatile", "const", "float", "native",
                        "super", "while"
                };

        //adds all array elements to the hash table
        for (String s: keywords)
        {
            ht.add(s);
        }

        //searches and removes from the hash table the middle third of array elements
        int n = keywords.length;
        for (int i=n/3; i<2*n/3; i++)
        {
            if (ht.search(keywords[i]))
                ht.remove(keywords[i]);
        }

        //prints hash table
        System.out.println(ht);

        System.out.println("Test ends");
    }

}