def triplets_with_sum(number):
    result = filter(is_triplet, triplets_in_range(number))
    return list(result)


def triplets_in_range(number):
    triplets = []
    for i in range(1,int(number/3)):
        for j in range(i+1, int((number-i)/2)):
            triplets.append([i,j,number - i - j])
    return triplets

def is_triplet(triplet):
    return triplet[0]**2 + triplet[1]**2 == triplet[2]**2

print(triplets_with_sum(840))
