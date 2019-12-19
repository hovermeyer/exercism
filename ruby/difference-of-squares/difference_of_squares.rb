=begin
The square of the sum of the first ten natural numbers is
(1 + 2 + ... + 10)² = 55² = 3025.

The sum of the squares of the first ten natural numbers is
1² + 2² + ... + 10² = 385.

Find the difference between these.  Use the gaussian method for both to prevent having to calculate 
=end

class Squares
  attr_reader :num
  def initialize(num)
    @num = num
  end

  def square_of_sum
    (num*(num+1)/2) ** 2
  end

  def sum_of_squares
    (num*(num+1)*(2 * num + 1))/6
  end

  def difference
    square_of_sum - sum_of_squares
  end

end
