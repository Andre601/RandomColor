# RandomColor
RandomColor is an expansion, that makes it possible for you to return a random color or formatting code on each call.

## Placeholders

### `%randomcolor_all%`
Returns a random color or formatting code.

### `%randomcolor_color%`
Returns a random [color code](#color-codes)

### `%randomcolor_combined%`
Returns a random [color code](#color-codes) AND a random [formatting code](#formatting-codes).

### `%randomcolor_format%`
Returns a random [formatting code](#formatting-codes)

### `%randomcolor_selected_<option1,option2,...>%`
Will return one of the provided option.  
Note that you only have to provide the number/letter and not the Color character (`§`) too.  
Please see the below [codes](#codes) for a full list.

**Example**:  
`%randomcolor_selected_a,b,c,k,l%` would return either `§a`, `§b`, `§c`, `§k` or `§l`

## Codes
### Color codes:
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

### Formatting codes
| Code | Type          | Example:          |
| ---- | ------------- | ----------------- |
| `k`  | Obfuscated    | `No example`      |
| `l`  | Bold          | **Bold**          |
| `m`  | Strikethrough | ~~Strikethrough~~ |
| `n`  | Underline     | <u>Underline</u>  |
| `o`  | Italic        | *Italic*          |