package io.project.app.mediaportal.models;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author lilith
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Document(collection = "orange_account")
public class Account implements Serializable {

    private static final long serialVersionUID = 5457306871064654513L;

    @Id
    private String id;
    
    private String name;
    private String email;
    private String password;
    private String role; //publisher, editor

}
