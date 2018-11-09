class HelloUser extends React.Component {
    state;

    componentDidMount() {
        console.log('This: ', this);
        fetch('http://localhost:8080/user?id=1')
            .then(res => res.json())
            .then(res => {
                console.log('Res: ', res);
                this.setState({
                    username: res.username,
                    fullName: res.fullName
                })
            })
    };

    render() {
        console.log('This: ', this);
        return this.state ?
            (
                <div>
                    <h1> Hello, {this.state.username}:
                        {
                            this.state.fullName
                        }
                    </h1>
                </div>
            ):
            (
                < div>
                    <h3> Loading </h3>
                </div>
            );
    }
}

window.HelloUser = HelloUser;
console.log('Hello User: ', HelloUser);
