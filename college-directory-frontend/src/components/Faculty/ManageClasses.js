import React, { useState, useEffect } from 'react';
import apiClient from '../../api/apiClient';

const ManageClasses = () => {
    const [classes, setClasses] = useState([]);

    useEffect(() => {
        apiClient.get('/faculty/classes')
            .then(response => {
                setClasses(response.data);
            })
            .catch(error => {
                console.error('Error fetching classes:', error);
            });
    }, []);

    return (
        <div>
            <h2>Manage Classes</h2>
            <ul>
                {classes.map(cls => (
                    <li key={cls.id}>{cls.name}</li>
                ))}
            </ul>
        </div>
    );
};

export default ManageClasses;
