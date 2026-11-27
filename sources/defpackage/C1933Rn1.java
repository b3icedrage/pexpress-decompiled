package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Rn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1933Rn1 implements InterfaceC1777Pn1 {

    @NotNull
    public final C6120qK1 a = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);

    @NotNull
    public final Z92 b = new Z92();

    @NotNull
    public final CopyOnWriteArrayList<Function0<Boolean>> c = new CopyOnWriteArrayList<>();

    @Override // defpackage.InterfaceC1777Pn1
    public final void a(@NotNull C0813Df anyDead) {
        Intrinsics.checkNotNullParameter(anyDead, "anyDead");
        this.c.add(anyDead);
    }

    @Override // defpackage.InterfaceC1777Pn1
    public final C6120qK1 b() {
        return this.a;
    }

    @Override // defpackage.InterfaceC1777Pn1
    public final void c() {
        Z92 z92 = this.b;
        synchronized (z92) {
            z92.a = false;
            B41 b41 = z92.b;
            synchronized (b41) {
                b41.a = null;
            }
        }
    }
}
