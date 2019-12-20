=begin
Write your code for the 'Sum Of Multiples' exercise in this file. Make the tests in
`sum_of_multiples_test.rb` pass.

To get started with TDD, see the `README.md` file in your
`ruby/sum-of-multiples` directory.
=end

class SumOfMultiples
  attr_reader :multiples

  def initialize(*multiples)
      @multiples = *multiples

  end

  def to(num)
    multiples_array = []
    multiples.each{|multiple|
      if multiple != 0 then
        multiples_array = multiples_array | (1..((num.to_f-1 )/multiple.to_f).floor).to_a.map{|each| each*multiple}
      end
    #  print "after #{multiple} multiples_array : #{multiples_array}"
    }
    multiples_array.sum
  end


end
