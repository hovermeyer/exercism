# custom error declaration
class StrandsLengthError < ArgumentError
  def initialize(message = 'Strands must be the same size.')
    super
  end
end

# Calculates the hamming distance between two equal sized strings.
class Hamming
  attr_reader :distance

  def self.compute(strand1, strand2)
    new(strand1, strand2).distance
  end

  def initialize(strand1, strand2)
    raise StrandsLengthError unless strand1.length == strand2.length

    @nucleotides = strand1.chars.zip(strand2.chars)
    @distance = @nucleotides.count { |n1, n2| n1 != n2 }
  end
end
