sum([], 0).
sum([H|T], S) :-
    sum(T, RestSum),
    S is H + RestSum.

% sum([1,2,3,4],S)