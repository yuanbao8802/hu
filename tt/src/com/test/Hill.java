package com.test;

import javax.swing.JOptionPane;   
   
public class Hill {   
	
	int key[][] = new int[2][2];
	String PText = "";
	StringBuffer CText = new StringBuffer();
	
    public static void main(String[] args) {   
    	Hill h = new Hill();
    	h.inputKey();
    	h.inputPText();
    	h.encrypt();
    	h.getResult();
    }
    
    public void inputKey() {
    	key[0][0] = Integer.parseInt(JOptionPane.showInputDialog("����������2*2������ܣ�����������1�е�1�е�ֵ"));
    	key[0][1] = Integer.parseInt(JOptionPane.showInputDialog("����������2*2������ܣ�����������1�е�2�е�ֵ"));
    	key[1][0] = Integer.parseInt(JOptionPane.showInputDialog("����������2*2������ܣ�����������2�е�1�е�ֵ"));
    	key[1][1] = Integer.parseInt(JOptionPane.showInputDialog("����������2*2������ܣ�����������2�е�2�е�ֵ"));
    }
    
    public void inputPText() {
    	PText = JOptionPane.showInputDialog("����������");
    	PText = PText.toUpperCase();
    	if(PText.length() % 2 != 0) {
    		PText += 'X';
    	}
    }
    
    public int[] charToInt(String s) {
    	int[] i = new int[s.length()];
    	char c;
    	for(int j=0;j<s.length();j++) {
    		c = s.charAt(j);
    		i[j] = (c - 'A') % 26; 
    	}
    	return i;
    }
    
    public void intToChar(int[] out) {
    	char c;
    	for(int j=0;j<out.length;j++) {
    		c = (char) (out[j] + 'A');
    		CText.append(c);
    	}
    }
    
    public void encrypt() {
    	int[] in = charToInt(PText);
    	int[] out = new int[in.length];
    	for(int i=0;i<in.length;i=i+2) {
    		out[i] = (key[0][0] * in[i] + key[0][1] * in[i+1]) % 26;
    		out[i+1] = (key[1][0] * in[i] + key[1][1] * in[i+1]) % 26;
    	}
    	intToChar(out);
    }
    
    public void getResult() {
    	System.out.println("���ܾ���");
    	for(int i=0;i<key.length;i++) {
    		for(int j=0;j<key[i].length;j++) {
    			if(key[i][j]<10)
    				System.out.print(key[i][j] + "  ");
    			else
    				System.out.print(key[i][j] + " ");
    		}
    		System.out.println();
    	}
    	System.out.println("\n���ģ�");
    	System.out.println(PText);
    	System.out.println("\n���ģ�");
    	System.out.println(CText);
    }
   
}   
