**Purpose** : project of a doubly linked circular list for the exam of Algorithms and Data Structures of University of Florence Computer Science graduate course.


# Dettagli Implementativi
Si chiede di realizzare una _**doppia catena circolare**_.
Si tratta di una struttura simile ad una catena in cui però all'ultimo nodo segue il primo. Ciò rende la struttura circolare.
A differenza di una catena semplice ogni nodo è collegato non solo al suo successivo ma anche a quello precedente (catena doppia).


![DoublyLinkList](https://imagizer.imageshack.com/v2/800x600q90/921/zOQAjx.png)



Ogni nodo della catena doppia circolare deve contenere un'_informazione generica_ e una _chiave intera_, compresa fra 1 e 10^6. Sia la chiave sia l'informazione sono scelte dall'utente al momento dell'inserimento di un nodo.
La struttura può contenere due o più nodi con la stessa chiave o con la stessa informazione ma _non possono esserci nodi identici_.

La struttura deve essere dotata di un nodo distinto, chiamato **HEAD**, che rappresenta il primo nodo effettivo della struttura e contenente una propria informazione e una propria chiave.
Il nodo che segue HEAD sarà quindi il secondo nodo della struttura e quello che precede HEAD sarà invece l'ultimo nodo presente nella doppia catena circolare.

Si assume che gli inserimenti di nuovi nodi avvengano sempre dopo HEAD.
Se, ad esempio, la struttura contenesse il nodo HEAD e un nodo A, volendo inserire un nodo NEW, questo si inserisce fra HEAD e A, in modo che dopo l'inserimento il successivo di HEAD sia NEW e il successivo di NEW sia A.

Sono richiesti metodi, i cui tipi di ritorno e parametri formali dovranno essere scelti in maniera oculata se non indicato esplicitamente, per:

 - calcolare il numero di elementi presenti;
 
 - restituire il primo nodo (HEAD);
 - restituire l'ultimo nodo;
 
 - restituire il nodo i-esimo della struttura (con i compreso fra uno e il numero di nodi presenti, estremi inclusi). 
 Gestire anche il caso in cui l'indice i del nodo cercato sia maggiore del numero di nodi presenti;
 
 - cancellare dalla struttura un nodo con chiave k.
 Se ci fossero più nodi con la stessa chiave k, deve essere cancellato quello più vicino a HEAD.
 Se ci fossero due nodi con la stessa distanza da HEAD, vanno cancellati dalla struttura entrambi. 
 Se il nodo da cancellare fosse HEAD, il nodo distinto divine il secondo (quello che era successivo di HEAD);
 
 - inserire un nodo con informazione x e chiave k. Il primo nodo che deve
 essere ineserito è HEAD (per questo punto è possibile anche fare un metodo separato per l'impostazione di HEAD);
 
 - restituire la **stringa S** nel formato _[x1,k1],[x2,k2],...,[xN,kN]_ dove, se N è il numero di nodi presenti, **xI** e **kI** sono _informazione_ e _chiave intera_ del nodo I-esimo (rispettivamente), per I=1,2,...,N. 
 Il nodo descritto da _[x1,k1]_ deve essere HEAD;
 
 - restituire la **stringa S'** che sia l'ordinamento di S (vedi metodo precedente) secondo le chiavi dei nodi in _senso crescente_, rispettando l'ordine di apparizione in S di quei nodi che abbiano la stessa chiave.
 
Deve inoltre essere possibile ricercare un nodo tramite la sua chiave.
Per questo scopo si richiede un metodo che restituisca la stringa che rappresenta il nodo. Se ci fossero più nodi con la stessa chiave, deve essererestituita la stringa relativa al nodo più vicino a HEAD. 
Se ci fossero due nodi con la stessa chiave e la stessa distanza da HEAD, la stringa deve riportare le descrizioni di entrambi i nodi (**es**. [xI,k],[xJ,k]).

Deve essere gestito anche il caso in cui il nodo cercato non sia presente.
 
### Osservazioni
Si suggerisce di implementare una classe per il nodo e una per la struttura, dotandole di opportune variabili per gli scopi descritti sopra.
Se la struttura contenesse un solo nodo (HEAD), il successivo e il precedente sono HEAD stesso.
Potranno essere necessari più metodi per realizzare le operazioni richieste.
Non è richiesto un metodo main ma potrà esserlo durante la discussione.

