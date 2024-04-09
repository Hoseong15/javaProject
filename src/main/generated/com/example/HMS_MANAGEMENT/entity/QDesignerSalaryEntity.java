package com.example.HMS_MANAGEMENT.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDesignerSalaryEntity is a Querydsl query type for DesignerSalaryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDesignerSalaryEntity extends EntityPathBase<DesignerSalaryEntity> {

    private static final long serialVersionUID = -884204294L;

    public static final QDesignerSalaryEntity designerSalaryEntity = new QDesignerSalaryEntity("designerSalaryEntity");

    public final StringPath DesignerNm = createString("DesignerNm");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> salary = createNumber("salary", Integer.class);

    public final DatePath<java.time.LocalDate> salaryDate = createDate("salaryDate", java.time.LocalDate.class);

    public QDesignerSalaryEntity(String variable) {
        super(DesignerSalaryEntity.class, forVariable(variable));
    }

    public QDesignerSalaryEntity(Path<? extends DesignerSalaryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDesignerSalaryEntity(PathMetadata metadata) {
        super(DesignerSalaryEntity.class, metadata);
    }

}

