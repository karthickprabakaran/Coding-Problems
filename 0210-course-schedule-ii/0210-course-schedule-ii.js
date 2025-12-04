/**
 * @param {number} numCourses
 * @param {number[][]} prerequisites
 * @return {number[]}
 */
var findOrder = function(numCourses, prerequisites) {

    let adjList = new Map();

    for(let i=0;i<numCourses;i++){
        adjList.set(i,[]);
    }
    let inDegree = new Array(numCourses).fill(0);
    // populatin the adj list (preq -> course)
    for(let [course, preq] of prerequisites){
        adjList.get(preq).push(course);
        inDegree[course]++;
    }

    let queue = [];
    let order = [];
    for(let i=0;i<numCourses;i++){
        if(inDegree[i] === 0){
            queue.push(i);
        }
    }

    while(queue.length > 0){
        let cur = queue.shift();
        order.push(cur);
        for(let nei of adjList.get(cur)){
            inDegree[nei]--;
            if(inDegree[nei] === 0){
                queue.push(nei);
            }
        }
    }

   if (numCourses === order.length) return order;

   return [];
};