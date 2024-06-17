package Anil;

 class Question {
        int i;
        public Question (int i)
        {
            this.i = i--;
        }
    }
    class Questionl extends Question
    {
        public Questionl (int i)
        {
            super (++i);
            System.out.println(i);
        }
    }

     class Check
    {
        public static void main(String[] args)
        {
            Questionl n = new Questionl (20);
        }
    }


