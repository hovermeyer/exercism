=begin
Processes a list of scores to provide latest, personal best, tests of most recent
=end

class HighScores

  def initialize(scores)
    @scores = scores
  end

  def scores
    @scores
  end

  def latest
    @scores.last
  end

  def personal_best
    @scores.max
  end

  def latest_is_personal_best?
    latest == personal_best
  end

  def personal_top_three
    @scores.max(3)
  end

end
