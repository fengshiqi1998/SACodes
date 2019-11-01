class Singleton {
  private static singleton: Singleton;

  constructor() {
    console.log("Singleton class");
  }

  public static getInstance(): Singleton {
    if (this.singleton === undefined) {
      this.singleton = new Singleton();
    }
    return this.singleton;
  }
}