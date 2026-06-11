    /*
    Data Structures are Linear and NonLinear
    NonLinear in Java
     ---> collections is divided to some different data structures
                Type	الاستخدام
             1- List	ترتيب + تكرار مسموح
             2- Set 	بدون تكرار + مرتبه
             3- Map	    key/value
             4- Queue	FIFO
             5- Stack   FILO
      1- list -> array list
      2- Set
          Type      	الميزة
          HashSet   	fastest
          LinkedHashSet	يحافظ على الترتيب
          TreeSet   	sorting
     * for Set HashSet makes no guarantees as to iteration order , لو HashSet عندك "مرتب"، فهو صدفة implementation behavior مش feature.
     3- Map => (key ,value)
        importancy of Map
        caching
        authentication
        APIs
        JSON parsing
        database mapping
      4- Queue
         FIFO
         queue is interface for
         ----> linkedlist , prioirty queue , arraydequeu
         *****************************************
         ##interview question
         Why Queue reference with LinkedList?
            تقول:
            Queue is an interface and LinkedList is one implementation of that interface.
            We use Queue reference to follow polymorphism and program to interface instead of implementation, making the code more flexible and (loosely coupled)-> .
            معناها ان الكلاسات مش معتمده علي بعض واي تغيير مش هيأثر علي الترابط خالص
         ******************************************
         add vs offer in queue =>
         (add) if failed return (IllegalStateException)
         (offer) if failed return (false)
         *******************************
         remove vs poll in queue =>
         (remove) if no element in q return (NoSuchElementException)
         (poll) if no element in q return (null)
         *************************************
         element vs peek in queue
         element() -> if there is no element (Exception)
         peek()    -> if there is no element (null)

         (offer , poll , peek)  safe version from  (add  , remove , element)
     */

    class ObjectComp implements Comparator<Object>{

        @Override
        public int compare(Object o1, Object o2) {
            int p1 = getPriority(o1);
            int p2 = getPriority(o2);
            if(p1 != p2){
                return Integer.compare(p1,p2);
            }else{
                if(o1 instanceof Integer){
                    return
                        Integer.compare((int)o1,(int)o2);
                }else if(o1 instanceof String){
                    return
                        ((String) o1).compareTo((String) o2);

                }else if(o1 instanceof Boolean) {
                    return
                        Boolean.compare((boolean) o2, (boolean) o1);
                }
            }
            return 0;
        }
        public int getPriority(Object o){
            return o instanceof Integer ? 3:
                o instanceof String  ? 1:
                o instanceof Boolean ? 2:
                4;
        }
    }

    void main() {
        //Ex 1
                //  List<Object> l = new ArrayList<Object>();
                //    l.add("ahmed");
                //    l.add(5);
                //    l.add(4);
                //    l.add("amir");
                //    l.add("amir");
                //    l.add(true);
                //    l.add(false);
                //
                //    Collections.sort(l,new ObjectComp());
                //    for(Object o : l){
                //        IO.println(o);
                //    }
        //Ex 2
        //        Set<Integer> s = new LinkedHashSet<>();
        //        s.add(1);
        //        s.add(1);
        //        s.add(6);
        //        s.add(3);
        //        s.add(2);
        //        s.add(8);
        //        s.add(0);
        //        IO.println(s.toString());
                //Ex 3
        //        Set<String> set = new HashSet<>();
        //
        //        set.add("Z");
        //        set.add("A");
        //        set.add("M");
        //        set.add("B");
        //        set.add("K");
        //        System.out.println(set);
                //Ex 4
//                Set<String> set = new HashSet<>();
//                set.add("Z");
//                set.add("AA");
//                set.add("hello");
//                set.add("cat");
//                set.add("apple");
//                set.add("K");
//                System.out.println(set);
//
//                Set<String> set1 = new TreeSet<>();
//                set1.add("Z");
//                set1.add("AA");
//                set1.add("hello");
//                set1.add("cat");
//                set1.add("apple");
//                set1.add("K");
//                System.out.println(set1);

//        Map<Integer,String> hm = new HashMap<Integer,String>();
//        hm.put(1,"ahmed");
//        hm.put(2,"alaa");
//        hm.put(3,"amir");
//        hm.put(4,"a7mos");
//        IO.println(hm.containsKey(1));
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        IO.println(q);
        q.poll();
        IO.println(q);
        q.offer(4);
        IO.println(q);

    }


















