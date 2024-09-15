import React, { useState, useEffect } from 'react';
import apiClient from '../../api/apiClient';

const StudentProfile = () => {
    const [profile, setProfile] = useState({});

    useEffect(() => {
        apiClient.get('/students/profile')
            .then(response => {
                setProfile(response.data);
            })
            .catch(error => {
                console.error('Error fetching student profile:', error);
            });
    }, []);

    return (
        <div>
            <h2>Student Profile</h2>
            <p>Name: {profile.name}</p>
            <p>Major: {profile.major}</p>
        </div>
    );
};

export default StudentProfile;
