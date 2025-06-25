const backendUrl = 'http://localhost:8081';

function showLogin() {
    document.querySelector('.login-container').style.display = 'flex';
    document.querySelector('.crud-container').style.display = 'none';
}

function showCrudOperations(username) {
    document.querySelector('.login-container').style.display = 'none';
    document.querySelector('.crud-container').style.display = 'flex';
    document.getElementById('currentUser').textContent = `Logged in as: ${username}`;
}

async function login() {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    try {
        const response = await fetch(`${backendUrl}/admins?name=${username}&password=${password}`);
        if (!response.ok) throw new Error('Invalid credentials.');

        const admins = await response.json();
        if (admins.length > 0) {
            showCrudOperations(username);
        } else {
            alert('Invalid username or password.');
        }
    } catch (error) {
        alert('Login failed. Please try again.');
    }
}

function logout() {
    showLogin();
}

async function fetchAdmins() {
    try {
        const response = await fetch(`${backendUrl}/admins`);
        if (!response.ok) throw new Error('Network response was not ok.');
        const admins = await response.json();
        const adminList = document.getElementById('adminList');
        adminList.innerHTML = '';
        admins.forEach(admin => {
            const li = document.createElement('li');
            li.textContent = `ID: ${admin.id}, Name: ${admin.name}, Password: ${admin.password}`;
            adminList.appendChild(li);
        });
        adminList.style.display = adminList.style.display === 'none' ? 'block' : 'none';
    } catch (error) {
        console.error('Error fetching admins:', error);
    }
}

async function fetchAdminById() {
    const id = document.getElementById('fetchId').value;
    try {
        const response = await fetch(`${backendUrl}/admins/${id}`);
        if (!response.ok) throw new Error('Network response was not ok.');
        const admin = await response.json();
        document.getElementById('fetchResult').textContent = `ID: ${admin.id}, Name: ${admin.name}, Password: ${admin.password}`;
    } catch (error) {
        console.error('Error fetching admin by ID:', error);
    }
}

async function saveAdmin() {
    const name = document.getElementById('saveName').value;
    const password = document.getElementById('savePassword').value;
    try {
        const response = await fetch(`${backendUrl}/admins`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ name, password })
        });
        if (!response.ok) throw new Error('Network response was not ok.');
        const admin = await response.json();
        alert(`Admin saved with ID: ${admin.id}`);
        fetchAdmins();
    } catch (error) {
        console.error('Error saving admin:', error);
    }
}

async function updateAdmin() {
    const id = document.getElementById('updateId').value;
    const name = document.getElementById('updateName').value;
    const password = document.getElementById('updatePassword').value;
    try {
        const response = await fetch(`${backendUrl}/admins/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ name, password })
        });
        if (!response.ok) throw new Error('Network response was not ok.');
        const admin = await response.json();
        alert(`Admin updated: ID: ${admin.id}, Name: ${admin.name}`);
        fetchAdmins();
    } catch (error) {
        console.error('Error updating admin:', error);
    }
}

async function deleteAdmin() {
    const id = document.getElementById('deleteId').value;
    try {
        const response = await fetch(`${backendUrl}/admins/${id}`, { method: 'DELETE' });
        if (!response.ok) throw new Error('Network response was not ok.');
        alert(`Admin deleted with ID: ${id}`);
        fetchAdmins();
    } catch (error) {
        console.error('Error deleting admin:', error);
    }
}
