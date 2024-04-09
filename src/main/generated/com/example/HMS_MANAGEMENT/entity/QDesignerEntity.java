package com.example.HMS_MANAGEMENT.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDesignerEntity is a Querydsl query type for DesignerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDesignerEntity extends EntityPathBase<DesignerEntity> {

    private static final long serialVersionUID = 142552144L;

    public static final QDesignerEntity designerEntity = new QDesignerEntity("designerEntity");

    public final NumberPath<Integer> date = createNumber("date", Integer.class);

    public final StringPath free = createString("free");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> phonNum = createNumber("phonNum", Integer.class);

    public final NumberPath<Integer> salary = createNumber("salary", Integer.class);

    public QDesignerEntity(String variable) {
        super(DesignerEntity.class, forVariable(variable));
    }

    public QDesignerEntity(Path<? extends DesignerEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDesignerEntity(PathMetadata metadata) {
        super(DesignerEntity.class, metadata);
    }

}

