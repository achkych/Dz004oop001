����   = U
      java/lang/Object <init> ()V  
Calculator
  
      java/lang/Integer valueOf (I)Ljava/lang/Integer;      java/util/List of Z(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;     size ()I
     multiply (Ljava/util/List;)I	    ! " # java/lang/System out Ljava/io/PrintStream;   % & ' makeConcatWithConstants (I)Ljava/lang/String;
 ) * + , - java/io/PrintStream println (Ljava/lang/String;)V / ZСписок должен содержать как минимум два элемента 1 Main Code LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V multiplyResult I args [Ljava/lang/String; 
calculator LCalculator; integerList Ljava/util/List; LocalVariableTypeTable %Ljava/util/List<Ljava/lang/Integer;>; StackMapTable 
SourceFile 	Main.java BootstrapMethods H
 I J K & L $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; N (Результат умножения:  InnerClasses Q %java/lang/invoke/MethodHandles$Lookup S java/lang/invoke/MethodHandles Lookup ! 0           2   /     *� �    3        4        5 6   	 7 8  2   �     E� Y� 	L� 
� 
� 
� 
� M,�  � +,� >� � $  � (� � .� (�    3   "         ' 	 - 
 9  <  D  4   *  -  9 :    E ; <    = = >   ( ? @  A      ( ? B  C    � <    D    E F     G  M O   
  P R T 