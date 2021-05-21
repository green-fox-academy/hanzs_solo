package master.engine.tools;

public enum Values {
  SCREEN_SIZE(600),UNIT_SIZE(600/10);

  public double value;
  private Values(int value){
    this.value = value;
  }

}
