public class SortStack{
public static void main(String[] args){
Stack st = new Stack();
        st.push(3);
        st.push(1);
        st.push(2);
        sort(st);
        System.out.println(st);

}

static void sort(Stack s){
if(!s.isEmpty()){
int x = (int)s.pop();
sort(s);
insert(s,x);

}
}

static void insert(Stack s, int x){
if(!s.isEmpty()){
int y = (int)s.peek();  //bottom element   
if(x < y){        //compare with bottom 2nd element, if larger, exchange 
s.pop();
insert(s,x);
s.push(y);
}else{
s.push(x);     
}

}else{
s.push(x);    //add the bottom element
}

}


}
