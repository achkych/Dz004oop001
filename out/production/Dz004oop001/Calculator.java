����   = 3
      java/lang/Object <init> ()V  	 
   java/util/List size ()I  "java/lang/IllegalArgumentException  ZСписок должен содержать как минимум два элемента
     (Ljava/lang/String;)V     get (I)Ljava/lang/Object;  java/lang/Integer
     intValue  
Calculator Code LineNumberTable LocalVariableTable this LCalculator; multiply (Ljava/util/List;)I numbers Ljava/util/List; firstNumber I secondNumber result LocalVariableTypeTable %Ljava/util/List<Ljava/lang/Integer;>; StackMapTable 	Signature ((Ljava/util/List<Ljava/lang/Integer;>;)I 
SourceFile Calculator.java !               /     *� �             !        " #    $ %     �     8+�  � � Y� �+�  � � =+�  � � >h6�             
   	 " 
 0  5  !   4    8 " #     8 & '  "  ( )  0  * )  5  + )  ,       8 & -  .     /    0  1    2