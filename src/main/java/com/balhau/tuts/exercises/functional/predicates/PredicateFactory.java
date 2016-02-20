package com.balhau.tuts.exercises.functional.predicates;

import static com.balhau.tuts.exercises.functional.predicates.PredicatesDictionary.*;

/**
 *
 * Created by vitorfernandes on 2/20/16.
 */
public class PredicateFactory {

    public final static Predicate<Integer> IS_EVEN = new IsEven();
    public final static Predicate<Integer> IS_POSITIVE = new IsPositive();

    public final static Predicate<String> IS_EMPTY_OR_NULL = new IsEmptyOrNull();
    public final static Predicate<String> IS_PALINDROME = new IsPalindrome();

    public static <T> Predicate<T> And(Predicate<T>... predicates){
        return new And(predicates);
    }

    public static <T> Predicate<T> Or(Predicate<T>... predicates){
        return new Or(predicates);
    }

    public static <T> Predicate<T> Not(Predicate<T> ...predicates){
        return new Not(predicates);
    }
}
