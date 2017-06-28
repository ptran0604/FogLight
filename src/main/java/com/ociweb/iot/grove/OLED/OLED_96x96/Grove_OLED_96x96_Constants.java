package com.ociweb.iot.grove.OLED.OLED_96x96;

public class Grove_OLED_96x96_Constants {
	public static final int ROW_COUNT = 96;
	public static final int COL_COUNT = 96;
	
	//commands
	public static final int ADDRESS = 0x3C;
	public static final int COMMAND_MODE = 0x80;
	public static final int DATA_MODE = 0x40;
	public static final int DISPLAY_OFF = 0xAE;
	public static final int DISPLAY_ON = 0xAF;
	public static final int NORMAL_DISPLAY = 0xA4;
	public static final int INVERSE_DISPLAY = 0xA7;
	public static final int ACTIVATE_SCROLL_CMD = 0x2F;
	public static final int DEACTIVATE_SCROLL_CMD = 0x2E;
	public static final int SET_CONTRAST_LEVEL_CMD = 0x81;
	
	public static final int REMAP = 0xA0;
	public static final int HORIZONTAL = 0x42;
	public static final int VERTICAL = 0x46;
	
	public static final int SET_ROW_ADDRESS = 0x75;
	public static final int SET_COL_ADDRESS = 0x15;
	
	public static final int BATCH_SIZE = 50;
	
	public static final int MCU = 0xFD;
	public static final int UNLOCK_CMD_ENTERING = 0x12;
	
	
	//Each row corresponds to an ASCII character startign at ASCII 32.
	//Each byte corresponds to 8-pixels. When communicating with the chip on the display, a nible corressponds to
	//to a pixel, not a bit. Hence, we need to convert this bit array to an "nibble" array in the OLED_96x96 object layer.
	
	public static final int[][] FONT = {
				  {0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00},
				  {0x00,0x00,0x5F,0x00,0x00,0x00,0x00,0x00},
				  {0x00,0x00,0x07,0x00,0x07,0x00,0x00,0x00},
				  {0x00,0x14,0x7F,0x14,0x7F,0x14,0x00,0x00},
				  {0x00,0x24,0x2A,0x7F,0x2A,0x12,0x00,0x00},
				  {0x00,0x23,0x13,0x08,0x64,0x62,0x00,0x00},
				  {0x00,0x36,0x49,0x55,0x22,0x50,0x00,0x00},
				  {0x00,0x00,0x05,0x03,0x00,0x00,0x00,0x00},
				  {0x00,0x1C,0x22,0x41,0x00,0x00,0x00,0x00},
				  {0x00,0x41,0x22,0x1C,0x00,0x00,0x00,0x00},
				  {0x00,0x08,0x2A,0x1C,0x2A,0x08,0x00,0x00},
				  {0x00,0x08,0x08,0x3E,0x08,0x08,0x00,0x00},
				  {0x00,0xA0,0x60,0x00,0x00,0x00,0x00,0x00},
				  {0x00,0x08,0x08,0x08,0x08,0x08,0x00,0x00},
				  {0x00,0x60,0x60,0x00,0x00,0x00,0x00,0x00},
				  {0x00,0x20,0x10,0x08,0x04,0x02,0x00,0x00},
				  {0x00,0x3E,0x51,0x49,0x45,0x3E,0x00,0x00},
				  {0x00,0x00,0x42,0x7F,0x40,0x00,0x00,0x00},
				  {0x00,0x62,0x51,0x49,0x49,0x46,0x00,0x00},
				  {0x00,0x22,0x41,0x49,0x49,0x36,0x00,0x00},
				  {0x00,0x18,0x14,0x12,0x7F,0x10,0x00,0x00},
				  {0x00,0x27,0x45,0x45,0x45,0x39,0x00,0x00},
				  {0x00,0x3C,0x4A,0x49,0x49,0x30,0x00,0x00},
				  {0x00,0x01,0x71,0x09,0x05,0x03,0x00,0x00},
				  {0x00,0x36,0x49,0x49,0x49,0x36,0x00,0x00},
				  {0x00,0x06,0x49,0x49,0x29,0x1E,0x00,0x00},
				  {0x00,0x00,0x36,0x36,0x00,0x00,0x00,0x00},
				  {0x00,0x00,0xAC,0x6C,0x00,0x00,0x00,0x00},
				  {0x00,0x08,0x14,0x22,0x41,0x00,0x00,0x00},
				  {0x00,0x14,0x14,0x14,0x14,0x14,0x00,0x00},
				  {0x00,0x41,0x22,0x14,0x08,0x00,0x00,0x00},
				  {0x00,0x02,0x01,0x51,0x09,0x06,0x00,0x00},
				  {0x00,0x32,0x49,0x79,0x41,0x3E,0x00,0x00},
				  {0x00,0x7E,0x09,0x09,0x09,0x7E,0x00,0x00},
				  {0x00,0x7F,0x49,0x49,0x49,0x36,0x00,0x00},
				  {0x00,0x3E,0x41,0x41,0x41,0x22,0x00,0x00},
				  {0x00,0x7F,0x41,0x41,0x22,0x1C,0x00,0x00},
				  {0x00,0x7F,0x49,0x49,0x49,0x41,0x00,0x00},
				  {0x00,0x7F,0x09,0x09,0x09,0x01,0x00,0x00},
				  {0x00,0x3E,0x41,0x41,0x51,0x72,0x00,0x00},
				  {0x00,0x7F,0x08,0x08,0x08,0x7F,0x00,0x00},
				  {0x00,0x41,0x7F,0x41,0x00,0x00,0x00,0x00},
				  {0x00,0x20,0x40,0x41,0x3F,0x01,0x00,0x00},
				  {0x00,0x7F,0x08,0x14,0x22,0x41,0x00,0x00},
				  {0x00,0x7F,0x40,0x40,0x40,0x40,0x00,0x00},
				  {0x00,0x7F,0x02,0x0C,0x02,0x7F,0x00,0x00},
				  {0x00,0x7F,0x04,0x08,0x10,0x7F,0x00,0x00},
				  {0x00,0x3E,0x41,0x41,0x41,0x3E,0x00,0x00},
				  {0x00,0x7F,0x09,0x09,0x09,0x06,0x00,0x00},
				  {0x00,0x3E,0x41,0x51,0x21,0x5E,0x00,0x00},
				  {0x00,0x7F,0x09,0x19,0x29,0x46,0x00,0x00},
				  {0x00,0x26,0x49,0x49,0x49,0x32,0x00,0x00},
				  {0x00,0x01,0x01,0x7F,0x01,0x01,0x00,0x00},
				  {0x00,0x3F,0x40,0x40,0x40,0x3F,0x00,0x00},
				  {0x00,0x1F,0x20,0x40,0x20,0x1F,0x00,0x00},
				  {0x00,0x3F,0x40,0x38,0x40,0x3F,0x00,0x00},
				  {0x00,0x63,0x14,0x08,0x14,0x63,0x00,0x00},
				  {0x00,0x03,0x04,0x78,0x04,0x03,0x00,0x00},
				  {0x00,0x61,0x51,0x49,0x45,0x43,0x00,0x00},
				  {0x00,0x7F,0x41,0x41,0x00,0x00,0x00,0x00},
				  {0x00,0x02,0x04,0x08,0x10,0x20,0x00,0x00},
				  {0x00,0x41,0x41,0x7F,0x00,0x00,0x00,0x00},
				  {0x00,0x04,0x02,0x01,0x02,0x04,0x00,0x00},
				  {0x00,0x80,0x80,0x80,0x80,0x80,0x00,0x00},
				  {0x00,0x01,0x02,0x04,0x00,0x00,0x00,0x00},
				  {0x00,0x20,0x54,0x54,0x54,0x78,0x00,0x00},
				  {0x00,0x7F,0x48,0x44,0x44,0x38,0x00,0x00},
				  {0x00,0x38,0x44,0x44,0x28,0x00,0x00,0x00},
				  {0x00,0x38,0x44,0x44,0x48,0x7F,0x00,0x00},
				  {0x00,0x38,0x54,0x54,0x54,0x18,0x00,0x00},
				  {0x00,0x08,0x7E,0x09,0x02,0x00,0x00,0x00},
				  {0x00,0x18,0xA4,0xA4,0xA4,0x7C,0x00,0x00},
				  {0x00,0x7F,0x08,0x04,0x04,0x78,0x00,0x00},
				  {0x00,0x00,0x7D,0x00,0x00,0x00,0x00,0x00},
				  {0x00,0x80,0x84,0x7D,0x00,0x00,0x00,0x00},
				  {0x00,0x7F,0x10,0x28,0x44,0x00,0x00,0x00},
				  {0x00,0x41,0x7F,0x40,0x00,0x00,0x00,0x00},
				  {0x00,0x7C,0x04,0x18,0x04,0x78,0x00,0x00},
				  {0x00,0x7C,0x08,0x04,0x7C,0x00,0x00,0x00},
				  {0x00,0x38,0x44,0x44,0x38,0x00,0x00,0x00},
				  {0x00,0xFC,0x24,0x24,0x18,0x00,0x00,0x00},
				  {0x00,0x18,0x24,0x24,0xFC,0x00,0x00,0x00},
				  {0x00,0x00,0x7C,0x08,0x04,0x00,0x00,0x00},
				  {0x00,0x48,0x54,0x54,0x24,0x00,0x00,0x00},
				  {0x00,0x04,0x7F,0x44,0x00,0x00,0x00,0x00},
				  {0x00,0x3C,0x40,0x40,0x7C,0x00,0x00,0x00},
				  {0x00,0x1C,0x20,0x40,0x20,0x1C,0x00,0x00},
				  {0x00,0x3C,0x40,0x30,0x40,0x3C,0x00,0x00},
				  {0x00,0x44,0x28,0x10,0x28,0x44,0x00,0x00},
				  {0x00,0x1C,0xA0,0xA0,0x7C,0x00,0x00,0x00},
				  {0x00,0x44,0x64,0x54,0x4C,0x44,0x00,0x00},
				  {0x00,0x08,0x36,0x41,0x00,0x00,0x00,0x00},
				  {0x00,0x00,0x7F,0x00,0x00,0x00,0x00,0x00},
				  {0x00,0x41,0x36,0x08,0x00,0x00,0x00,0x00},
				  {0x00,0x02,0x01,0x01,0x02,0x01,0x00,0x00},
				  {0x00,0x02,0x05,0x05,0x02,0x00,0x00,0x00}};
}
