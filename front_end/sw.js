self.addEventListener('push', function (e) {
  const body = e.data.json();
  console.log(e)
  var options = {
    body:"Notification test"
  };
  self.clients.matchAll().then(clients => {
    clients.forEach(client => client.postMessage({
      msg: body,
      // data: body.sub
    }));
  })
  // e.waitUntil(
  //   self.registration.showNotification(body.message, options),
  // );
});
