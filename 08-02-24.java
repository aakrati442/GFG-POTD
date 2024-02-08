HashSet<Integer> h=new HashSet<Integer>();
	int f=preorder(root,h,0);
	return(f==1)?false:true;
