=begin
Given a string representing a matrix of numbers, return the rows and columns of
that matrix.
=end

class Matrix
  attr_reader :rows, :columns

  def initialize(input)
    @rows = input.lines(chomp:true).map{|x| x.split.map(&:to_i)}
    @columns = rows.transpose
  end

end
