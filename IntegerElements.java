����   4 G  com/workshop/IntegerElements  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lcom/workshop/IntegerElements; main ([Ljava/lang/String;)V  java/util/ArrayList
  	
    java/lang/Integer   valueOf (I)Ljava/lang/Integer;    java/util/List   add (Ljava/lang/Object;)Z	   " ! java/lang/System # $ out Ljava/io/PrintStream; & java/lang/StringBuilder ( Inserted ArrayList : 
 % *  + (Ljava/lang/String;)V
 % - . / append -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 % 1 2 3 toString ()Ljava/lang/String;
 5 7 6 java/io/PrintStream 8 + println  : ; < remove (I)Ljava/lang/Object; > Output ArrayList :  args [Ljava/lang/String; al Ljava/util/List; LocalVariableTypeTable %Ljava/util/List<Ljava/lang/Integer;>; 
SourceFile IntegerElements.java !               /     *� �    
                    	       �     �� Y� L+
� �  W+� �  W+� �  W+(� �  W+2� �  W� � %Y'� )+� ,� 0� 4+� 9 W+� 9 W� � %Y=� )+� ,� 0� 4�    
   .            ,  8  D  Z  b  j  �         � ? @    y A B  C      y A D   E    F