  /** Returns a bundler that delegates to a copy of the source bundle. */
  public static Bundler copyOf(Bundle source) {
    return create().putAll(source);
  }


  /** Constructs a new Bundler instance that delegates to {@code delegate}. */
  private Bundler(Bundle delegate) {
    this.delegate = delegate;
  }

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
