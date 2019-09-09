/**
 * Copyright &copy; 2015-2020 <a href="">softd</a> All rights reserved.
 */

package com.cobee.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author cobee
 * @since 2019/9/9
 */
@Data
// 是否是链式操作
@Accessors(chain = false)
@Builder
public class Student {

    private String name;
    private Integer age;

    public static void main(String[] args) {
        Student student = Student.builder().age(18).name("cobee").build();
        System.out.println(student);
    }

}
