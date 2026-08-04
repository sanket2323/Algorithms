class Node:
    # this is the node of the linkedlist 
    def __init__(self, data):
        self.data = data
        self.next = None
        
        
class SinglyLinkedList:
    def __init__(self):
        self.head = None
        
    def append(self, data):
        new_node = Node(data)
        
        if self.head is None:
            self.head = new_node 
            return 
        else:
            curr = self.head
            while curr.next:
                curr = curr.next 
            curr.next = new_node 
            
    def print_list(self):
        curr = self.head 
        
        if curr is None:
            print("Linked list is empty")
            return

        else: 
            while curr:
                print(curr.data)
                curr = curr.next
                
    def insert_at_beginning(self,data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        
    def insert_in_middle(self,position,data):
        
        curr = self.head
        if position == 0:
            self.insert_at_beginning(data)
            return
        
        else: 
            count = 0
            prev_node = None
            while curr and count < position:
                prev_node = curr
                curr = curr.next
                count += 1
                new_node = Node(data)
                prev_node.next = new_node
                new_node.next = curr
                
    def delete_head_node(self):
        temp = self.head
        self.head = self.head.next 
        temp.next = None
        
    def delete_node(self,data):
        temp = self.head 
        
        if temp:
            if temp.data == data:
                self.delete_head_node()
                return 
        
            else: 
                found = False
                prev_node = None
                
                while temp:
                    
                    if temp.data == data:
                        found = True 
                        break
                    prev_node = temp 
                    temp = temp.next
                    
                if found:
                    prev_node.next = temp.next 
                    print(f"Node with data {data} deleted")
                    temp.next = None
                    
                else:
                    print("Node not found")
                
            
sl = SinglyLinkedList()
sl.append(10)
sl.append(20)
sl.append(30)
sl.append(40)
sl.print_list()
print("Inserting 5 at the beginning")
sl.insert_at_beginning(5)   
sl.print_list()  

delete_data = 20
print(f"Deleting node with data {delete_data}")
sl.delete_node(delete_data)
sl.print_list()
                
            
  
# this is not efficient way to create a linkedlist, we can create a linkedlist class and add nodes to it.      
# node1 = Node(10)
# node2 = Node(20)
# node3 = Node(30)
# node4 = Node(40)

# node1.next = node2
# node2.next = node3
# node3.next = node4

# print(node1.data)
# print(node1.next.data)
        
    
    