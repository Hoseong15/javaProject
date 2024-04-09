package com.example.HMS_MANAGEMENT.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDesignerSchEntity is a Querydsl query type for DesignerSchEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDesignerSchEntity extends EntityPathBase<DesignerSchEntity> {

    private static final long serialVersionUID = -1278714226L;

    public static final QDesignerSchEntity designerSchEntity = new QDesignerSchEntity("designerSchEntity");

    public final EnumPath<com.example.HMS_MANAGEMENT.constent.absence> absence = createEnum("absence", com.example.HMS_MANAGEMENT.constent.absence.class);

    public final StringPath attStatus = createString("attStatus");

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final StringPath DesignerNm = createString("DesignerNm");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final TimePath<java.time.LocalTime> recordTime = createTime("recordTime", java.time.LocalTime.class);

    public final StringPath Remarks = createString("Remarks");

    public final TimePath<java.time.LocalTime> work = createTime("work", java.time.LocalTime.class);

    public final TimePath<java.time.LocalTime> workTime = createTime("workTime", java.time.LocalTime.class);

    public QDesignerSchEntity(String variable) {
        super(DesignerSchEntity.class, forVariable(variable));
    }

    public QDesignerSchEntity(Path<? extends DesignerSchEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDesignerSchEntity(PathMetadata metadata) {
        super(DesignerSchEntity.class, metadata);
    }

}

