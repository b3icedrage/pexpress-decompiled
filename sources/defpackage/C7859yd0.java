package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7859yd0 {

    /* JADX INFO: renamed from: yd0$a */
    public /* synthetic */ class a extends AbstractC1295Jj1 {
        public static final a l = new a();

        @Override // defpackage.LJ0
        public final Object get(Object obj) {
            return ((QC) obj).e();
        }

        @Override // defpackage.AbstractC1568Mx, defpackage.JI0
        public final String getName() {
            return "outerClassId";
        }

        @Override // defpackage.AbstractC1568Mx
        public final InterfaceC5486nJ0 j() {
            return C2017Sp1.a.b(QC.class);
        }

        @Override // defpackage.AbstractC1568Mx
        public final String o() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    @Nullable
    public static final FC a(@NotNull S01 s01, @NotNull QC classId) {
        Intrinsics.checkNotNullParameter(s01, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        InterfaceC5044lD interfaceC5044lDB = b(s01, classId);
        if (interfaceC5044lDB instanceof FC) {
            return (FC) interfaceC5044lDB;
        }
        return null;
    }

    @Nullable
    public static final InterfaceC5044lD b(@NotNull S01 s01, @NotNull QC classId) {
        Intrinsics.checkNotNullParameter(s01, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Q01<InterfaceC2446Xs1> q01 = C2524Ys1.a;
        Intrinsics.checkNotNullParameter(s01, "<this>");
        InterfaceC2446Xs1 interfaceC2446Xs1 = (InterfaceC2446Xs1) s01.g0(C2524Ys1.a);
        S01 s01A = interfaceC2446Xs1 != null ? interfaceC2446Xs1.a() : null;
        if (s01A == null) {
            InterfaceC5752ob1 interfaceC5752ob1A0 = s01.A0(classId.a);
            List<C5638o21> listE = classId.b.a.e();
            Intrinsics.checkNotNullExpressionValue(listE, "pathSegments(...)");
            QY0 qy0V = interfaceC5752ob1A0.v();
            Object objF = CollectionsKt.F(listE);
            Intrinsics.checkNotNullExpressionValue(objF, "first(...)");
            InterfaceC5044lD interfaceC5044lDF = ((AbstractC3062c1) qy0V).f((C5638o21) objF, S41.k);
            if (interfaceC5044lDF != null) {
                for (C5638o21 c5638o21 : listE.subList(1, listE.size())) {
                    if (interfaceC5044lDF instanceof FC) {
                        QY0 qy0E0 = ((FC) interfaceC5044lDF).E0();
                        Intrinsics.checkNotNull(c5638o21);
                        InterfaceC5044lD interfaceC5044lDF2 = qy0E0.f(c5638o21, S41.k);
                        interfaceC5044lDF = interfaceC5044lDF2 instanceof FC ? (FC) interfaceC5044lDF2 : null;
                        if (interfaceC5044lDF != null) {
                        }
                    }
                }
                return interfaceC5044lDF;
            }
        } else {
            InterfaceC5752ob1 interfaceC5752ob1A1 = s01A.A0(classId.a);
            C1758Ph0 c1758Ph0 = classId.b;
            List<C5638o21> listE2 = c1758Ph0.a.e();
            Intrinsics.checkNotNullExpressionValue(listE2, "pathSegments(...)");
            QY0 qy0V2 = interfaceC5752ob1A1.v();
            Object objF2 = CollectionsKt.F(listE2);
            Intrinsics.checkNotNullExpressionValue(objF2, "first(...)");
            InterfaceC5044lD interfaceC5044lDF3 = ((AbstractC3062c1) qy0V2).f((C5638o21) objF2, S41.k);
            if (interfaceC5044lDF3 == null) {
                interfaceC5044lDF3 = null;
                break;
            }
            for (C5638o21 c5638o22 : listE2.subList(1, listE2.size())) {
                if (interfaceC5044lDF3 instanceof FC) {
                    QY0 qy0E1 = ((FC) interfaceC5044lDF3).E0();
                    Intrinsics.checkNotNull(c5638o22);
                    InterfaceC5044lD interfaceC5044lDF4 = qy0E1.f(c5638o22, S41.k);
                    interfaceC5044lDF3 = interfaceC5044lDF4 instanceof FC ? (FC) interfaceC5044lDF4 : null;
                    if (interfaceC5044lDF3 != null) {
                    }
                }
                interfaceC5044lDF3 = null;
            }
            if (interfaceC5044lDF3 != null) {
                return interfaceC5044lDF3;
            }
            InterfaceC5752ob1 interfaceC5752ob1A2 = s01.A0(classId.a);
            List<C5638o21> listE3 = c1758Ph0.a.e();
            Intrinsics.checkNotNullExpressionValue(listE3, "pathSegments(...)");
            QY0 qy0V3 = interfaceC5752ob1A2.v();
            Object objF3 = CollectionsKt.F(listE3);
            Intrinsics.checkNotNullExpressionValue(objF3, "first(...)");
            InterfaceC5044lD interfaceC5044lDF5 = ((AbstractC3062c1) qy0V3).f((C5638o21) objF3, S41.k);
            if (interfaceC5044lDF5 != null) {
                for (C5638o21 c5638o23 : listE3.subList(1, listE3.size())) {
                    if (interfaceC5044lDF5 instanceof FC) {
                        QY0 qy0E2 = ((FC) interfaceC5044lDF5).E0();
                        Intrinsics.checkNotNull(c5638o23);
                        InterfaceC5044lD interfaceC5044lDF6 = qy0E2.f(c5638o23, S41.k);
                        interfaceC5044lDF5 = interfaceC5044lDF6 instanceof FC ? (FC) interfaceC5044lDF6 : null;
                        if (interfaceC5044lDF5 != null) {
                        }
                    }
                }
                return interfaceC5044lDF5;
            }
        }
        return null;
    }

    @NotNull
    public static final FC c(@NotNull S01 s01, @NotNull QC classId, @NotNull G51 notFoundClasses) {
        Intrinsics.checkNotNullParameter(s01, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        FC fcA = a(s01, classId);
        return fcA != null ? fcA : notFoundClasses.a(classId, JH1.p(JH1.m(FH1.e(classId, a.l), QB.g)));
    }
}
