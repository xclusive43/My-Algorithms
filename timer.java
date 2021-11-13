
class timer{
  Static int SEC = 60; //user input for seconds
  Static int MIN= 1; //user input for minutes
  
  public void starttimer(){
    SEC -= 1;
            if (SEC == 0) {
                if (MIN == 0) TestBinding.TESTTimer.setText(MIN + ":" + SEC);
                else {
                    MIN--;
                    TestBinding.TESTTimer.setText(MIN + ":" + SEC);
                    SEC = 60;
                }
            }
            if (SEC != 1) TestBinding.TESTTimer.setText(MIN + ":" + SEC);
  }

}
