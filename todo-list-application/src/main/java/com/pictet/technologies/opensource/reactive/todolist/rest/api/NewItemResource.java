package com.pictet.technologies.opensource.reactive.todolist.rest.api;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

@Data
@Accessors(chain = true)
public class NewItemResource {

    @NotBlank
    private String description;

}
