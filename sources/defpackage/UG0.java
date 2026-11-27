package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UG0 implements MH1 {

    @NotNull
    public final KW1 a;

    public UG0(Function0<? extends MH1> function0) {
        this.a = XO0.b(function0);
    }

    @Override // defpackage.MH1
    @NotNull
    public final String a() {
        return b().a();
    }

    public final MH1 b() {
        return (MH1) this.a.getValue();
    }

    @Override // defpackage.MH1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.MH1
    public final int d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return b().d(name);
    }

    @Override // defpackage.MH1
    public final int e() {
        return b().e();
    }

    @Override // defpackage.MH1
    @NotNull
    public final String f(int i) {
        return b().f(i);
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> g(int i) {
        return b().g(i);
    }

    @Override // defpackage.MH1
    @NotNull
    public final VH1 h() {
        return b().h();
    }

    @Override // defpackage.MH1
    @NotNull
    public final MH1 i(int i) {
        return b().i(i);
    }

    @Override // defpackage.MH1
    public final boolean j(int i) {
        return b().j(i);
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> k() {
        return C5653o60.d;
    }

    @Override // defpackage.MH1
    public final boolean m() {
        return false;
    }
}
