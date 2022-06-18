package com.example.hibernateonetoonemapping.Reposetory;

import com.example.hibernateonetoonemapping.Entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserprofileRepository extends JpaRepository<UserProfile,Long>
{
}
