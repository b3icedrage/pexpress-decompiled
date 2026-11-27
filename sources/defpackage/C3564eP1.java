package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3564eP1 {
    public static final QC a(String str) {
        C1758Ph0 c1758Ph0 = C3355dP1.a;
        C1758Ph0 c1758Ph1 = C3355dP1.a;
        C5638o21 c5638o21K = C5638o21.k(str);
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return new QC(c1758Ph1, c5638o21K);
    }

    public static final QC b(String str) {
        C1758Ph0 c1758Ph0 = C3355dP1.a;
        C1758Ph0 c1758Ph1 = C3355dP1.c;
        C5638o21 c5638o21K = C5638o21.k(str);
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return new QC(c1758Ph1, c5638o21K);
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iA = OW0.a(XE.m(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final QC d(C5638o21 c5638o21) {
        C1758Ph0 c1758Ph0 = C3355dP1.a;
        QC qc = C3355dP1.k;
        C1758Ph0 c1758Ph1 = qc.a;
        C5638o21 c5638o21K = C5638o21.k(c5638o21.f().concat(qc.f().f()));
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return new QC(c1758Ph1, c5638o21K);
    }

    public static final void e(String str) {
        C1758Ph0 c1758Ph0 = C3355dP1.a;
        C1758Ph0 packageFqName = C3355dP1.d;
        C5638o21 topLevelName = C5638o21.k(str);
        Intrinsics.checkNotNullExpressionValue(topLevelName, "identifier(...)");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
        C1758Ph0 relativeClassName = C1758Ph0.j(topLevelName);
        Intrinsics.checkNotNullExpressionValue(relativeClassName, "topLevel(...)");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        relativeClassName.d();
    }

    public static final QC f(String str) {
        C1758Ph0 c1758Ph0 = C3355dP1.a;
        C1758Ph0 c1758Ph1 = C3355dP1.b;
        C5638o21 c5638o21K = C5638o21.k(str);
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return new QC(c1758Ph1, c5638o21K);
    }

    public static final QC g(QC qc) {
        C1758Ph0 c1758Ph0 = C3355dP1.a;
        C1758Ph0 c1758Ph1 = C3355dP1.a;
        C5638o21 c5638o21K = C5638o21.k("U".concat(qc.f().f()));
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        return new QC(c1758Ph1, c5638o21K);
    }
}
