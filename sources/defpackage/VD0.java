package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class VD0 {

    @NotNull
    public static final C5638o21 a;

    @NotNull
    public static final C5638o21 b;

    @NotNull
    public static final C5638o21 c;

    @NotNull
    public static final Object d;

    static {
        C5638o21 c5638o21K = C5638o21.k("message");
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        a = c5638o21K;
        C5638o21 c5638o21K2 = C5638o21.k("allowedTargets");
        Intrinsics.checkNotNullExpressionValue(c5638o21K2, "identifier(...)");
        b = c5638o21K2;
        C5638o21 c5638o21K3 = C5638o21.k(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullExpressionValue(c5638o21K3, "identifier(...)");
        c = c5638o21K3;
        d = PW0.e(new Pair(C4194hP1.a.t, C3333dI0.c), new Pair(C4194hP1.a.w, C3333dI0.d), new Pair(C4194hP1.a.x, C3333dI0.f));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    @Nullable
    public static InterfaceC1987Sf1 a(@NotNull C1758Ph0 kotlinName, @NotNull WD0 annotationOwner, @NotNull LO0 c2) {
        QD0 qd0P;
        Intrinsics.checkNotNullParameter(kotlinName, "kotlinName");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        Intrinsics.checkNotNullParameter(c2, "c");
        if (Intrinsics.a(kotlinName, C4194hP1.a.m)) {
            C1758Ph0 DEPRECATED_ANNOTATION = C3333dI0.e;
            Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            QD0 qd0P2 = annotationOwner.p(DEPRECATED_ANNOTATION);
            if (qd0P2 != null) {
                return new C5471nE0(qd0P2, c2);
            }
        }
        C1758Ph0 c1758Ph0 = (C1758Ph0) d.get(kotlinName);
        if (c1758Ph0 == null || (qd0P = annotationOwner.p(c1758Ph0)) == null) {
            return null;
        }
        return b(qd0P, c2, false);
    }

    @Nullable
    public static InterfaceC1987Sf1 b(@NotNull QD0 annotation, @NotNull LO0 c2, boolean z) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c2, "c");
        QC qcH = annotation.h();
        C1758Ph0 TARGET_ANNOTATION = C3333dI0.c;
        Intrinsics.checkNotNullExpressionValue(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (qcH.equals(QC.a.b(TARGET_ANNOTATION))) {
            return new QE0(annotation, c2);
        }
        C1758Ph0 RETENTION_ANNOTATION = C3333dI0.d;
        Intrinsics.checkNotNullExpressionValue(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (qcH.equals(QC.a.b(RETENTION_ANNOTATION))) {
            return new LE0(annotation, c2);
        }
        C1758Ph0 DOCUMENTED_ANNOTATION = C3333dI0.f;
        Intrinsics.checkNotNullExpressionValue(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (qcH.equals(QC.a.b(DOCUMENTED_ANNOTATION))) {
            return new UD0(c2, annotation, C4194hP1.a.x);
        }
        C1758Ph0 DEPRECATED_ANNOTATION = C3333dI0.e;
        Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (qcH.equals(QC.a.b(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new C6550sO0(annotation, c2, z);
    }
}
