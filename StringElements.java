����   4 K  com/workshop/StringElements  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lcom/workshop/StringElements; main ([Ljava/lang/String;)V  java/util/ArrayList
  	  Vamshi    java/util/List   add (Ljava/lang/Object;)Z  Venktesh  Rakesh   Prakash " Om	 $ & % java/lang/System ' ( out Ljava/io/PrintStream; * java/lang/StringBuilder , Inserted ArrayList : 
 ) .  / (Ljava/lang/String;)V
 ) 1 2 3 append -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 ) 5 6 7 toString ()Ljava/lang/String;
 9 ; : java/io/PrintStream < / println  > ? @ remove (I)Ljava/lang/Object; B Output ArrayList :  args [Ljava/lang/String; name Ljava/util/List; LocalVariableTypeTable $Ljava/util/List<Ljava/lang/String;>; 
SourceFile StringElements.java !               /     *� �    
                    	       �     r� Y� L+�  W+�  W+�  W+�  W+!�  W� #� )Y+� -+� 0� 4� 8+� = W+� = W� #� )YA� -+� 0� 4� 8�    
   .    
       #  ,  5  K  S  [  q         r C D    j E F  G      j E H   I    J