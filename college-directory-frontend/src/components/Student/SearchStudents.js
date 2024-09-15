import React, { useState, useEffect } from 'react';
import apiClient from '../../api/apiClient';

const SearchStudents = () => {
    const [students, setStudents] = useState([]);
    const [searchTerm, setSearchTerm] = useState('');

    useEffect(() => {
        apiClient.get('/students')
            .then(response => {
                setStudents(response.data);
            })
            .catch(error => {
                console.error('Error fetching students:', error);
            });
    }, []);

    return (
        <div>
            <h2>Search Students</h2>
            <input
                type="text"
                placeholder="Search by name"
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
            />
            <ul>
                {students.filter(student => 
                    student.name.toLowerCase().includes(searchTerm.toLowerCase())
                ).map(student => (
                    <li key={student.id}>{student.name}</li>
                ))}
            </ul>
        </div>
    );
};

export default SearchStudents;
