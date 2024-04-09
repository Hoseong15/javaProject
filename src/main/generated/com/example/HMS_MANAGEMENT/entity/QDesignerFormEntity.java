package com.example.HMS_MANAGEMENT.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDesignerFormEntity is a Querydsl query type for DesignerFormEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDesignerFormEntity extends EntityPathBase<DesignerFormEntity> {

    private static final long serialVersionUID = 1564246964L;

    public static final QDesignerFormEntity designerFormEntity = new QDesignerFormEntity("designerFormEntity");

    public final StringPath customerNm = createString("customerNm");

    public final StringPath cuts = createString("cuts");

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> time = createDateTime("time", java.time.LocalDateTime.class);

    public QDesignerFormEntity(String variable) {
        super(DesignerFormEntity.class, forVariable(variable));
    }

    public QDesignerFormEntity(Path<? extends DesignerFormEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDesignerFormEntity(PathMetadata metadata) {
        super(DesignerFormEntity.class, metadata);
    }

}

