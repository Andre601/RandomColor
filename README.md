# RandomColor
RandomColor is an expansion, that makes it possible for you to return a random color or formatting code on each call.

## Placeholders

### `%randomcolor_all%`
Returns a random color or formatting code.

#### Color codes:
| Code | Color        | Hex value |
| ---- | ------------ | --------- |
| `0`  | Black        | `#000000` |
| `1`  | Dark Blue    | `#0000AA` |
| `2`  | Dark Green   | `#00AA00` |
| `3`  | Dark Aqua    | `#00AAAA` |
| `4`  | Dark Red     | `#AA0000` |
| `5`  | Dark Purple  | `#AA00AA` |
| `6`  | Gold         | `#FFAA00` |
| `7`  | Gray         | `#AAAAAA` |
| `8`  | Dark Gray    | `#555555` |
| `9`  | Blue         | `#5555FF` |
| `a`  | Green        | `#55FF55` |
| `b`  | Aqua         | `#55FFFF` |
| `c`  | Red          | `#FF5555` |
| `d`  | Light Purple | `#FF55FF` |
| `e`  | Yellow       | `#FFFF55` |
| `f`  | White        | `#FFFFFF` |

#### Formatting codes
| Code | Type          | Example:          |
| ---- | ------------- | ----------------- |
| `k`  | Obfuscated    | `No example`      |
| `l`  | Bold          | **Bold**          |
| `m`  | Strikethrough | ~~Strikethrough~~ |
| `n`  | Underline     | __Underline__     |
| `o`  | Italic        | *Italic*          |

### `%randomcolor_color%`
Returns a random [color code](#color-codes)

### `%randomcolor_format%`
Returns a random [formatting code](#formatting-codes)

### `%randomcolor_selected_<option1,option2,...>%`
Returns a random value from the provided ones.

**Example**: `%randomcolor_selected_1,3,9,b%` either returns `§1` (Dark Blue), `§3` (Dark Aqua), `§9` (Blue) or `§b` (Aqua).