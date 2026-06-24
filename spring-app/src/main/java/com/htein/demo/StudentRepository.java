package com.htein.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // CRUD functions တွေကို အလိုအလျောက် ရရှိမှာဖြစ်ပါတယ်
}