package org.group4.board.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -350264048L;

    public static final QBoard board = new QBoard("board");

    public final org.group4.global.entities.QBaseMemberEntity _super = new org.group4.global.entities.QBaseMemberEntity(this);

    public final StringPath bId = createString("bId");

    public final StringPath bName = createString("bName");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    public QBoard(String variable) {
        super(Board.class, forVariable(variable));
    }

    public QBoard(Path<? extends Board> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoard(PathMetadata metadata) {
        super(Board.class, metadata);
    }

}

