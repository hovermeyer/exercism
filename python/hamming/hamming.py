def distance(strand_a, strand_b):
    if (len(strand_a) == len(strand_b)):
        return sum(x != y for x,y in zip(strand_a,strand_b))
    else:
        raise ValueError(f"Requires same length strings but provided {strand_a} and {strand_b}")
