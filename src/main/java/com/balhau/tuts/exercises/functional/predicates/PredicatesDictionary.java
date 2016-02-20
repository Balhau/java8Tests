package com.balhau.tuts.exercises.functional.predicates;

/**
 * Created by vitorfernandes on 2/17/16.
 */
public class PredicatesDictionary {

    public static class IsEmptyOrNull extends PredicateBase<String>{
        @Override
        public boolean verify(String element) {
            return element==null || element.isEmpty();
        }
    }

    public static class IsPalindrome extends PredicateBase<String>{
        @Override
        public boolean verify(String element){
            int i1 = 0;
            int i2 = element.length() - 1;
            while (i2 > i1) {
                if (element.charAt(i1) != element.charAt(i2)) {
                    return false;
                }
                ++i1;
                --i2;
            }
            return true;
        }
    }

    public static class IsEven extends PredicateBase<Integer>{
        @Override
        public boolean verify(Integer element) {
            return element % 2 == 0;
        }
    }

    public static class IsPositive extends PredicateBase<Integer>{
        @Override
        public boolean verify(Integer element){
            return element > 0;
        }
    }

    public static abstract class PredicateOperator<T> extends PredicateBase<T>{

        protected final boolean initialStatus;

        public PredicateOperator(boolean initStatus, Predicate<T>... decorators){
            super(decorators);
            this.initialStatus=initStatus;
        }

        public abstract boolean operation(boolean current,Predicate<T> predicate, T element);

        public boolean verify(T element){
            boolean status=initialStatus;
            for(Predicate<T> p : this.decorators){
                status = operation(status,p,element);
            }
            return status;
        }
    }

    public static class Or<T> extends PredicateOperator<T>{
        public Or(Predicate<T>... decorated){
            super(false,decorated);
        }

        @Override
        public boolean operation(boolean current,Predicate<T> p, T element) {
            return current || p.verify(element);
        }
    }

    public static class And<T> extends PredicateOperator<T>{
        public And(Predicate<T>... decorated){
            super(true,decorated);
        }

        @Override
        public boolean operation(boolean current,Predicate<T> p, T element) {
            return current && p.verify(element);
        }
    }

    public static class Not<T> extends PredicateOperator<T>{
        public Not(Predicate<T>... decorated){
            super(true,decorated);
        }


        @Override
        public boolean operation(boolean current, Predicate<T> predicate, T element) {
            return current && !predicate.verify(element);
        }
    }
}
