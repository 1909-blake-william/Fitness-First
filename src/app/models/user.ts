export class User{
    userId:number;
	username:number;
	userPassword:String;
	firstname:String;
	lastname:String;
	email:String;
	gender:String;
	height:number;
	weight:number;
	considerations:String; 
	userLevel:number;
    userPoints:number;
    
    constructor(userId:number,username:number,userPassword:String,firstname:String,lastname:String,email:String,gender:String,
        height:number,weight:number,considerations:String, userLevel:number,userPoints:number){
            this.userId = userId;
            this.username = username;
            this.userPassword = userPassword;
            this.firstname = firstname;
            this.lastname = lastname;
            this.email = email;
            this.gender = gender;
            this.height = height;
            this.weight = weight;
            this.considerations = considerations; 
            this.userLevel = userLevel;
            this.userPoints = userPoints;
    }
}