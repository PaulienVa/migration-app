package com.openvalue.studentregistration.registration;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegistrationRepository {
}


//@Mapper
//interface UniversityRepository {
//
//    @Select("SELECT * FROM universities;")
//    fun findAll() : List<UniversityDao>
//
//    @Select("SELECT DISTINCT * FROM universities where uni_id = #{uni_id};")
//    fun byUniId(@Param("uni_id") uniId: Int) : UniversityDao
//
//    @Insert("INSERT INTO universities (id, uni_id, \"name\", city, foundation_year) VALUES(default, #{uniId}, #{name}, #{city}, #{foundationYear})")
//    fun save(universityDao: UniversityDao)
//}