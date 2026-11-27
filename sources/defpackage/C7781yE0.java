package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7781yE0 implements InterfaceC6030pu0 {

    @NotNull
    public final Runtime a = Runtime.getRuntime();

    @Override // defpackage.InterfaceC6030pu0
    public final void c(@NotNull C6180qd1 c6180qd1) {
        Runtime runtime = this.a;
        c6180qd1.b = Long.valueOf(runtime.totalMemory() - runtime.freeMemory());
    }

    @Override // defpackage.InterfaceC6030pu0
    public final void a() {
    }
}
