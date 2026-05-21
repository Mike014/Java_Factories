package Esercizio1;

public class TipiPrimitivi {

    private byte _byte = 127;
    private short _short = 2;
    private int _int = 5;
    private long _long = 3L;
    private float _float = .4f;
    private double _double = .0d;
    private char _char = 'C';
    private String _string = null;
    private boolean _boolean = false;

    public void printValue()
    {
        Object[] contenitore = { _byte, _short, _int, _long, _float, _double, _char, _string, _boolean};

        for (Object elemento : contenitore)
        {

            System.out.println(elemento);

        }
    }

    public static void main(String[] args)
    {

        TipiPrimitivi program = new TipiPrimitivi();

        program.printValue();

    }
}

//Data Type	Default Value (for fields)
//byte	    0
//short	    0
//int	    0
//long	    0L
//float	    0.0f
//double	0.0d
//char	    '\u0000'
//String (or any object)  	null
//boolean	false
