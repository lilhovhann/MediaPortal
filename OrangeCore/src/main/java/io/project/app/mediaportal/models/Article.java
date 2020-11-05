package io.project.app.mediaportal.models;

import java.io.Serializable;
import java.util.Date;
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
public class Article implements Serializable {

    private static final long serialVersionUID = 5457306871064654513L;

    @Id
    private String id;

    private String title;
    private String header;
    private String content;
    private String category; //sport, music, news...
    private String status; //published, draft
    private String viewCount; //each time then user open article count will increased once,
    private String publisherId;
    private Date publishDate;

}
