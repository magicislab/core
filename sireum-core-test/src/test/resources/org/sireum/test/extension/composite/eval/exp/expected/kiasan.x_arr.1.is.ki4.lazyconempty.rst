Exp: @@x_arr[1]

State: Before



----

+---------------------------------+---------------------------------+
|                                 |                                 |
| State: After                    | State: After (Semi-Concrete)    |
|                                 |                                 |
| * Global Variables              | * Global Variables              |
|                                 |                                 |
|   * @@x_arr = KArray#0          |   * @@x_arr = KArray#0          |
|                                 |                                 |
|     * min=i0; length=i1; max=i2 |     * min=0; length=1; max=0    |
|                                 |                                 |
|     * [1] = i3                  |     * [1] = i3                  |
|                                 |                                 |
| * Path Conditions               | * Path Conditions               |
|                                 |                                 |
|   * i0 <= i2                    |   * 0 <= 0                      |
|                                 |                                 |
|   * 0 <= i1                     |   * 0 <= 1                      |
|                                 |                                 |
|   * i1 == i2 - i0 + 1           |   * 1 == 0 - 0 + 1              |
|                                 |                                 |
|   * 1 <= i1                     |   * 1 <= 1                      |
|                                 |                                 |
| * Result: i3                    | * Result: i3                    |
|                                 |                                 |
+---------------------------------+---------------------------------+
