package uebung6;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Matrix 
{
	private int dim;
	private double[][] elems;
	
	public Matrix(int n) 
	{
		elems = new double [n][n];
		dim = n;
	}
	
	
	public static Matrix read(InputStream istream)
	{
		Scanner reader = new Scanner(istream);
		int n=0;
		if(reader.hasNextInt()){
			n = reader.nextInt();
		}
		System.out.println("Gelesene Dimension: "+n);
		Matrix m = new Matrix(n);
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(reader.hasNextDouble())
				{
					m.elems[i][j] = reader.nextDouble();
				}
			}
		}
		return m;
	}
	
	public void print(OutputStream ostream) 
	{
		PrintStream writer = new PrintStream(ostream);
		
		writer.println(dim);
		
		for(int i=0; i<dim; i++)
		{
			for(int j=0; j<dim; j++)
			{
				writer.printf("%8.2f",elems[i][j]);
			}
			writer.println();
		}
	}
	
	
	public void randomize() 
	{
		Random zufall = new Random();
		for(int i=0; i<dim; i++)
		{
			for(int j=0; j<dim; j++)
			{
				elems[i][j] = zufall.nextDouble()*10;
			}
		}
	}
	
	public Matrix mult(Matrix b) {
		Matrix result = null;
		if(this.dim == b.dim) {
			result = new Matrix(this.dim);
			for(int i=0; i<dim; i++) {
				for(int j=0; j<dim; j++) {
					double sum = 0.0;
					for(int k=0; k<dim; k++) {
						sum+= elems[i][k] * b.elems[k][j];
					}
					result.elems[i][j] = sum;
				}
			}
		}
		return result;
	}
	
	
	public int getDim() 
	{
		return dim;
	}
	
	
	public double[][] getElems() {
		return elems;
	}
	
}
