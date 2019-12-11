package com.actiTime.Generic;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class fileUpload
{
	public static void fileUpload(String filepath)
	{
	try
	{
	StringSelection file = new StringSelection(filepath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
	Robot r = new Robot();
	int control = KeyEvent.VK_CONTROL;
	int v = KeyEvent.VK_V;
	int enter = KeyEvent.VK_ENTER;
	
	
	r.keyPress(control);
	r.keyPress(v);
	Thread.sleep(2000);
	r.keyRelease(control);
	r.keyRelease(v);
	Thread.sleep(2000);
	r.keyPress(enter);
	Thread.sleep(2000);
	r.keyRelease(enter);
}
	catch (Exception e)
	{	
	
	}
}
}
