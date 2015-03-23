//  Danielle Krassner
//  Calculator

import javax.swing.*;
import BreezySwing.*;

class Calculator extends GBFrame
{
	// ************Variables************
	private DoubleField numberField;
	private JButton plusButton;
	private JButton minusButton;
	private JButton multiplyButton;
	private JButton divideButton;
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton equalsButton;
	private JButton decimalButton;
	private JButton sqrtButton;
	private JButton logButton;
	private JButton sinButton;
	private JButton cosButton;
	private JButton tanButton;
	private JButton squareButton;
	private JButton clrButton;
	int d=0;
	double numstring;
	boolean decimal=false;
	int dp=-1;
	double[] num=new double[99];
	int i=1;
	boolean plus=false;
	boolean minus=false;
	boolean multiply=false;
	boolean divide=false;
	double ans=0;
	
	// ************Main Method***************
	public static void main(String[]args)
	{
		Calculator GUI=new Calculator();
		
		GUI.setSize(310,200);
		GUI.setVisible(true);
	}
	
	// ************Button/Field Creation**************
	public Calculator()
	{
		numberField=addDoubleField(0,1,1,3,1);
		
		plusButton=addButton("+",2,1,1,1);
		minusButton=addButton("-",3,1,1,1);
		multiplyButton=addButton("*",4,1,1,1);
		divideButton=addButton("/",5,1,1,1);
		button7=addButton("7",2,2,1,1);
		button8=addButton("8",2,3,1,1);
		button9=addButton("9",2,4,1,1);
		button4=addButton("4",3,2,1,1);
		button5=addButton("5",3,3,1,1);
		button6=addButton("6",3,4,1,1);
		button1=addButton("1",4,2,1,1);
		button2=addButton("2",4,3,1,1);
		button3=addButton("3",4,4,1,1);
		button0=addButton("0",5,2,1,1);
		decimalButton=addButton(".",5,3,1,1);
		equalsButton=addButton("=",5,4,1,1);
		sqrtButton=addButton("Sqrt",2,6,1,1);
		logButton=addButton("Log",3,6,1,1);
		sinButton=addButton("Sin",4,6,1,1);
		cosButton=addButton("Cos",5,6,1,1);
		tanButton=addButton("Tan",2,7,1,1);
		squareButton=addButton("X^2",3,7,1,1);
		clrButton=addButton("C",4,7,1,1);
	}
	
	// *************Button Behavior**************
	public void buttonClicked(JButton buttonObj)
	{
		// *********Plus*********
		if (buttonObj==plusButton)
		{	
			num[i]=numberField.getNumber();
			numberField.setNumber(0.0);
			d=0;
			dp=-1;
			decimal=false;
			i++;
			plus=true;
		}
		
		// ********Minus********
		if (buttonObj==minusButton)
		{	
			num[i]=numberField.getNumber();
			numberField.setNumber(0.0);
			d=0;
			dp=-1;
			decimal=false;
			i++;
			minus=true;
		}
		
		// *******Multiply*******
		if (buttonObj==multiplyButton)
		{	
			num[i]=numberField.getNumber();
			numberField.setNumber(0.0);
			d=0;
			dp=-1;
			decimal=false;
			i++;
			multiply=true;
		}
		
		// ********Divide********
		if (buttonObj==divideButton)
		{	
			num[i]=numberField.getNumber();
			numberField.setNumber(0.0);
			d=0;
			dp=-1;
			decimal=false;
			i++;
			divide=true;
		}
		
		// ********Decimal*********
		if (buttonObj==decimalButton)
		{	
			decimal=true;
			d=1;
		}
		
		// ************EQUALS************
		if (buttonObj==equalsButton)
		{
			if (plus==true)
			{
				num[i]=numberField.getNumber();
				num[0]=i;
				ans=num[1];
				
				for (i=2; i<=num[0]; i++)
				{
					ans=ans+num[i];
				}
				
				numberField.setNumber(ans);
				
				d=0;
				dp=-1;
                i=1;
                num[0]=0;
                ans=0;
                decimal=false;
				plus=false;
			}
			
			if (minus==true)
			{
				num[i]=numberField.getNumber();
				num[0]=i;
				ans=num[1];
				
				for (i=2; i<=num[0]; i++)
				{
					ans=ans-num[i];
				}
				
				numberField.setNumber(ans);
				
				d=0;
				dp=-1;
				decimal=false;
				i=1;
				ans=0;
				minus=false;
			}
			
			if (multiply==true)
			{
				num[i]=numberField.getNumber();
				num[0]=i;
				ans=num[1];
				
				for (i=2; i<=num[0]; i++)
				{
					ans=ans*num[i];
				}
				
				numberField.setNumber(ans);
				d=0;
				dp=-1;
				decimal=false;
				i=1;
				ans=0;
				multiply=false;
			}
			
			if (divide==true)
			{
				if (num[2]==0)
				{
					System.out.println("ERROR:  Can not divide by zero (0)");
					System.out.println("");
					d=0;
					dp=-1;
					decimal=false;
					i=1;
					ans=0;
					divide=false;
				}
					
				num[i]=numberField.getNumber();
				num[0]=i;
				ans=num[1];
				
				for (i=2; i<=num[0]; i++)
				{
					ans=ans/num[i];
				}
				
				numberField.setNumber(ans);
				d=0;
				dp=-1;
				decimal=false;
				i=1;
				ans=0;
				divide=false;
			}
		}
		
		// ******Square Root******
		if (buttonObj==sqrtButton)
		{
			numberField.setNumber(Math.sqrt(numberField.getNumber()));
		}
		
		// ********Log********
		if (buttonObj==logButton)
		{
			numberField.setNumber(Math.log(numberField.getNumber()));
		}
		
		// ********Sine********
		if (buttonObj==sinButton)
		{
			numberField.setNumber(Math.sin(numberField.getNumber()));
		}
		
		// ********Cos********
		if (buttonObj==cosButton)
		{
			numberField.setNumber(Math.cos(numberField.getNumber()));
		}
		
		// ********Tan********
		if (buttonObj==tanButton)
		{
			numberField.setNumber(Math.tan(numberField.getNumber()));
		}
		
		// ********Squared********
		if (buttonObj==squareButton)
		{
			numberField.setNumber(Math.pow(numberField.getNumber(),2));
		}
		
		// ********Clear********
		if (buttonObj==clrButton)
		{
			numberField.setNumber(0.0);
			d=0;
			dp=-1;
            i=1;
            num[0]=0;
            ans=0;
            decimal=false;
			plus=false;
			minus=false;
			divide=false;
			multiply=false;
		}
		
		
		// ********NUMBER BUTTONS*******
		if (buttonObj==button0)
		{	
			if (d==0) numstring=0;
			if (d==1 && decimal==false) numstring=(numstring*10)+0;
			if (decimal==true) numstring=(numstring+(0*Math.pow(10,dp)));
			numberField.setNumber(numstring);
			d=1;
			if (decimal==true) dp--;
		}
		
		if (buttonObj==button1)
		{	
			if (d==0) numstring=1;
			if (d==1 && decimal==false) numstring=(numstring*10)+1;
			if (decimal==true) numstring=(numstring+(1*Math.pow(10,dp)));
			numberField.setNumber(numstring);
			d=1;
			if (decimal==true) dp--;
		}
		
		if (buttonObj==button2)
		{	
			if (d==0) numstring=2;
			if (d==1 && decimal==false) numstring=(numstring*10)+2;
			if (decimal==true) numstring=(numstring+(2*Math.pow(10,dp)));
			numberField.setNumber(numstring);
			d=1;
			if (decimal==true) dp--;
		}
		
		if (buttonObj==button3)
		{	
			if (d==0) numstring=3;
			if (d==1 && decimal==false) numstring=(numstring*10)+3;
			if (decimal==true) numstring=(numstring+(3*Math.pow(10,dp)));
			numberField.setNumber(numstring);
			d=1;
			if (decimal==true) dp--;
		}
		
		if (buttonObj==button4)
		{	
			if (d==0) numstring=4;
			if (d==1 && decimal==false) numstring=(numstring*10)+4;
			if (decimal==true) numstring=(numstring+(4*Math.pow(10,dp)));
			numberField.setNumber(numstring);
			d=1;
			if (decimal==true) dp--;
		}
		
		if (buttonObj==button5)
		{	
			if (d==0) numstring=5;
			if (d==1 && decimal==false) numstring=(numstring*10)+5;
			if (decimal==true) numstring=(numstring+(5*Math.pow(10,dp)));
			numberField.setNumber(numstring);
			d=1;
			if (decimal==true) dp--;
		}
		
		if (buttonObj==button6)
		{	
			if (d==0) numstring=6;
			if (d==1 && decimal==false) numstring=(numstring*10)+6;
			if (decimal==true) numstring=(numstring+(6*Math.pow(10,dp)));
			numberField.setNumber(numstring);
			d=1;
			if (decimal==true) dp--;
		}
		
		if (buttonObj==button7)
		{	
			if (d==0) numstring=7;
			if (d==1 && decimal==false) numstring=(numstring*10)+7;
			if (decimal==true) numstring=(numstring+(7*Math.pow(10,dp)));
			numberField.setNumber(numstring);
			d=1;
			if (decimal==true) dp--;
		}
		
		if (buttonObj==button8)
		{	
			if (d==0) numstring=8;
			if (d==1 && decimal==false) numstring=(numstring*10)+8;
			if (decimal==true) numstring=(numstring+(8*Math.pow(10,dp)));
			numberField.setNumber(numstring);
			d=1;
			if (decimal==true) dp--;
		}
		
		if (buttonObj==button9)
		{	
			if (d==0) numstring=9;
			if (d==1 && decimal==false) numstring=(numstring*10)+9;
			if (decimal==true) numstring=(numstring+(9*Math.pow(10,dp)));
			numberField.setNumber(numstring);
			d=1;
			if (decimal==true) dp--;
		}
	}
}