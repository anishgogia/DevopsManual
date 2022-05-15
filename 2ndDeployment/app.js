const express = require('express');

const app = express();

app.get('/', (req, res) => {
    res.send(`
    <h1>Hello from Anish Gogia </h1>
    <p>19csu029 npm</p>
    <p>this is another data</p>
    `);
});

app.get('/error', (req, res) => {
    process.exit(1);
})

app.listen(8080);