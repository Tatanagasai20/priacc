
import React from 'react';
import axios from 'axios';

function App() {
  const applyLeave = () => {
    axios.post('http://localhost:8080/api/apply-leave', {
      employeeId: 1,
      startDate: '2025-07-20',
      endDate: '2025-07-22',
      reason: 'Vacation'
    }).then(res => alert('Leave applied')).catch(err => alert('Error'));
  };

  return (
    <div style={{ padding: 20 }}>
      <h2>Leave Management System</h2>
      <button onClick={applyLeave}>Apply Leave</button>
    </div>
  );
}

export default App;
