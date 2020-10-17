package project4;

/**
 * Design an ADT Address book that can be used to maintain contact information of friends and families.
 * and two references, one for each of the node's children.
 * @author Naganobu Masuda
 * @version 1.0
 */
public class BinarySearchTree<E extends Comparable<E>> extends BaseBinaryTree<E>{
	
	public BinarySearchTree(){
		super();
	}
	
	public BinarySearchTree(E rootItem){
		super(rootItem);
	}
	
	public BinarySearchTree(E rootItem, E leftTree, E rightTree){
		super(rootItem);
		this.insert(leftTree);
		this.insert(rightTree);
	}
	
	public BinarySearchTree(TreeNode<E> rootNode){
		this.root = rootNode;
	}

	/**
	 * changes the root element of this binary tree
	 * @param value A reference to the new root
	 * @throws  UnsupportedOperationException if operation is not supported.
	 */
	public void setRoot(E value) throws UnsupportedOperationException {
		if(!isEmpty()){
			this.root.setElement(value);
		}else{
			this.root = new TreeNode<E>(value, null, null);
		}
	}
	
	/**
	 * searches the item of the address book
	 * @param The name of item
	 * @return The name of item
	 */
    public boolean search(E sear){
    	return search(this.root, sear);
    }
    
    public boolean search(TreeNode<E> root, E sear) throws TreeException{
    	if(isEmpty()){
    		throw new TreeException("TreeException: Empty tree");
    	}else if(sear.compareTo(root.getElement()) == 0){
           	return true;
    	}else{
    		if(sear.compareTo(root.getElement()) < 0){
    			return search(root.getLeft(), sear);
    		}else{
    			return search(root.getRight(), sear);
    		}
    	}
    }
	
	/**
	 * adds an item to the end of the address book
	 * @param The name of item
	 */
    public void insert(E item){
        if(isEmpty()){
            this.root = new TreeNode<E>(item, null, null);
        }else{
            insert(root, item);
        }
    }

    public void insert(TreeNode<E> root, E item) throws TreeException{
    	if(isEmpty()){
    		throw new TreeException("TreeException: Empty tree");
    	}else if(item.compareTo(root.getElement()) < 0){
        	if(root.getLeft() == null){
        		root.setLeft(new TreeNode<E>(item, null, null));
        	}else{
                insert(root.getLeft(), item);
            }
        }else{
            if(root.getRight() == null){
            	root.setRight(new TreeNode<E>(item, null, null));
            }else{
                insert(root.getRight(), item);
            }
        }
    }

	/**
	 * removes the item of the address book
	 * @param The name of item
	 */
    public void delete(E del) throws TreeException{
       delete(this.root, del);
    }
    
    public void delete(TreeNode<E> root, E del) throws TreeException{
       if (isEmpty()){
    	   throw new TreeException("TreeException: Empty tree");
       }else if(del.compareTo(root.getElement()) < 0){
    	   delete(root.getLeft(), del);
       }else if(del.compareTo(root.getElement()) > 0){
    	   delete(root.getRight(), del);
       }else{
    	   if(root.getLeft() == null && root.getRight() == null){
    		   root.setElement(null);
    	   }else if(root.getLeft() != null && root.getRight() == null){
    		   root.setElement(root.getLeft().getElement());
    	   }else if(root.getLeft() == null && root.getRight() != null){
    		   root.setElement(root.getRight().getElement());
    	   }
       }
    }

    public TreeIterator<E> iterator(){
    	return new TreeIterator<E>(this);
    }
    
    TreeIterator<E> it = new TreeIterator<E>(this);
	public int size() {
		int count = 0;
		while(it.hasNext()){
			count++;
		}
		return count;
	}

	/**
	 * returns the item of the address book
	 * @param The name of item
	 * @return The name of item
	 */
	public E get(E value) {
		return value;
	}
}