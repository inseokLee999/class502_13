package org.group4.board.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardData is a Querydsl query type for BoardData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardData extends EntityPathBase<BoardData> {

    private static final long serialVersionUID = -739852070L;

    public static final QBoardData boardData = new QBoardData("boardData");

    public final org.group4.global.entities.QBaseMemberEntity _super = new org.group4.global.entities.QBaseMemberEntity(this);

    public final StringPath author = createString("author");

    public final StringPath content = createString("content");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath title = createString("title");

    public QBoardData(String variable) {
        super(BoardData.class, forVariable(variable));
    }

    public QBoardData(Path<? extends BoardData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardData(PathMetadata metadata) {
        super(BoardData.class, metadata);
    }

}

