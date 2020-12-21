from collections import defaultdict
def get_grouped_anagrams(input_str):
    answer = defaultdict(list)
    for istr in input_str:
        answer[tuple(sorted(istr))].append(istr)
    return answer.values()

    
input_str=["cat","act","care","race","boat"]
grouped_anagrams = get_grouped_anagrams(input_str)
print(grouped_anagrams)



