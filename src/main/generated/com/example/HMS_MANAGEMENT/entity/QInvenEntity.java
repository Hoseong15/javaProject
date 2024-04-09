package com.example.HMS_MANAGEMENT.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QInvenEntity is a Querydsl query type for InvenEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInvenEntity extends EntityPathBase<InvenEntity> {

    private static final long serialVersionUID = -306961797L;

    public static final QInvenEntity invenEntity = new QInvenEntity("invenEntity");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath idCalss = createString("idCalss");

    public final NumberPath<Integer> itemL = createNumber("itemL", Integer.class);

    public final NumberPath<Integer> itemNm = createNumber("itemNm", Integer.class);

    public QInvenEntity(String variable) {
        super(InvenEntity.class, forVariable(variable));
    }

    public QInvenEntity(Path<? extends InvenEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInvenEntity(PathMetadata metadata) {
        super(InvenEntity.class, metadata);
    }

}

