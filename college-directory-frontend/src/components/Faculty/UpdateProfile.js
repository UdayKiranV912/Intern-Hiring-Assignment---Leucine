import React, { useState } from 'react';
import apiClient from '../../api/apiClient';

const UpdateProfile = () => {
    const [profile, setProfile] = useState({
        name: '',
        department: ''
    });

    const handleSubmit = (e) => {
        e.preventDefault();
        apiClient.put('/faculty/profile', profile)
            .then(response => {
                alert('Profile updated');
            })
            .catch(error => {
                console.error('Error updating profile:', error);
            });
    };

    return (
        <div>
            <h2>Update Profile</h2>
            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    placeholder="Name"
                    value={profile.name}
                    onChange={(e) => setProfile({ ...profile, name: e.target.value })}
                />
                <input
                    type="text"
                    placeholder="Department"
                    value={profile.department}
                    onChange={(e) => setProfile({ ...profile, department: e.target.value })}
                />
                <button type="submit">Update</button>
            </form>
        </div>
    );
};

export default UpdateProfile;
