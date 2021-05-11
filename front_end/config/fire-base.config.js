const firebase = require('firebase');

const firebaseConfig = {
    apiKey: "AIzaSyDtlyqZ9uh8wGKBRp138GtpSakjaes213Y",
    authDomain: "testing-project-291f4.firebaseapp.com",
    databaseURL: "https://testing-project-291f4.firebaseio.com",
    projectId: "testing-project-291f4",
    storageBucket: "testing-project-291f4.appspot.com",
    messagingSenderId: "136677426168",
    appId: "1:136677426168:web:1ba07ce462c59fa04e8c0d",
    measurementId: "G-CE7V53FD1T"
  };
firebase.initializeApp(firebaseConfig);

const messaging = firebase.messaging();
messaging.requestPermission()
.then( () => {
    console.log('have permission');
    return messaging.gettoken();
})
.then( token => {
    console.log(token);
})
.catch( err => {
    console.log('Error Occured');
})

 