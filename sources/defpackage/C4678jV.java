package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4678jV {

    @NotNull
    public static final GW a;

    static {
        String property;
        AbstractC8109zn0 abstractC8109zn0;
        int i = C3379dX1.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            RV rv = C6266r20.a;
            AbstractC8109zn0 abstractC8109zn1 = QV0.a;
            abstractC8109zn1.getClass();
            abstractC8109zn0 = !(abstractC8109zn1 instanceof GW) ? RunnableC4420iV.n : abstractC8109zn1;
        } else {
            abstractC8109zn0 = RunnableC4420iV.n;
        }
        a = abstractC8109zn0;
    }
}
