package defpackage;

import kotlin.coroutines.e;

/* JADX INFO: renamed from: fg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3830fg0 {
    public static final HK1 a(InterfaceC6396rf0 interfaceC6396rf0) {
        AbstractC2123Tz abstractC2123Tz;
        InterfaceC6396rf0 interfaceC6396rf0L;
        InterfaceC1733Oz.b.getClass();
        int i = InterfaceC1733Oz.a.b;
        if (1 >= i) {
            i = 1;
        }
        int i2 = i - 1;
        if (!(interfaceC6396rf0 instanceof AbstractC2123Tz) || (interfaceC6396rf0L = (abstractC2123Tz = (AbstractC2123Tz) interfaceC6396rf0).l()) == null) {
            return new HK1(i2, EnumC1796Pu.d, interfaceC6396rf0, e.d);
        }
        EnumC1796Pu enumC1796Pu = abstractC2123Tz.g;
        int i3 = abstractC2123Tz.e;
        if (i3 != -3 && i3 != -2 && i3 != 0) {
            i2 = i3;
        } else if (enumC1796Pu != EnumC1796Pu.d || i3 == 0) {
            i2 = 0;
        }
        return new HK1(i2, enumC1796Pu, interfaceC6396rf0L, abstractC2123Tz.d);
    }
}
