package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Kp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1391Kp1 extends AbstractC8116zp1 implements InterfaceC3953gF0 {

    @NotNull
    public final AbstractC1235Ip1 a;

    @NotNull
    public final Annotation[] b;

    @Nullable
    public final String c;
    public final boolean d;

    public C1391Kp1(@NotNull AbstractC1235Ip1 type, @NotNull Annotation[] reflectAnnotations, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reflectAnnotations, "reflectAnnotations");
        this.a = type;
        this.b = reflectAnnotations;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.InterfaceC3953gF0
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.InterfaceC3953gF0
    @Nullable
    public final C5638o21 getName() {
        String str = this.c;
        if (str != null) {
            return C5638o21.i(str);
        }
        return null;
    }

    @Override // defpackage.InterfaceC3953gF0
    public final TE0 getType() {
        return this.a;
    }

    @Override // defpackage.WD0
    public final Collection k() {
        return N7.f(this.b);
    }

    @Override // defpackage.WD0
    public final QD0 p(C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return N7.e(this.b, fqName);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1391Kp1.class.getName());
        sb.append(": ");
        sb.append(this.d ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
