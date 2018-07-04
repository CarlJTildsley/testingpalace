Feature: Feature Name

  @tag
  Scenario Outline: ScenarioName ScenarioName
  When I Navigate to <Link>
  And I complete field <Field> with some valid data <Value>
#  Then take picture

    Examples:
    |Link | Field | Value|
    |Sign in | identifierId | test@gmail.com|