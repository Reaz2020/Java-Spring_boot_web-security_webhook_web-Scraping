package com.practise.myapp;

public class course {

int id;
String name;

course(int id,String name){
    this.id=id;
    this.name=name;

}

@Override
public String toString() {
    return "course [id=" + id + ", name=" + name + "]";
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}



}
