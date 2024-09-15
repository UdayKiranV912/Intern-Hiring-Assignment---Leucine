import React, { useState, useEffect } from 'react';
import apiClient from '../../api/apiClient';

const ManageRecords = () => {
    const [records, setRecords] = useState([]);

    useEffect(() => {
        apiClient.get('/admin/records')
            .then(response => {
                setRecords(response.data);
            })
            .catch(error => {
                console.error('Error fetching records:', error);
            });
    }, []);

    return (
        <div>
            <h2>Manage Records</h2>
            <ul>
                {records.map(record => (
                    <li key={record.id}>{record.name}</li>
                ))}
            </ul>
        </div>
    );
};

export default ManageRecords;
