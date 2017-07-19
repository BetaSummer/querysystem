package betahouse.repository;

import betahouse.model.CountProvince;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Yxm on 2017/7/19.
 */
public interface CountProvinceRepo extends JpaRepository<CountProvince, Integer> {
    @Query("select c from CountProvince c where c.ProvinceName = :ProvinceName")
    CountProvince findByProvinceName(@Param("ProvinceName")String provinceName);
}
