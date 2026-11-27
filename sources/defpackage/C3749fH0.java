package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3749fH0 {
    public static C3120cH0 a(Function1 builderAction) {
        AbstractC5267mG0.a json = AbstractC5267mG0.d;
        Intrinsics.checkNotNullParameter(json, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Intrinsics.checkNotNullParameter(json, "json");
        C6946uG0 c6946uG0 = new C6946uG0();
        C7577xG0 c7577xG0 = json.a;
        c6946uG0.a = c7577xG0.a;
        c6946uG0.b = c7577xG0.e;
        c6946uG0.c = c7577xG0.b;
        c6946uG0.d = c7577xG0.c;
        c6946uG0.e = c7577xG0.d;
        String str = c7577xG0.f;
        c6946uG0.f = str;
        c6946uG0.g = c7577xG0.g;
        c6946uG0.h = c7577xG0.j;
        c6946uG0.i = c7577xG0.h;
        c6946uG0.j = c7577xG0.i;
        c6946uG0.k = json.b;
        builderAction.invoke(c6946uG0);
        if (!Intrinsics.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        boolean z = c6946uG0.a;
        boolean z2 = c6946uG0.c;
        boolean z3 = c6946uG0.d;
        boolean z4 = c6946uG0.e;
        boolean z5 = c6946uG0.i;
        LC lc = c6946uG0.h;
        boolean z6 = c6946uG0.b;
        String str2 = c6946uG0.f;
        String discriminator = c6946uG0.g;
        C7577xG0 configuration = new C7577xG0(z, z2, z3, z4, z6, str2, discriminator, z5, c6946uG0.j, lc);
        WH1 module = c6946uG0.k;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        C3120cH0 c3120cH0 = new C3120cH0(configuration, module);
        if (Intrinsics.a(module, C4383iI1.a)) {
            return c3120cH0;
        }
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        C0581Af1 collector = new C0581Af1();
        module.getClass();
        Intrinsics.checkNotNullParameter(collector, "collector");
        module.e.getClass();
        C6702t60.d.getClass();
        C5443n60.d.getClass();
        module.f.getClass();
        module.g.getClass();
        module.i.getClass();
        return c3120cH0;
    }
}
