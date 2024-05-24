package board;

import lombok.Data;

import java.time.LocalDateTime;

/*SEQ NUMBER(10) PRIMARY KEY,
POSTER VARCHAR2(30) NOT NULL,
SUBJECT VARCHAR2(100) NOT NULL,
CONTENT CLOB NOT NULL,
REG_DT DATE DEFAULT SYSDATE,
MOD_DT DATE*/
@Data
public class Board {
    private long number;
    private String poster;
    private String subject;
    private String content;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
