

var reorderList = function(head) {



  if (head == null || head.next == null) return head;

  //  find the mid

  let mid = (head) => {
    let slow = head;
    let fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }


  //reverse from the middle

  let reverse = (head) => {
    let prev = null;
    let current = head;
    while (current != null) {
      let next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  let res = (head, secondHead) => {
    let firstHead = head;
    while (firstHead != null && secondHead != null) {
      let f = firstHead.next;
      firstHead.next = secondHead;
      firstHead = f;
      let s = secondHead.next;
      secondHead.next = firstHead;
      secondHead = s;
    }


    return head;
  }

  let middle = mid(head);
  let sHead = reverse(middle.next);
  middle.next = null;
  let ans = res(head, sHead);

  return ans;
};

