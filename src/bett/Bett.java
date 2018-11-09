/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bett;

/**
 *
 * @author STUDENT
 */
public class Bett {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*  underweight below 18
        helth 18-25
        over weight 25>
       
        String name= "bett";
        double weight = 60.0;
        int age =  20;
        double BMI;
        int height = 2; 
        int heightSrq =  height*height;
        
        BMI= weight/heightSrq;
        if (BMI<18){
          System.out.print("bett is underweight and the BMI is "+ BMI);
        } else if (BMI>=18 && BMI<25){
            System.out.print("bett is HEALTHY and the BMI is "+ BMI);
        } else if (BMI>=25){
        System.out.print("bett is overweight and the BMI is "+ BMI);
        }
 */
       
       String[] name = new String[]{"Wangu", "Bett"};
       double[] weight= new double[]{60.5, 59.23};
       double [] height = new double[] {1.8, 1.9};

     
      for (int i=0; i<weight.length; i++){
        System.out.println(weight[i]);
        System.out.println(name[i]);
        System.out.println(height[i]);
        
        double BMI= weight[i] /(height[i]*height[i]);
        if (BMI<18){
          System.out.print(name[i]+" is underweight and the BMI is "+ BMI);
        } else if (BMI>=18 && BMI<25){
            System.out.print(name[i]+" is HEALTHY and the BMI is "+ BMI);
        } else if (BMI>=25){
        System.out.print(name[i]+" is overweight and the BMI is "+ BMI);
        }
      }
   
     
    }
    
    
}