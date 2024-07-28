package org.example.global.board.controllers.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardData is a Querydsl query type for BoardData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardData extends EntityPathBase<BoardData> {

    private static final long serialVersionUID = -1069524097L;

    public static final QBoardData boardData = new QBoardData("boardData");

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<HashTag, QHashTag> tags = this.<HashTag, QHashTag>createList("tags", HashTag.class, QHashTag.class, PathInits.DIRECT2);

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

