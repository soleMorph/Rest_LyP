

function cadastrar(){

    fetch("https://localhost:8080/cadastrar",
        {
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({
                
            })
        })
}