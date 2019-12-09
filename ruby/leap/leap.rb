=begin
Implement own version of checking if a year is a leap year.
=end

class Year
  def self.leap?(year)
    year % 4 == 0 && (year % 100 != 0 || year % 400 ==0)
  end
end
