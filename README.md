# **CarDoc – Auto Mechanic Booking Platform** 🚗🛠

**CarDoc** is a web application that connects car owners with trusted auto mechanics, allowing users to search, compare, and book repair services effortlessly. Built with **Java Spring Boot (backend) and React (frontend)**, CarDoc ensures seamless appointment scheduling, secure authentication, and real-time updates.

---

## 🚀 **Features**
- 🔍 **Find Nearby Mechanics** – Search by location, service type, and ratings.
- 📅 **Appointment Booking** – Schedule and manage service appointments in real-time.
- 🔐 **Secure Authentication** – User login/signup with **Spring Security & JWT**.
- ⭐ **Review & Ratings** – Customers can rate and review mechanics.
- 📌 **Google Maps Integration** – Locate nearby auto repair shops.
- 📧 **Email Notifications** – Get appointment confirmations and reminders.

---

## 🛠 **Tech Stack**
### **Backend:**
- **Java Spring Boot** – RESTful API development
- **Spring Security & JWT** – Secure authentication
- **Hibernate & PostgreSQL** – Database management
- **Spring Mail** – Email notifications
- **Docker & AWS** – Deployment and scalability

### **Frontend:**
- **React.js** – Interactive UI
- **Redux** – State management
- **Tailwind CSS** – Styling
- **Axios** – API communication

---

## 🛀 **Installation & Setup**

### **1. Clone the repository**
```bash
git clone https://github.com/eyasuh/cardoc.git
cd cardoc
```

### **2. Backend Setup (Spring Boot)**
#### **Prerequisites:**
- Install **Java 17+**, **PostgreSQL**, and **Maven**

#### **Steps:**
```bash
cd backend
mvn clean install
mvn spring-boot:run
```
The backend will start at **http://localhost:8080**

### **3. Frontend Setup (React.js)**
#### **Prerequisites:**
- Install **Node.js 18+** and **npm**

#### **Steps:**
```bash
cd frontend
npm install
npm start
```
The frontend will run at **http://localhost:3000**

---

## 📚 **API Endpoints** (Sample)
| Method   | Endpoint                    | Description                      |
|----------|-----------------------------|----------------------------------|
| **POST** | `/api/auth/signup`          | Register a new user              |
| **POST** | `/api/auth/login`           | Authenticate user & generate JWT |
| **GET**  | `/api/mechanics`            | Retrieve a list of mechanics     |
| **POST** | `/api/appointments`         | Book an appointment              |
| **GET**  | `/api/reviews/{mechanicId}` | Get reviews for a mechanic       |

For full API documentation, check the **Swagger UI** at `http://localhost:8080/swagger-ui.html`

---

## 🤝 **Contributing**
Contributions are welcome! Feel free to fork the repo and submit a pull request.

---

## 🐟 **License**
This project is licensed under the **MIT License**.  

