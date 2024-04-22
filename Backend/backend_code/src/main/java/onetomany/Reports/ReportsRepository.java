package onetomany.Reports;

import onetomany.Users.User;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ReportsRepository extends JpaRepository<Reports, Long>{
    Reports findById(int id);
    Reports findByReport(String report);

}
