package com.example.HMS_MANAGEMENT.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QInvenBuyEntity is a Querydsl query type for InvenBuyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInvenBuyEntity extends EntityPathBase<InvenBuyEntity> {

    private static final long serialVersionUID = -1165038479L;

    public static final QInvenBuyEntity invenBuyEntity = new QInvenBuyEntity("invenBuyEntity");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath idCalss = createString("idCalss");

    public final NumberPath<Integer> itemL = createNumber("itemL", Integer.class);

    public final NumberPath<Integer> itemNm = createNumber("itemNm", Integer.class);

    public QInvenBuyEntity(String variable) {
        super(InvenBuyEntity.class, forVariable(variable));
    }

    public QInvenBuyEntity(Path<? extends InvenBuyEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInvenBuyEntity(PathMetadata metadata) {
        super(InvenBuyEntity.class, metadata);
    }

}

