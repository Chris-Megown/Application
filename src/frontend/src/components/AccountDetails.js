import React, { useState, useEffect } from 'react';
import axios from 'axios';

const AccountDetails = () => {
  const [account, setAccount] = useState(null);

  useEffect(() => {
    axios.get('/api/account', { withCredentials: true })
      .then(response => setAccount(response.data))
      .catch(error => console.error('Error fetching account details:', error));
  }, []);

  if (!account) return <div>Loading...</div>;

  return (
    <div>
      <h2>Account Details</h2>
      <p>Account Number: {account.accountNumber}</p>
      <p>Name: {account.name}</p>
      <p>Balance: ${account.balance}</p>
    </div>
  );
};

export default AccountDetails;