package defpackage;

import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: bA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2889bA {
    public static C2030Su a(int i, int i2, EnumC1796Pu enumC1796Pu) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC1796Pu = EnumC1796Pu.d;
        }
        if (i == -2) {
            if (enumC1796Pu != EnumC1796Pu.d) {
                return new C5485nJ(1, enumC1796Pu);
            }
            InterfaceC1733Oz.b.getClass();
            return new C2030Su(InterfaceC1733Oz.a.b);
        }
        if (i == -1) {
            if (enumC1796Pu == EnumC1796Pu.d) {
                return new C5485nJ(1, EnumC1796Pu.e);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == 0) {
            return enumC1796Pu == EnumC1796Pu.d ? new C2030Su(0) : new C5485nJ(1, enumC1796Pu);
        }
        if (i != Integer.MAX_VALUE) {
            return enumC1796Pu == EnumC1796Pu.d ? new C2030Su(i) : new C5485nJ(i, enumC1796Pu);
        }
        return new C2030Su(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }
}
