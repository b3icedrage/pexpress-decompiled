package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1079Gp1 extends AbstractC1235Ip1 implements GE0 {

    @NotNull
    public final Class<?> a;

    @NotNull
    public final C5653o60 b;

    public C1079Gp1(@NotNull Class<?> reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.a = reflectType;
        this.b = C5653o60.d;
    }

    @Override // defpackage.AbstractC1235Ip1
    public final Type O() {
        return this.a;
    }

    @Override // defpackage.GE0
    @Nullable
    public final EnumC6405rh1 getType() {
        Class cls = Void.TYPE;
        Class<?> cls2 = this.a;
        if (Intrinsics.a(cls2, cls)) {
            return null;
        }
        return DI0.e(cls2.getName()).i();
    }

    @Override // defpackage.WD0
    @NotNull
    public final Collection<QD0> k() {
        return this.b;
    }
}
