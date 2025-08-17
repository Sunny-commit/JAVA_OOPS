\
#include<stdio.h>
#include<stdlib.h>
struct node{
	struct node*prev;
	int data;
	struct node*next;
}*start,*p,*end,*temp,*start1,*start2;

struct node *newnode(struct node*temp);
void creation();
void traverse();

void insert_beg();
void insert_end();
void insert_pos();
void delete_beg();
void delete_end();
void delete_pos();
void reverse();
void sorting();
void concatenation();
struct node*creation1(struct node*start);

int main(){
	int choose,choice;
	choose=1;

	while(choose){
			printf("1)creation\n 2)insertion at beginning \n 3)insertion at end\n 4)inserion at specific position\n");
			printf("5)deletion at beginning\n 6)deletion at end\n7)deletion at specified position \n");
			 printf("8)reverse\n9)sorting\n10)concatenation\n 11)traversal\n");
			printf("enter operation");
			scanf("%d",&choice);
 	
 	switch(choice){
 		case 1:creation();
 				break;
 		case 2:insert_beg();
 				break;
 		case 3:insert_end();
 				break;
 		case 4:insert_pos();
 				break;
 		case 5:delete_beg();
 				break;
 		case 6:delete_end();
 				break;
 		case 7:delete_pos();
 				break;
 		case 8:reverse();
 				break;
 		case 9:sorting();
 				break;
	case 10:concatenation();
			break;
		case 11:traverse();
				break;
		default:
 				printf("invalid postion \n");
 	
	}
	printf("\n");
	printf("do you want to perform another opetation (1/0) \n");
	scanf("%d",&choose);
	
	
}
}



struct node *newnode(struct node*temp)
{
	temp=(struct node*)malloc(sizeof(struct node));
	printf("enter data");
	scanf("%d",&temp->data);
	temp->prev=NULL;
	temp->next=NULL;
	
	return temp;
}
void creation(){
	int choose;
	choose=1;
	while(choose){
	
	temp=newnode(temp);
	
	
	if(start==NULL)
	{
		start=temp;
		end=temp;
	}
	else
	{ 
		end->next=temp;
		temp->prev=end;
		end=temp;
		
	}
	printf("do you want to create another node (1/0) \n");
	scanf("%d",&choose);
	
	
}
traverse();

	
}

void traverse(){
	if(start==NULL)
	{
		printf("linked list is empty \n");
	}
	else
	{   
		printf("printing linked list \n");
		p=start;
	while(p!=NULL){
	
		printf("%d ",p->data);
		p=p->next;
		
	}
	
}
}

void insert_beg(){
	
temp=newnode(temp);
	
	if(start==NULL){
		start=temp;
		end=temp;
	}
	else{
		temp->next=start;
		start->prev=temp;
		start=temp;
	}
	
	traverse();
	

	
}

void insert_end(){
	temp=newnode(temp);
	
	if(start==NULL){
		start=temp;
		end=temp;
	}
	else{
		end->next=temp;
		temp->prev=end;
		temp=end;
	}
	
	traverse();
	
	
}


void insert_pos(){
	int pos,count;
	count=0;
	

	
	if(start==NULL){
		temp=newnode(temp);
		start=temp;
		end=temp;	
	}
	else{
		p=start;
		while(p!=NULL){
			count=count+1;
			p=p->next;
		}
		printf("enter position");
		scanf("%d",&pos);
		if(pos>0 && pos<=count+1){
				if(pos==1){
					insert_beg();
				}
				else if(pos==count+1){
					insert_end();
				}
				else{
					temp=newnode(temp);
					int i;
					p=start;
					for(i=1;i<pos-1;i++){
						p=p->next;
					}
					p->next->prev=temp;
					temp->next=p->next;
					p->next=temp;
					temp->prev=p;
					
					
				}
				
		}
		else{
			printf("invalid position \n");
		}
		
		
	}
	traverse();
	
}

void delete_beg(){
	
	if(start==NULL)
	{
		printf("linked list is empty \n");
	}
	else if(start->next==NULL)
	{
		temp=start;
		start=end=NULL;
		free(temp);
	}
	else
	{
		temp=start;
		start=start->next;
		temp->next=NULL;
		temp->prev=NULL;
		free(temp);
	}
	traverse();
	
}

void delete_end(){
	if(start==NULL)
	{
		printf("linked list is empty");
	}
	else if (start->next==NULL)
	{
		temp=start;
		start=end=NULL;
		free(temp);
	}
	else
	{
		p=start;
		while(p->next->next!=NULL)
		{
			p=p->next;
		}
		temp=p->next;
		end=p;
		end->next=NULL;
		temp->prev=NULL;
		temp->next=NULL;
		free(temp);
	}
	traverse();
}

void delete_pos(){
	if(start==NULL)
	{
		printf("linked list is empty \n");
	}
	else if(start->next==NULL)
	{
		temp=start;
		start=end=NULL;
		free(temp);
	}
	else
	{int count,position,i;
		count=0;
		p=start;
		while(p!=NULL){
			count=count+1;
			p=p->next;
			
		}
		printf("enter positon \n");
		scanf("%d",&position);
		if(position>0 && position<=count)
			{
				if(position==1)
				{
					delete_beg();
				}
				else if(position==count)
				{
					delete_end();
				}
				else
				{
					p=start;
					for(i=1;i<position-1;i++)
					{
						p=p->next;
					}
					temp=p->next;
					temp->next->prev=p;
					p->next=temp->next;
					temp->prev=NULL;
					temp->next=NULL;
					free(temp);
				}
			}
			else
			{
				printf("invalid positon \n");
			}
		
	}
	traverse(); 
}
	
void reverse(){
		struct node*p1,*p2,*p3;
		if(start==NULL)
		{
			printf("linked list is empty \n");
		}
		else if(start->next==NULL)
		{
			printf("only one element is present \n");
		}
		else{
			p1=start;
			p2=p1->next;
			p3=p2->next;
			p2->next=p1;
			p1->prev=p2;
			p1->next=NULL;
			while(p3!=NULL)
			{
				p1=p2;
				p2=p3;
				p3=p3->next;
				p2->next=p1;
				p1->prev=p2;
				
			}
			p2->prev=NULL;
			start=p2;
			
		}
		traverse();
	}
	
	
void sorting(){
	struct node*temp1,*temp2;
	int x;
	if(start==NULL){
		printf("linked list is empty");
	}
	else if(start->next==NULL)
	{
		printf("only one element is present");
	}
	else
	{
		for(temp1=start;temp1!=NULL;temp1=temp1->next)
		{
			for(temp2=temp1->next;temp2!=NULL;temp2=temp2->next)
			{
				if(temp1->data>temp2->data)
				{
					x=temp1->data;
					temp1->data=temp2->data;
					temp2->data=x;
				}
				
			}
		}	
	}
	traverse();
}

struct node*creation1(struct node*start){
	
		int choose;
	choose=1;
	while(choose){
	 
	temp=newnode(temp);
	
	
	if(start==NULL)
	{
		start=temp;
		end=temp;
	}
	else
	{ 
		end->next=temp;
		temp->prev=end;
		end=temp;
		
	}
	printf("do you want to create another node (1/0) \n");
	scanf("%d",&choose);
	
	
}
return start;
	
}

void concatenation(){
	//struct node*start1;
	printf("enter first linked list elements \n");
	start1=creation1(start);
	start=NULL;
	
	printf("enter second linked list elements \n");
	start2=creation1(start);

    p=start1;
	   while(p->next!=NULL){
		p=p->next;
	}
	p->next=start2;
	start2->prev=p;
	//start1->prev=p;
	printf("concatenated elements");
	p=start1;
	while(p!=NULL){
		printf("%d",p->data);
		p=p->next;
	}
	
	
}
