package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Bk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0674Bk1 {
    public static final C0674Bk1 c = new C0674Bk1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final C4214hW0 a = new C4214hW0();

    public final <T> InterfaceC7989zD1<T> a(Class<T> cls) {
        AbstractC1737Pa0<?> abstractC1737Pa0;
        InterfaceC7989zD1<T> interfaceC7989zD1Y;
        Class<?> cls2;
        VB0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        InterfaceC7989zD1<T> interfaceC7989zD1 = (InterfaceC7989zD1) concurrentHashMap.get(cls);
        if (interfaceC7989zD1 != null) {
            return interfaceC7989zD1;
        }
        C4214hW0 c4214hW0 = this.a;
        c4214hW0.getClass();
        Class<?> cls3 = ID1.a;
        if (!AbstractC8097zk0.class.isAssignableFrom(cls) && (cls2 = ID1.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        BZ0 bz0A = c4214hW0.a.a(cls);
        if (bz0A.a()) {
            if (AbstractC8097zk0.class.isAssignableFrom(cls)) {
                interfaceC7989zD1Y = new SZ0<>(ID1.c, C2049Ta0.a, bz0A.b());
            } else {
                N82<?, ?> n82 = ID1.b;
                AbstractC1737Pa0<?> abstractC1737Pa1 = C2049Ta0.b;
                if (abstractC1737Pa1 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC7989zD1Y = new SZ0<>(n82, abstractC1737Pa1, bz0A.b());
            }
        } else if (AbstractC8097zk0.class.isAssignableFrom(cls)) {
            C6275r41 c6275r41 = C6695t41.b;
            GQ0 gq0 = HQ0.b;
            R82 r82 = ID1.c;
            C1893Ra0 c1893Ra0 = bz0A.c().ordinal() != 1 ? C2049Ta0.a : null;
            BW0 bw0 = DW0.b;
            int[] iArr = QZ0.p;
            if (!(bz0A instanceof C2008Sm1)) {
                throw null;
            }
            interfaceC7989zD1Y = QZ0.y((C2008Sm1) bz0A, c6275r41, gq0, r82, c1893Ra0, bw0);
        } else {
            InterfaceC5856p41 interfaceC5856p41 = C6695t41.a;
            FQ0 fq0 = HQ0.a;
            N82<?, ?> n83 = ID1.b;
            if (bz0A.c().ordinal() != 1) {
                AbstractC1737Pa0<?> abstractC1737Pa2 = C2049Ta0.b;
                if (abstractC1737Pa2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                abstractC1737Pa0 = abstractC1737Pa2;
            } else {
                abstractC1737Pa0 = null;
            }
            InterfaceC7835yW0 interfaceC7835yW0 = DW0.a;
            int[] iArr2 = QZ0.p;
            if (!(bz0A instanceof C2008Sm1)) {
                throw null;
            }
            interfaceC7989zD1Y = QZ0.y((C2008Sm1) bz0A, interfaceC5856p41, fq0, n83, abstractC1737Pa0, interfaceC7835yW0);
        }
        InterfaceC7989zD1<T> interfaceC7989zD2 = (InterfaceC7989zD1) concurrentHashMap.putIfAbsent(cls, interfaceC7989zD1Y);
        return interfaceC7989zD2 != null ? interfaceC7989zD2 : interfaceC7989zD1Y;
    }
}
