package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: u92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6926u92<Target> extends AbstractC3897g0<Target, Integer> {

    @NotNull
    public final C6833tj1 a;
    public final int b;
    public final int c;

    @NotNull
    public final String d;

    @Nullable
    public final Integer e;

    @Nullable
    public final InterfaceC0805Dc0<Target> f;
    public final int g;

    public C6926u92(C6833tj1 accessor, int i, int i2, C5662o81.c cVar, int i3) {
        int i4;
        String name = accessor.a.getName();
        Integer num = (i3 & 16) != 0 ? null : 0;
        cVar = (i3 & 32) != 0 ? null : cVar;
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = accessor;
        this.b = i;
        this.c = i2;
        this.d = name;
        this.e = num;
        this.f = cVar;
        if (i2 < 10) {
            i4 = 1;
        } else if (i2 < 100) {
            i4 = 2;
        } else {
            if (i2 >= 1000) {
                throw new IllegalArgumentException(C1332Jw.a(i2, "Max value ", " is too large"));
            }
            i4 = 3;
        }
        this.g = i4;
    }

    @Override // defpackage.InterfaceC0883Ec0
    public final Object a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC0883Ec0
    @NotNull
    public final InterfaceC6475s2<Target, Integer> b() {
        return this.a;
    }

    @Override // defpackage.InterfaceC0883Ec0
    @Nullable
    public final InterfaceC0805Dc0<Target> c() {
        return this.f;
    }

    @Override // defpackage.InterfaceC0883Ec0
    @NotNull
    public final String getName() {
        return this.d;
    }
}
