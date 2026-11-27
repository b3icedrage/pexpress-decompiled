package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Ak1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0596Ak1 {
    public static final C0596Ak1 c = new C0596Ak1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final C4424iW0 a = new C4424iW0();

    public final <T> InterfaceC7779yD1<T> a(Class<T> cls) {
        InterfaceC7779yD1<T> interfaceC7779yD1R;
        Class<?> cls2;
        XB0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        InterfaceC7779yD1<T> interfaceC7779yD1 = (InterfaceC7779yD1) concurrentHashMap.get(cls);
        if (interfaceC7779yD1 != null) {
            return interfaceC7779yD1;
        }
        C4424iW0 c4424iW0 = this.a;
        c4424iW0.getClass();
        Class<?> cls3 = HD1.a;
        if (!AbstractC0595Ak0.class.isAssignableFrom(cls) && (cls2 = HD1.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        AZ0 az0A = c4424iW0.a.a(cls);
        if (!az0A.a()) {
            boolean zIsAssignableFrom = AbstractC0595Ak0.class.isAssignableFrom(cls);
            EnumC7468wk1 enumC7468wk1 = EnumC7468wk1.d;
            if (zIsAssignableFrom) {
                interfaceC7779yD1R = az0A.c() == enumC7468wk1 ? PZ0.r(az0A, C6485s41.b, EQ0.b, HD1.d, C1971Sa0.a, CW0.b) : PZ0.r(az0A, C6485s41.b, EQ0.b, HD1.d, null, CW0.b);
            } else if (az0A.c() == enumC7468wk1) {
                InterfaceC5646o41 interfaceC5646o41 = C6485s41.a;
                EQ0.a aVar = EQ0.a;
                M82<?, ?> m82 = HD1.b;
                AbstractC1659Oa0<?> abstractC1659Oa0 = C1971Sa0.b;
                if (abstractC1659Oa0 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC7779yD1R = PZ0.r(az0A, interfaceC5646o41, aVar, m82, abstractC1659Oa0, CW0.a);
            } else {
                interfaceC7779yD1R = PZ0.r(az0A, C6485s41.a, EQ0.a, HD1.c, null, CW0.a);
            }
        } else if (AbstractC0595Ak0.class.isAssignableFrom(cls)) {
            interfaceC7779yD1R = new RZ0<>(HD1.d, C1971Sa0.a, az0A.b());
        } else {
            M82<?, ?> m83 = HD1.b;
            AbstractC1659Oa0<?> abstractC1659Oa1 = C1971Sa0.b;
            if (abstractC1659Oa1 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            interfaceC7779yD1R = new RZ0<>(m83, abstractC1659Oa1, az0A.b());
        }
        InterfaceC7779yD1<T> interfaceC7779yD2 = (InterfaceC7779yD1) concurrentHashMap.putIfAbsent(cls, interfaceC7779yD1R);
        return interfaceC7779yD2 != null ? interfaceC7779yD2 : interfaceC7779yD1R;
    }
}
