package controller;

import textloader.*;

import java.io.*;

public class Controller{
	public static void main(String[] args) throws IOException{
		TextLoader loader = new TextLoader("tortoise.txt");
		
		loader.Show();
		loader.Close();
	}
}
