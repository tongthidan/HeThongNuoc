// const { default: axios } = require("axios");

function urlBase64ToUint8Array(base64String) {
    const padding = "=".repeat((4 - (base64String.length % 4)) % 4);
    const base64 = (base64String + padding)
        .replace(/-/g, "+")
        .replace(/_/g, "/");

    const rawData = window.atob(base64);
    const outputArray = new Uint8Array(rawData.length);

    for (let i = 0; i < rawData.length; ++i) {
        outputArray[i] = rawData.charCodeAt(i);
    }
    return outputArray;
}

addEventListener("load", async () => {
    console.log(Notification.permission);
    let sw = await navigator.serviceWorker.register("sw.js");
});

async function subscribe() {
    try {
        const vapidKeys = {
            publicKey:
                "BDw-gy4bnfibjHBf1aLCyc8AVoz75s3Z1CBjtUdSemnvKTMTENI4hpwjqzLyt2OLfGw6ISSKb5AgA4Qv4P9mIcc",
            privateKey: "VGl5YjPXDDq2BnaxPSNzpQ91f_HMW91e-a2qRpWfOEw",
        };
        const serviceWorker = await navigator.serviceWorker.ready;
        const push = await serviceWorker.pushManager.subscribe({
            userVisibleOnly: true,
            applicationServerKey: urlBase64ToUint8Array(vapidKeys.publicKey),
        });
        const data = {
            'user_id': '63',
            'subscriptions': [JSON.parse(JSON.stringify(push))],
        }
        console.log(data);

        const response = await axios({
            method: "post",
            url: "http://localhost:3000/api/v1/subscriptions/save-subscriptions",
            data
        })
        console.log(response);
        return response;
    } catch (error) {
        console.log(error);
        return error;
    }
}

async function sendNotification() {
    try {
        const dataSendNoti = {
            user_id:"63",
            receiver_id: '70',
            entity_id: '100',
            type_entity_id: '1',
        }

        const response = await axios({
            method: "post",
            url: "http://localhost:3000/api/v1/notifications",
            data: dataSendNoti
        })
        console.log(response.data);
        return response;
    } catch (error) {
        console.log(error);
        return error;
    }
}
function getMessage(){
    const mess = document.getElementById('input').value;
    return mess;
}
navigator.serviceWorker.addEventListener('message', event => {
    console.log(event.data.msg);
    alert(event.data.msg)
  });
  
