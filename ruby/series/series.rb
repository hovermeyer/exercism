# Given a string of digits,
# output all the contiguous substrings of length `n`
# in that string in the order that they appear.
class Series
  def initialize(full_string)
    @characters = full_string.chars
    @length = full_string.length
  end

  def slices(size)
    raise ArgumentError, 'Requesting too large a slice' unless size <= @length

    @characters.each_cons(size).map(&:join)
  end
end
