var nodemailer = require('nodemailer');

var transporter = nodemailer.createTransport({
  service: 'gmail',
  auth: {
    user: 'kuttlu27@gmail.com',
    pass: '9788835216'
  }
});

var mailOptions = {
  from: 'kuttlu27@gmail.com',
  to: 'vigneshwaran2795@gmail.com',
  subject: 'Sending Email using Node.js',
  text: 'hi how r u'
};

transporter.sendMail(mailOptions, function(error, info){
  if (error) {
    console.log(error);
  } else {
    console.log('Email sent: ' + info.response);
  }
});