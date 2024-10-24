package test;

import java.lang.Math;

public class NeuralNetwork {
    
    // Sigmoid函数
    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    // Sigmoid函数的导数
    public static double sigmoidDerivative(double x) {
        return sigmoid(x) * (1 - sigmoid(x));
    }

    public static void main(String[] args) {

        double x1 = 0.5;
        double x2 = 1.0;
        double yTrue = 1.9;
        double W1 = 1.0, W2 = 0.8;
        double W3 = 0.6, W4 = 0.7;
        double W5 = 1.5, W6 = 2.0;
        double learningRate = 0.1;

        double h1Input = W1 * x1 + W2 * x2;
        double h1Output = sigmoid(h1Input);

        double yPredInput = W5 * h1Output + W6;
        double yPred = sigmoid(yPredInput);


        double loss = 0.5 * Math.pow((yTrue - yPred), 2);


        double dL_dyPred = -(yTrue - yPred);
        double dyPred_dyPredInput = sigmoidDerivative(yPredInput);
        double dyPredInput_dW5 = h1Output;
        double dyPredInput_dW6 = 1;


        double dh1Output_dh1Input = sigmoidDerivative(h1Input);
        double dh1Input_dW1 = x1;
        double dh1Input_dW2 = x2;


        double dL_dW5 = dL_dyPred * dyPred_dyPredInput * dyPredInput_dW5;
        double dL_dW6 = dL_dyPred * dyPred_dyPredInput * dyPredInput_dW6;
        double dL_dh1Output = dL_dyPred * dyPred_dyPredInput * W5;
        double dL_dW1 = dL_dh1Output * dh1Output_dh1Input * dh1Input_dW1;
        double dL_dW2 = dL_dh1Output * dh1Output_dh1Input * dh1Input_dW2;


        W1 = W1 - learningRate * dL_dW1;
        W2 = W2 - learningRate * dL_dW2;
        W5 = W5 - learningRate * dL_dW5;
        W6 = W6 - learningRate * dL_dW6;


        System.out.printf("W1: %.3f\n", W1);
        System.out.printf("W2: %.3f\n", W2);
        System.out.printf("W3: %.3f\n", W3);
        System.out.printf("W4: %.3f\n", W4);
        System.out.printf("W5: %.3f\n", W5);
        System.out.printf("W6: %.3f\n", W6);
    }
}
