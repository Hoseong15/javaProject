package com.example.HMS_MANAGEMENT.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QInvenSortEntity is a Querydsl query type for InvenSortEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInvenSortEntity extends EntityPathBase<InvenSortEntity> {

    private static final long serialVersionUID = -278214215L;

    public static final QInvenSortEntity invenSortEntity = new QInvenSortEntity("invenSortEntity");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath idCalss = createString("idCalss");

    public final NumberPath<Integer> itemL = createNumber("itemL", Integer.class);

    public final NumberPath<Integer> itemNm = createNumber("itemNm", Integer.class);

    public QInvenSortEntity(String variable) {
        super(InvenSortEntity.class, forVariable(variable));
    }

    public QInvenSortEntity(Path<? extends InvenSortEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInvenSortEntity(PathMetadata metadata) {
        super(InvenSortEntity.class, metadata);
    }

}

