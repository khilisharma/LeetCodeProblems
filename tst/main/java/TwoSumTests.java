package main.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class TwoSumTests {
  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(
        new Object[][] {
          {Arrays.asList(1, 3, 4, 5, 6, 2), 5, new int[] {0, 2}},
          {Arrays.asList(1, 3, 4, 5, 6, 2), 2, new int[1]}
        });
  }

  private int[] inputs;

  private int target;

  private int[] outputs;

  public TwoSumTests(final List<Integer> inputs, final int target, final int[] outputs) {
    this.inputs = inputs.stream().mapToInt(e -> e).toArray();
    this.outputs = outputs;
    this.target = target;
  }

  @Test
  public void test() {
    final int[] result = TwoSum.solution(inputs, target);
    assertArrayEquals(result, outputs);
  }
}
