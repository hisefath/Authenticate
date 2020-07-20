# Authentication MERN Stack Web App
A Full stack web development practice with MongoDB, Express.js, React.js, Node.js
A task manager app the builds to do lists with basic crud implementation

## Live Demo
Live Demo will be launched to Heroku by friday night, July 19th, 2020. 

## Project Purpose
The motives behind this are as follow:
 - To use react a bit in a project
 - to use Passport.js and a couple different strategies to authenticate
 - Able to have my own simple modular authentication package that I can ship and use in other projects
 - Establish best practices, good mvc architecture and extera seperations of concerns
 - Have super clean code to show recruiters/interviewers in the future

## Author
**Sefath Chowdhury** - [linkedin](https://www.linkedin.com/in/callmesefath/)

## Built With
* [React](https://reactjs.org/) - The front-end framework used
* [Mongo](https://docs.mongodb.com/manual/) - Mongo DB database
* [NODE](https://nodejs.org/en/) - JavaScript runtime for server and has a package manager (NPM)  
* [Express](https://expressjs.com/) - Web Framework for Node.js
* [Passport](http://www.passportjs.org/) - Authentication Strategies used

## Tools Used
As of July 7th, 2020, the technologies, softwares, and applications used to facilitate this project are as follows:
 - Github (version control)
 - Visual Studio Code (code editor)
 - Rasinets (candy por la energies)

------
------
------
------
------

## DevNotes
*I'm working on a Mac*
But to get started: 
1. This is how my directory and files look now
```
.
├── package-lock.json
├── package.json
├── public
│   ├── index.html
│   └── manifest.json
└── src
    ├── App.jsx
    ├── data
    │   └── index.js
    ├── index.js
    └── res
        ├── amazon.png
        ├── facebook.png
        ├── github.png
        ├── google.png
        ├── instagram.png
        ├── spotify.png
        ├── twitch.png
        └── twitter.png

But in total: 5 directories, 19 files
```

2. Lets install some dependancies 
```
npm install express cors passport passport-facebook passport-google passport-twitch passport-instagram passport-amazon passport-spotify passport-github chalk
```

3. This is us setting up a strategy 
```
//Facebook Strategy
passport.use(new FacebookStrategy({
    clientId: keys.FACEBOOK.clientID,
    clientSecret: keys.FACEBOOK.clientSecret,
    callbackUrl:  '/auth/facebook/callback'
},
    (accessToken, refreshToken, profile, cb) => {
        console.log(chalk.blue(JSON.stringify(profile)));
        user = { ...profile };
        return cb(null, profile);
    }));
```
```
//Facebook Route
app.get('auth/facebook', passport.authenticate('facebook'));
app.get('auth/facebook/callback', 
    passport.authenticate(('facebook'),
        (req, res) => {
           res.redirect("/profile");         
        }));
```

4. Now we need some more dependancies for the front end:
```
npm install @material-ui/core @material-ui/icons lodash react-router react-router-dom
```